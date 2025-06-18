public class Short_DT {
    public static void main(String args[])
    {
        // Understanding short data type
        /* values = -32768 to 32767
         * default value = 0
         * size = 2 bytes(16 bits)
         */

         short a=32767;
         System.out.println(a); // prints 32767
         a++;
         System.out.println(a); // prints -32768        // works same as byte.
         a++;
         System.out.println(a); // prints -32767

    }
}
