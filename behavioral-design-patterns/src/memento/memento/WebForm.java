package memento.memento;

public class WebForm {

    private WebFormUserData webFormUserData;
    private WebFormUserDataState savedTextWindow;

    public WebForm(WebFormUserData webFormUserData) {
        this.webFormUserData = webFormUserData;
    }

    public void changeFio(String text) {
        webFormUserData.setFio(text);
    }

    public void changeInn(String text) {
        webFormUserData.setInn(text);
    }

    public void changeSnilz(String text) {
        webFormUserData.setSnilz(text);
    }

    public String print() {
        return webFormUserData.toString();
    }

    public void save() {
        savedTextWindow = webFormUserData.save();
    }

    public void undo() {
        webFormUserData.undo(savedTextWindow);
    }
}