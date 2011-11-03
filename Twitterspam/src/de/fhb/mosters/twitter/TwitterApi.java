package de.fhb.mosters.twitter;

import twitter4j.AccountTotals;
import twitter4j.Twitter;
import twitter4j.Location;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.AccountSettings;
import twitter4j.api.AccountMethods;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterApi {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TwitterFunctions tf = new TwitterFunctions();
		
		try {
			AccountSettings settings = tf.getTwitter().getAccountSettings();
			System.out.println("Sleep time enabled: " + settings.isSleepTimeEnabled());
			System.out.println("Sleep end time: " + settings.getSleepEndTime());
			System.out.println("Sleep start time: " + settings.getSleepStartTime());
			System.out.println("Geo enabled: " + settings.isGeoEnabled());
			System.out.println("Listing trend locations:");
			Location[] locations = settings.getTrendLocations();
			for (Location location : locations) {
				System.out.println(" " + location.getName());
			}
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to get account settings: " + te.getMessage());
			System.exit(-1);
		}
		
		try {
            AccountTotals totals = tf.getTwitter().getAccountTotals();
            System.out.println("Updates: " + totals.getUpdates());
            System.out.println("Followers: " + totals.getFollowers());
            System.out.println("Favorites: " + totals.getFavorites());
            System.out.println("Friends: " + totals.getFriends());
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get account totals: " + te.getMessage());
            System.exit(-1);
        }
	}
}