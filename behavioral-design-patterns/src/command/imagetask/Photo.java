package command.imagetask;

import java.util.Arrays;

public class Photo {
    private byte[] data;

    public Photo(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo = (Photo) o;

        return Arrays.equals(getData(), photo.getData());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getData());
    }
}
