package by.it_academy;

public class Main {
    public static void main(String... ar){
        IntegerOutput scanNumber = new IntegerOutput(1);
        System.out.println("You entered: "+scanNumber.getNumber()+" /in the constructor.");
        scanNumber.EnterScanInNumber();

    }
}
