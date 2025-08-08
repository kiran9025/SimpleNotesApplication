import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public void File_Writer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text you want to Write to a file! Type exit to stop and save the file ");
        try(FileWriter fileWriter = new FileWriter("notes.txt", true)){
            while(true){
                 String line = sc.nextLine();
                 if(line.equalsIgnoreCase("exit")){
                    break;
                }
                fileWriter.write(line + System.lineSeparator());
            }
        }catch(IOException ex){
            System.out.println("An Exception Occured While Writing to a file");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Entered data successfully writtend to file ");
        }
    }
}
