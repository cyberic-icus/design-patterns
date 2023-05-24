package memento.memento;

public class WebFormUserDataState {

    private String fio;

    private String inn;

    private String snilz;

    public WebFormUserDataState(String fio, String inn, String snilz) {
        this.fio = fio;
        this.inn = inn;
        this.snilz = snilz;
    }

    public String getFio() {
        return fio;
    }

    public String getInn() {
        return inn;
    }

    public String getSnilz() {
        return snilz;
    }
}