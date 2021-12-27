package space.abdilazov.threedrv;

public class ModelContact {

    private String title;
    private int number;
    private int imageView;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public ModelContact(String title, int number, int imageView) {
        this.title = title;
        this.number = number;
        this.imageView = imageView;
    }
}
