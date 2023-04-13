package adapter;

public class Coffee {

    ISize size;
    SizeAdapter persistence;

    public Coffee() {
        size = new SizeName();
        persistence = new SizeAdapter(size);
    }

    public void setSize(String sizeName) {
        size.setSize(sizeName);
        persistence.saveSize();
    }

    public String getSize() {
        return persistence.getSizeName();
    }

    public float getMeasure() {
        return persistence.getMeasure();
    }

}
