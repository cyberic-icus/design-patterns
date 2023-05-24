package templatemethod.templatemethod;

public abstract class InstallerTemplate {
	public final void install(){
		downloadData();
		createTempFiles();
		extractData();
		cleanup();
		System.out.println("Program installed.");
	}

	private void cleanup() {
		System.out.println("Deleting temp dirs.");
	}

	private void downloadData() {
		System.out.println("Downloading data...");
	}

	public abstract void extractData();
	public abstract void createTempFiles();
}