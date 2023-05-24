package memento;

import memento.memento.WebForm;
import memento.memento.WebFormUserData;

public class Main {
    public static void main(String[] args) {
        WebForm webForm = new WebForm(new WebFormUserData());

        webForm.changeFio("Kek Kekovich Kekov");
        webForm.changeInn("123124124");
        webForm.changeSnilz("41412412");
        webForm.save();

        System.out.println(webForm.print());


        webForm.changeFio("FDOPSDFOPDSFOSDPO");
        webForm.undo();

        System.out.println(webForm.print());
    }
}
