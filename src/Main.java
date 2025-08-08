import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Notes Application : ");
        Scanner sc = new Scanner(System.in);
        String choice;

        while(true){
            System.out.println("""
                  \nChoose the choice 
                    1. Add Notes
                    2. View Notes 
                    3. Exit
                    """);
            choice = sc.nextLine().trim().toLowerCase();
            Reader reader = new Reader();
            Writer writer = new Writer();

            switch(choice){
                case "addnotes" ->  writer.File_Writer();

                case "viewnotes" -> reader.File_Reader();

                case "exit" -> {
                    System.out.println("Thank You for Using Notes App ");
                    return;
                }
                default -> System.out.println("Incorrect choice : please enter the correct choice ");
            }
        }
    }
}