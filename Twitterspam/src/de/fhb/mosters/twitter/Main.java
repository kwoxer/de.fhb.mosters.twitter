package de.fhb.mosters.twitter;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("afaw");
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("*********************")
		  .setOAuthConsumerSecret("******************************************")
		  .setOAuthAccessToken("**************************************************")
		  .setOAuthAccessTokenSecret("******************************************");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		//Twitter twitter = new TwitterFactory().getInstance();
	    Status status = null;
		try {
			status = twitter.updateStatus("kwoxer1");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}

}
