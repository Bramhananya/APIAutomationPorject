package com.mavenproject.apiautomation.utils;

public class PropertyStorage {

	private PropertyStorage() {

	}

	private static final String TEST_PROPERTY_FILE = "config.properties";
	private static final String BROWSER_KEY = "webdriver.driver";
	private static final String LOGIN_USER = "user.login";
	private static final String LOGIN_PASSWORD = "user.password";
	private static final String BASE_URL_KEY = "webdriver.base.url";
	private static final String PATH_TO_CHROME_DRIVER_EXECUTABLE_KEY = "webdriver.chrome.driver";
	private static final String DOWNLOAD_PATH = "download.dir";
	private static final String EXPLICIT_WAIT = "webdriver.timeouts.explicitWait";
	private static final String IMPLICIT_WAIT = "webdriver.timeouts.implicitlywait";
	private static final String OUTLOOK_URL = "outlook.url";
	private static final String OUTLOOK_USERNAME = "mail.outlook.userName";
	private static final String OUTLOOK_PASS = "mail.outlook.password";
	private static final String ENVIRONMENT_KEY = "environment";
	private static final String INPUT_DATA_TYPE = "input.data.type";
	private static final String CREDIT_CARD_TYPE = "credit.cart.type";
	private static final String CREDIT_CARD_NUMBER = "credit.cart.number";
	private static final String CREDIT_CARD_EXPIRATION_MONTH = "credit.cart.expirationMonth";
	private static final String CREDIT_CARD_EXPIRATION_YEAR = "credit.cart.expirationYear";
	private static final String CREDIT_CARD_HOLDERNAME = "credit.cart.cardHolderName";
	private static final String CREDIT_CARD_SECURITYCODE = "credit.cart.securityCode";
	private static final String EXTENT_HTML_REPORT = "extent.html.report";
	private static final String EXTENT_HTML_FIRSTRUN_REPORT = "extent.html.firstrun.report";
	private static final String EXTENT_HTML_RERUN_REPORT = "extent.html.rerun.report";

	private static String readEnvironmentProperty(String key) {
		return PropertyReader.getInstance().getProperty(key, readCommonProperty("config.properties"));
	}

	public static String getEnvironmentKey() {
		if (System.getProperty(ENVIRONMENT_KEY) != null) {
			return System.setProperty(ENVIRONMENT_KEY, System.getProperty(ENVIRONMENT_KEY).trim());
		}
		return readCommonProperty(ENVIRONMENT_KEY).trim();
	}

	private static String readCommonProperty(String key) {
		return PropertyReader.getInstance().getProperty(key, TEST_PROPERTY_FILE);
	}

	public static String getBrowser() {
		return readCommonProperty("browser");
	}

	public static String getPathToChromeDriverExecutable() {
		return readCommonProperty(PATH_TO_CHROME_DRIVER_EXECUTABLE_KEY);
	}

	public static String getDownloadPath() {
		return readCommonProperty(DOWNLOAD_PATH);
	}

	public static String getExplicitWait() {
		return readCommonProperty(EXPLICIT_WAIT);
	}

	public static String getImplicitWait() {
		return readCommonProperty(IMPLICIT_WAIT);
	}

	public static String getOutlokUrl() {
		if (System.getProperty(OUTLOOK_URL) != null) {
			return System.setProperty(OUTLOOK_URL, System.getProperty(OUTLOOK_URL).trim());
		}
		return readCommonProperty(OUTLOOK_URL).trim();
	}

	public static String getOutlookUsername() {
		if (System.getProperty(OUTLOOK_USERNAME) != null) {
			return System.setProperty(OUTLOOK_USERNAME, System.getProperty(OUTLOOK_USERNAME));
		}
		if (EncodeDecodeUtils.isBase64EncriptedText(readEnvironmentProperty(OUTLOOK_USERNAME)))
			return EncodeDecodeUtils.getDecodedText(readEnvironmentProperty(OUTLOOK_USERNAME));
		else
			return readEnvironmentProperty(OUTLOOK_USERNAME);
	}

	public static String getOutlookPassword() {
		if (System.getProperty(OUTLOOK_PASS) != null) {
			return System.setProperty(OUTLOOK_PASS, System.getProperty(OUTLOOK_PASS));
		}
		if (EncodeDecodeUtils.isBase64EncriptedText(readEnvironmentProperty(OUTLOOK_PASS)))
			return EncodeDecodeUtils.getDecodedText(readEnvironmentProperty(OUTLOOK_PASS));
		else
			return readEnvironmentProperty(OUTLOOK_PASS);
	}

	public static String getBaseUrl() {
		return readEnvironmentProperty(BASE_URL_KEY);
	}

	public static String getUsername() {
		if (System.getProperty(LOGIN_USER) != null) {
			return System.setProperty(LOGIN_USER, System.getProperty(LOGIN_USER));
		}
		return readEnvironmentProperty(LOGIN_USER);
	}

	public static String getPassword() {
		if (System.getProperty(LOGIN_PASSWORD) != null) {
			return System.setProperty(LOGIN_PASSWORD, System.getProperty(LOGIN_PASSWORD));
		}
		return readEnvironmentProperty(LOGIN_PASSWORD);
	}

	public static String getInputDataType() {
		if (System.getProperty(INPUT_DATA_TYPE) != null) {
			return System.setProperty(INPUT_DATA_TYPE, System.getProperty(INPUT_DATA_TYPE));
		}
		return readCommonProperty(INPUT_DATA_TYPE);
	}

	public static String getCreditCartType() {
		if (System.getProperty(CREDIT_CARD_TYPE) != null) {
			return System.setProperty(CREDIT_CARD_TYPE, System.getProperty(CREDIT_CARD_TYPE));
		}
		if (EncodeDecodeUtils.isBase64EncriptedText(readEnvironmentProperty(CREDIT_CARD_TYPE)))
			return EncodeDecodeUtils.getDecodedText(readEnvironmentProperty(CREDIT_CARD_TYPE));
		else
			return readEnvironmentProperty(CREDIT_CARD_TYPE);
	}

	public static String getCreditCartNumber() {
		if (System.getProperty(CREDIT_CARD_NUMBER) != null) {
			return System.setProperty(CREDIT_CARD_NUMBER, System.getProperty(CREDIT_CARD_NUMBER));
		}
		if (EncodeDecodeUtils.isBase64EncriptedText(readEnvironmentProperty(CREDIT_CARD_NUMBER)))
			return EncodeDecodeUtils.getDecodedText(readEnvironmentProperty(CREDIT_CARD_NUMBER));
		else
			return readEnvironmentProperty(CREDIT_CARD_NUMBER);
	}

	public static String getCreditCartExpirationMonth() {
		if (System.getProperty(CREDIT_CARD_EXPIRATION_MONTH) != null) {
			return System.setProperty(CREDIT_CARD_EXPIRATION_MONTH, System.getProperty(CREDIT_CARD_EXPIRATION_MONTH));
		}
		return readEnvironmentProperty(CREDIT_CARD_EXPIRATION_MONTH);
	}

	public static String getCreditCartExpirationYear() {
		if (System.getProperty(CREDIT_CARD_EXPIRATION_YEAR) != null) {
			return System.setProperty(CREDIT_CARD_EXPIRATION_YEAR, System.getProperty(CREDIT_CARD_EXPIRATION_YEAR));
		}
		return readEnvironmentProperty(CREDIT_CARD_EXPIRATION_YEAR);
	}

	public static String getCreditCartHoldername() {
		if (System.getProperty(CREDIT_CARD_HOLDERNAME) != null) {
			return System.setProperty(CREDIT_CARD_HOLDERNAME, System.getProperty(CREDIT_CARD_HOLDERNAME));
		}
		return readEnvironmentProperty(CREDIT_CARD_HOLDERNAME);
	}

	public static String getCreditCartSecuritycode() {
		if (System.getProperty(CREDIT_CARD_SECURITYCODE) != null) {
			return System.setProperty(CREDIT_CARD_SECURITYCODE, System.getProperty(CREDIT_CARD_SECURITYCODE));
		}
		return readEnvironmentProperty(CREDIT_CARD_SECURITYCODE);
	}

	public static String getGeneratedReportDir() {
		return readCommonProperty(EXTENT_HTML_REPORT);
	}

	public static String getFirstRunReportDir() {
		return readCommonProperty(EXTENT_HTML_FIRSTRUN_REPORT);
	}

	public static String getReRunReportDir() {
		return readCommonProperty(EXTENT_HTML_RERUN_REPORT);
	}
}
