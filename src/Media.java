import java.io.File;
import java.time.Instant;
import java.util.Date;   // //

public class Media {    // Der defineres en klasse ved navnet "Media"

    private int assetId;    // (Skifter til engelsk sprog da bogens termer er engelske) This line declare a int type object with the name assetId
    private String name;    // Declaing an object of type String and with the name "name"
    private Date created = new Date();  // Declaring and assigning an object of type Date, with the name "created", the assignment is a method called new_Date()
    private String fileName; // Declaration of an object of type String with name "filename"


    public Media() {    // Setting up a constructor with the name Media()
        assetId = MediaID.generate();   // The constructor implements the object assetId and sets this object to call the method Media.generate()
        created = Date.from(Instant.now()); /* The constructor implements the object created and calls the method Date.from(Instant.now()),
                                               Inside the method you can see that the method calls another method called Instant.now()*/

    }   // Constructor ends

    public int getAssetId() { // Creating a method object which returns a value of the 'int' type
        return assetId; // The method returns the assetId as the return value
    }

    public void setAssetId(int assetId) { // This method set's up the object assetId ie. its a setter method
        this.assetId = assetId; // The assetId is being assigned the value of the 'assetId' object
    }

    public String getName() {   //  The getter method for 'name' object
        return name;
    }

    public void setName(String name) {  // The setter method for the 'name' object
        this.name = name;
    }

    public Date getCreated() { //Getter method for 'created'
        return created;
    }

    public void setCreated(Date created) {  // The setter method for the object 'created'
        this.created = created;
    }

    public String getFileName() {   // The getter for object 'filename'
        return fileName;
    }

    public void setFileName(String fileName) {  // The setter for object 'filename'
        this.fileName = fileName;
    }

    @Override   // Overriding alle inherent properties for this method
    public String toString() {  // Builds a Method, with the name toString() which returns the type Sting
        return "Media{" +   // Defining the returnvalue
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}