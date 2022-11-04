/**
 * IntroToExceptions
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IntroToExceptions {
    public static void main(String[] args) throws FileNotFoundException{
        // Scanner input = new Scanner(System.in);
        // try{
        //     System.out.print("How many month are in a year? ");
        //     int numMonths = input.nextInt();
        //     System.out.println(numMonths);
        // } catch(InputMismatchException e){
        //     System.out.println("Input wan not compatible with an integer variable");
        // }

        // openFile();

        // try{
        //     String msg = JOptionPane.showInputDialog("Enter a number: ");
        //     int number = Integer.parseInt(msg);
        //     JOptionPane.showMessageDialog(null, msg);
        // }catch(NumberFormatException e){
        //     System.out.println(e.getMessage() + " is not a number");
        // }

        try{
            arrayNotWorking();
        }catch(ArrayNoBounds e){
            System.out.println(e.getMessage());
        }
    }

    public static void arrayNotWorking() throws ArrayNoBounds{
        int[] number = {1,2,3};
        int index = 4;
        if(index < 0 || index > number.length){
            throw new ArrayNoBounds();
        }else{
            System.out.println(number[index]);
        }
    }

    // public static void openFile() throws FileNotFoundException{
    //     try{
    //         File file = new File("test.txt");
    //         Scanner input = new Scanner(file);
    //     }catch(FileNotFoundException e){
    //         System.out.println("File not found");
    //     }
    // }
}