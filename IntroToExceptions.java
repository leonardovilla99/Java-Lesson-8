/**
 * IntroToExceptions
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntroToExceptions {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // try{
        //     System.out.print("How many month are in a year? ");
        //     int numMonths = input.nextInt();
        //     System.out.println(numMonths);
        // } catch(InputMismatchException e){
        //     System.out.println("Input wan not compatible with an integer variable");
        // }

        openFile();
    }

    public static void openFile(){
        try{
            File file = new File("test.txt");
            Scanner input = new Scanner(file);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}