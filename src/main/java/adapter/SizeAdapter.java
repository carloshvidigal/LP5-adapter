package adapter;

public class SizeAdapter extends SizeMeasure{

    private ISize sizeName;

    public SizeAdapter(ISize sizeName){
        this.sizeName = sizeName;
    }

    public String getSizeName(){
        if(this.getMeasure() == 500)
        {
            sizeName.setSize("Large");
        }
        else if(this.getMeasure() == 400)
        {
            sizeName.setSize("Medium");
        }
        else if(this.getMeasure() == 250)
        {
            sizeName.setSize("Small");
        }

        return sizeName.getSize();
    }

    public void saveSize() {
        if(sizeName.getSize().equals("Large"))
        {
            this.setMeasure(500);
        }
        else if(sizeName.getSize().equals("Medium"))
        {
            this.setMeasure(400);
        }
        else if(sizeName.getSize().equals("Small"))
        {
            this.setMeasure(250);
        }
    }





}
