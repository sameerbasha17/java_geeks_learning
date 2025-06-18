public class Integer_DT {
    public static void main(String args [])
    {
        // Understanding the integer data type
        /*Size = 4 bytes (32 bits)
         Values = -2147483648 to 2147483647
         Default value = 0
         */

         int a =38943;
         int b =2010031275;
         int c =-2147483648;
         int d = -1;
         int e = -2;
         int f;
         System.out.println(a+b); // outputs 2010070218
         System.out.println(c-d); // -2147483647              //if the value overflows  then it loops back within the range (just like byte and short)
         System.out.println(f=c+d); // 2147483647
         
         System.out.println(f+e); // 2147483645
    }
}
