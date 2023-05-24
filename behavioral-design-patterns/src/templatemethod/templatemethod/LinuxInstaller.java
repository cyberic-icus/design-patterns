package templatemethod.templatemethod;

import java.io.File;

public class LinuxInstaller extends InstallerTemplate {

	@Override
	public void extractData() {
		System.out.println("Brrrrrrrrrrrrrrrrrr");
	}

	@Override
	public void createTempFiles() {
		new File("./temp").mkdir();
		System.out.println("Created temp dirs : ./temp");
	}

}