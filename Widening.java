public class Widening {
    // Widening conversion takes place when two data types are automatically converted. This happens when :
    //1. The two data types are compatible
    //2. when we assign a value of a smaller data type to a bigger data type.
    
    // Byte -> Short -> Int -> Long -> Float -> Double

    public static void main (String args[])
    {
        int i = 9;

        //widening or automatic conversion

        // int to long
        long l = i;

        System.out.println(l); //print output
    }
}
