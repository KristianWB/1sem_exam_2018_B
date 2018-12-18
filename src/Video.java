public class Video extends Media {

    String filtype; // (as mp4, m4v, mov)
    double length;  // (in munutes and seconds)
    String resolution;  // (SD, HD)
    String Fotographer; // The name of..

    @Override
    public void logToConsol() {

        System.out.println(
                "Asset id is: " + getAssetId() +
                        "\nName is: " + getName() +
                        "\nFile created: " + getCreated()
        );
    }

}


