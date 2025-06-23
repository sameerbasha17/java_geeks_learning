public class Narrowing {
    public static void main(String args[])
    {
        // Narrowing or explicit conversion
        // if we want to assign the value of a larger data type to a smaller data type we perform explicit type casting
        // Double -> Float -> long -> int -> short -> byte
        double d = 2999444445.54898056d;
        System.out.println("Double value = "+d); // printing the initial value of double variable // it print is scientific notation i.e.:5.874444455489806E8 because if the number is too large (=>1e7) or too small(<=1e-3) it switches to scientific notation automatically
        long l = (long)d;
        System.out.println("Explicit type casting (double to long)");
        System.out.println("long value = "+l);
        int i = (int)l;
        System.out.println("Explicit type casting (long to int)");
        System.out.println("integer value = "+i);
    }
}
