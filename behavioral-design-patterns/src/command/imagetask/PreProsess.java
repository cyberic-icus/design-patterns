package command.imagetask;

public class PreProsess extends TaskCommand {

    public PreProsess(Photo photo) {
        super(photo);
    }

    @Override
    public boolean process() {
        try {
            for (int i = 0; i < photo.getData().length; i++) {
                photo.getData()[i] = (byte) (photo.getData()[i] >> 1);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
