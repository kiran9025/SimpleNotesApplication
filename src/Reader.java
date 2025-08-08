import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Reader {
    public void File_Reader() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("Notes.txt"))){
            System.out.println("Contents of the file : ");
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        }catch(IOException ex){
            System.out.println("An Exception occured while Reading a file ");
            ex.printStackTrace();
        }finally {
            System.out.println("Reading from file Successfull ");
        }
    }
}

