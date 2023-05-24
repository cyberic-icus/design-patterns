package templatemethod.templatemethod;

import java.io.File;

public class WinInstaller extends InstallerTemplate {

	@Override
	public void extractData() {
		System.out.println("Boooooooooooo");
	}

	@Override
	public void createTempFiles() {
		new File("C:\\temp").mkdir();
		System.out.println("Created temp dirs : C:\\temp");
	}

}