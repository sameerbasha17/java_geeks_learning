import java.util.InputMismatchException;
import java.util.Scanner; // importing the Scanner class form java.util package
public class ScannerClass {
    public static void main(String[] args) {
        //Understanding the Scanner class
        // Scanner class is used for reading input easily from various sources : keyboard,files,strings,etc..
        // 1.import the scanner package
        // create the object for the scanner class and call the constructor

        Scanner sc = new Scanner(System.in); // creating object for the Scanner class to read input form keyboard
        System.out.println("Enter your name : "); // promt the user for full name input 
        String name = sc.nextLine(); // reads a full line // using nextLine() to parse string values
        int age = 0;
        try{
             System.out.println("Enter your age : ");  //taking input
             age = sc.nextInt(); //reads a int value // using nextInt() to parse integer values
        }
        catch(InputMismatchException e){
            System.out.println("You entered invalid input. Please, enter a valid input.");
        }


        // printing the values

        System.out.println("Hi "+ name +" , you are "+age+" years old ...");

        sc.close();


    }
}
