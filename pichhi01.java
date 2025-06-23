import java.util.Scanner;
public class pichhi01 {
    public static void main(String args[] )
    {
        System.out.println("integer range checker");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int a =scan.nextInt();
        if((int)a!=a)
        {
            System.out.println("failed  "+a);
        }
        else{
            System.out.println("sucess  "+a);
        }
    }
}
