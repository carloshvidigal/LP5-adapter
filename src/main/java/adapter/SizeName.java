package adapter;

public class SizeName implements ISize {

    private String sizeName;

    @Override
    public String getSize(){
        return this.sizeName;
    }

    @Override
    public void setSize(String sizeName){
        this.sizeName = sizeName;
    }

}
