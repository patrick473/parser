package Model;

public class PictureObject {

    private String dutchText;
    private String representingPicture;

    public String getDutchText() {
        return dutchText;
    }

    public void setDutchText(String dutchText) {
        this.dutchText = dutchText;
    }

    public String getRepresentingPicture() {
        return representingPicture;
    }

    public void setRepresentingPicture(String representingPicture) {
        this.representingPicture = representingPicture;
    }

    public PictureObject(String dutchText, String representingPicture) {
        this.dutchText = dutchText;
        this.representingPicture = representingPicture;
    }

    @Override
    public String toString() {
        return "PictureObject{" +
                "dutchText='" + dutchText + '\'' +
                ", representingPicture='" + representingPicture + '\'' +
                '}';
    }
}
