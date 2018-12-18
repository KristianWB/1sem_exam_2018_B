public class Billede extends Media {

    String fileType;    //(as jpg, png, gif)
    double Width;   // in pixels
    double Height;  // in pixels
    String Photographer;    // the name

    @Override
    public void logToConsol() {

        System.out.println(
                "Asset id is: " + getAssetId() +
                        "\nName is: " + getName() +
                        "\nFile created: " + getCreated()
        );
    }
}
