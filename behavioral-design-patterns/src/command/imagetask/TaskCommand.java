package command.imagetask;


public abstract class TaskCommand {

    public Photo photo;
    private byte[] backup;

    TaskCommand(Photo photo) {
        this.photo = photo;
    }

    void backup() {
        backup = photo.getData();
    }

    public void undo() {
        photo.setData(backup);
    }

    public abstract boolean process();
}
