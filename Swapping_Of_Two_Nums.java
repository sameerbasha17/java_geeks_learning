public class Swapping_Of_Two_Nums{
  public static void main(String args[])
  {
    // declaring and assigning the random values to two variables of same type
    int a = 5;
    int b = 4;
    System.out.println("Before swapping :");
    System.out.println("Value of a is "+a+" and Value of b is "+b); //printing the initial values of a and b before swapping
    int temp = a; // declaring a temporary value to store 'a'
    a = 4; //swapping
    b = temp;
    System.out.println("After Swapping : ");
    System.out.println("Value of a is "+a+" and Value of b is "+b); //printing the values of a and b after swapping
  }
}
