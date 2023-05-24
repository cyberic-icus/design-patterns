package memento.memento;

public class WebFormUserData {

    private String fio = "";

    private String inn = "";

    private String snilz = "";

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getSnilz() {
        return snilz;
    }

    public void setSnilz(String snilz) {
        this.snilz = snilz;
    }

    public WebFormUserDataState save() {
        return new WebFormUserDataState(fio, inn, snilz);
    }

    public void undo(WebFormUserDataState save) {
        fio = save.getFio();
        inn = save.getInn();
        snilz = save.getSnilz();
    }

    @Override
    public String toString() {
        return "WebFormUserData{" +
                "fio='" + fio + '\'' +
                ", inn='" + inn + '\'' +
                ", snilz='" + snilz + '\'' +
                '}';
    }
}