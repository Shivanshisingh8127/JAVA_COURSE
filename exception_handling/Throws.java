/* Throws keyword is used to declare an exception. it gives an information to the caller method that there may occur an exception so it is
better for the caller method to provide the exception handling code so that normal flow can be maintained.
it is used for only checked exception not for unchecked exception
*/

//  program using throws keyword
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Test{
    public static void main(String args[]){
        ReadAndWrite re=new ReadAndWrite();
        // handling the exception
        try{
        re.read();// it is giving information to main  method that there can be an exception so handle it
        } 
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("done");
     }
}
class ReadAndWrite{ 
    void read() throws FileNotFoundException{ 
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
}
