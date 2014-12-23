package resources;


/**
 * OAuthConstants is where OAuth related constants
 * are set
 */

public class OAuthConstants {


	
	public static final String CONSUMER_KEY 	= "CONSUMER_KEY";
	public static final String CONSUMER_SECRET 	= "CONSUMER_SECRET";
	
	public static final String SCOPE 			= "user";
	
	public static final String ACCESS_URL 		= "https://auth.evida.pt/v2/token/";
	public static final String AUTHORIZE_URL 	= "https://auth.evida.pt/v2/authorize/";
	public static final String USER_URL 		= "https://api.evida.pt/users";
			
	public static final String ENCODING 		= "UTF-8";

	public static final String	OAUTH_CALLBACK_SCHEME	= "x-oauthflow";
	public static final String	OAUTH_CALLBACK_HOST		= "callback";
	public static final String	OAUTH_CALLBACK_URL		= OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;
}