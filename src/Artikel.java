public class Artikel extends Media {
    String author;
    String articleText;
    String adherentPicture;

    @Override
    public void logToConsol() {

        System.out.println(
                "Asset id is: " + getAssetId() +
                        "\nName is: " + getName() +
                        "\nFile created: " + getCreated()
        );
    }
}
