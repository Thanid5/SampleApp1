package com.truecorp.nam.test.config;

//@Configuration
//@PropertySource("classpath:config-test.properties")  //Set this for development
//@PropertySource("file:./config/config-test.properties") //Set this for production
public class AppConfig {
	
//	@Value("${app.name}")
	private String appName;

	public String getAppName() {
		return appName;
	}
	

}
