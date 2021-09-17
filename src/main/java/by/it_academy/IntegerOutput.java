package by.it_academy;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class IntegerOutput {
    private int number;
    private final Scanner scan = new Scanner(System.in);;

    public IntegerOutput() {

    }
    public IntegerOutput(int number) {
        this.number=number;
    }

    public void EnterScanInNumber(){

        try{do{ sleep(1000);
            System.out.println("Enter the number or EXIT:");
            number = scan.nextInt();
            sleep(1000);
            System.out.println("To exit entered 'EXIT'");}
        while (!Objects.equals(scan.nextLine(), "EXIT"));
            System.exit(0);
        }
        catch (IllegalFormatException | InputMismatchException err){
           if(!Objects.equals(scan.nextLine(), "EXIT")){
            System.err.println("You enter the wrong value");
            EnterScanInNumber();
           }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
