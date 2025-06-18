public class ByteDT {
    public static void main(String args[])
    {
        // Byte can hold values form -128 to 127 .

        byte a= 126;

        System.out.println(a); //prints 126 value
        a++;
        System.out.println(a); //prints 127
        a++;
        System.out.println(a); // prints -128 (overflows here) , because the range of byte is -128 to 127 so it loop back within the range
        a++;
        System.out.println(a); //prints -127

    }
}
