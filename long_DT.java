public class long_DT {
    public static void main(String args[])
    {
        // Understanding the long data type
        /* Size : 8 bytes (64 bits) 
         * Values : -9223372036854775808 to 9223372036854775807 (inclusive)
         * Default value : 0
        */

        long a = 9223372036854775807l; // without "l" suffix it doesnot work 
        long b = 1;                    // it is similar to other integer types
        System.out.println(a+b);
    }
}
