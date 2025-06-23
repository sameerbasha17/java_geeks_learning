public class Narrowing {
    public static void main(String args[])
    {
        // Narrowing or explicit conversion
        // if we want to assign the value of a larger data type to a smaller data type we perform explicit type casting
        // Double -> Float -> long -> int -> short -> byte
        double d = 2999444445.94898056d;
        System.out.println("Double value = "+d); // printing the initial value of double variable // it print is scientific notation i.e.:2.9994444459489803E9 because if the number is too large (=>1e7) or too small(<=1e-3) it switches to scientific notation automatically
        long l = (long)d;
        System.out.println("Explicit type casting (double to long)");
        System.out.println("long value = "+l); // prints 2999444445 // fractional part removed(truncated not rounded)
        int i = (int)l;
        System.out.println("Explicit type casting (long to int)"); 
        System.out.println("integer value = "+i); // prints -1295522851 // Overflow due to exceeding int limit (2,147,483,647)


        //reassigning value to int
        i = 32001;
        System.out.println("Explicit type casting (int to short)");
        short s = (short)i; 
        System.out.println("Short value : "+s);   // prints 32001
        System.out.println("Explicit type casting (short to byte)");
        byte b = (byte)s;
        System.out.println("Byte value : "+b); // prints 1 i.e.: 32001%256=1 // Overflow due to exceeding byte limit (-128 to127)
    }
}
