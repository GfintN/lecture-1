package by.it_academy;

import org.junit.jupiter.api.Test;


public class TextIntegerOutput {
    private IntegerOutput test;

    @Test
    void ConstrictorParameterTest(){
        int constructorNumberParameter = 2;
        test = new IntegerOutput();
        System.out.println("Constructor 1 = "+test.getNumber());
        test = new IntegerOutput(constructorNumberParameter);
        System.out.println("Constructor 2 = "+test.getNumber());
    }

    @Test
    void GetterAndSetterTest(){
        test = new IntegerOutput();
        int setNumber = 2;
        test.setNumber(setNumber);
        System.out.println("Get number = "+test.getNumber());
        System.out.println("Number squared = "+(test.getNumber()*test.getNumber()));
    }
      //Scanner is not readable

    }



