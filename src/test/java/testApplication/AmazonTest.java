package testApplication;

import seleniumConceptsExamples.BrowserUtil;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil util= new BrowserUtil();
		util.launchBrowser("Edge");
		util.enterUrl("https://www.javatpoint.com/java-string-indexof");
		String currentPageTitle=util.getPageTitle();
		if(currentPageTitle.contains("Java")) {
			System.out.println(" title is matched with actual result");
		}
		util.closeBrowser();
	}

}
