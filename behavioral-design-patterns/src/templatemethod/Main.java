package templatemethod;

import templatemethod.templatemethod.InstallerTemplate;
import templatemethod.templatemethod.LinuxInstaller;
import templatemethod.templatemethod.WinInstaller;

public class Main {

	public static void main(String[] args) {
		
		InstallerTemplate installer = new LinuxInstaller();

		installer.install();
		
		installer = new WinInstaller();
		
		installer.install();
	}

}