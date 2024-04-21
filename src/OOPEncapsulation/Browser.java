package OOPEncapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launch Browser");
		checkBrowserVirsion();
		checkOSCompatibility();
		checkRAMSpace();
		checkUpdateAvailable();
	}
	
	private void checkBrowserVirsion() {
		System.out.println("Check Browser version");
	}
	
	private void checkOSCompatibility() {
		System.out.println("check OS Compatibility");
	}
	
	private void checkRAMSpace() {
		System.out.println("check RAM Space");
	}
	
	
	private void checkUpdateAvailable() {
		System.out.println("check Update Available");
	}
}
