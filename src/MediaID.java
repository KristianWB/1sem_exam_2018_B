import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {  // The public class MediaID id is declared

    private static int latestId = 100;  // Declaration of object of type 'int' with the name 'latestId' and assignment of its value


    public static int generate() {  //  Setting up a method which returns a value of the type int

        File file = new File("media_id.txt");   // Constructing a file  with the name 'media_id.txt'

        // Låser filen op før adgang
        // file.setWritable(true);

        try {   /* initiation of the file commands, where try indicates that we want to handle an exception if the
                method does not run as it is supposed to, aka, an error occurs
                */


            if (file.exists()) {    // If commands, this code states that the succesive commands kan run only if the file exists!
                FileReader fileReader = new FileReader(file);   /* Declares a object where the object is created from the
                                                                    Constructor fileReader
                                                                */
                Scanner scanner = new Scanner(file);    /* Declares a Scanner object with name scanner, from the scanner class,
                                                            The scanner object is assigned its input from the file input
                                                            */
                latestId = (int) scanner.nextInt();     // The object 'latestId' is assigned value cast as an int type which it gets from the scanner object
            }

            latestId++; // The ocject 'latestId' is incremented with a post increment command (++)

            FileWriter fileWriter = new FileWriter(file); // A object 'fileWriter' is Declared from the fileWriter class
            fileWriter.write(Integer.toString(latestId));   /* The method write from class fileWriter is called upon to
                                                                write the integer value from latestId as a String value
                                                                into the file
                                                                */
            fileWriter.close(); // The command series where the fileWriter process is active is now closed

        } catch (IOException e) {   // If an error has ocurred aka. the file was not created or written to, then the error will be catch'ed
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        return latestId;    // the method returns the value of latestId
    }

}