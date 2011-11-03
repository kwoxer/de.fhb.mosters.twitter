package de.fhb.mosters.twitter;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterFunctions {
	protected Twitter twitter;

	public TwitterFunctions() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey("LHwi9Qf9qon1wD44NcDow").setOAuthConsumerSecret("j9Ik9BrGYsFgc96FelojQKMjgN2yoyaIHPbmmvCU")
				.setOAuthAccessToken("122641072-XqSexn2jTuZzXhJFrb3F7WPlE7PRMmB5ZKpOA8e3").setOAuthAccessTokenSecret("qoqIQmmmfELFZwkk1583sr6YnqAEzbIBLNOYhdBklew");
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();
	}

	public Twitter getTwitter() {
		return twitter;
	}


}