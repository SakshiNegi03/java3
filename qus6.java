package java1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class qus6 {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);

        try {
            int a = f.nextInt(), b = f.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException e1){
            System.out.println("Arithmetic Exception");
        }catch (InputMismatchException e2){
            System.out.println("Input Mismatch Exception");
        }
        finally {
            System.out.println("Closed the program");
        }

    }
}