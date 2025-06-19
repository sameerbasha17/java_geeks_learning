public class All_Data_Types {
    public static void main (String args[])
    {
        // Writing a program which uses all the primitive data types
        // Declaring and assigning all the primitive data types
        boolean bo= true;
        byte b = 50;
        short s = 100;
        int i = 150;
        long l = 10000l;
        float f =56.8767f;
        double d = 890.9988;
        char c = 'a';


       // printing the variables

       System.out.println(b); //50
       System.out.println(s); //100
       System.out.println(i); //150
       System.out.println(l); //10000
       System.out.println(f); //56.8767
       System.out.println(d); //890.998
       System.out.println(c); //a
       System.out.println(bo); //true

       //Basic arithmetic operations

       System.out.println(b+s); //150
       System.out.println(b+l); //10050
       System.out.println(b+s); //150
       System.out.println(c+s); //197
      // System.out.println(b+bo); // error  Airthmetic operations cannot be performed between the boolean and numeric types
      // System.out.println(c+bo); // error
     boolean b1 = true;
     boolean b2 = false;
     System.out.println(b1&&b2); //false
     System.out.println(b1 || b2); //true
     System.out.println(!b1); //false
    }
}
