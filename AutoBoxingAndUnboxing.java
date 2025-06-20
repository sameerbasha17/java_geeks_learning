public class AutoBoxingAndUnboxing{
    public static void main(String args[]){
        //declaring and assigning a value to a int type variable
        // Autoboxing : converting int to Integer
        int x1 = 9;
        Integer x2 = x1; //auto boxing
        // Unboxing : converting Integer to int
        int x3 = x2; //unboxing

        // printing the values
        System.out.println("x1 : "+x1);
        System.out.println("x2 : "+x2);
        System.out.println("x3 : "+x3);
    }
}