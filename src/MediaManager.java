import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {

    public static void logMediaFolder(String folderNavn) {

        File folder = new File(folderNavn);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }

    }

    public static File[] readMediaFolder(String folderNavn)   {
        File folder = new File(folderNavn);
        File[] listOfFiles = folder.listFiles();
        for (int j = 0; j < listOfFiles.length; j++)   {
             if (j < listOfFiles.length)
                new Media();
              }

        return listOfFiles;

        }

    }

}
