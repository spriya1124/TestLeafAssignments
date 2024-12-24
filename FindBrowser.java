package week1.day3;

public class FindBrowser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	protected void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		FindBrowser lan = new FindBrowser();
		String url = lan.launchBrowser("Chrome");
		System.out.println(url);
		lan.loadUrl();
	}

}
