import java.io.File;

public class Main {

    /* I denne opgave skal jeg åbne Main klassen og kommentere de forskellige linier i den samle main kode

     */

    public static final String SOFTWARE_VERSION = "0.1.0"; // I denne linie "deklareres" og "assignes" der en konstant af typen String, den sættes til at være public
    public static final String MEDIA_MAPPE = "media/"; // I denne linie "deklareres" og "assignes" der igen en konstant af typen String og denne sættes også til ar være public

    public static void main(String[] args) { // Her initieres vores main metode

        Test.test(); // Denne linie kalder på metoden test() i filen test.

        MediaManager.readMediaFolder("media");
    }

}

