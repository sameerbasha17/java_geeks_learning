public class Widening03 {
    public static void main(String[] args) {
        // Understanding the implicit type casting/widening/automatic conversion much deeper
        byte b = 122;
        System.out.println("The initial value of byte : "+b); //122
        
        // byte to short
        short s = b;
        System.out.println("Byte to short : "+s); //122

        // byte to int
        int i = b;
        System.out.println("Byte to int : "+i); //122

        // byte to long
        long l = b;
        System.out.println("Byte to long : "+l); //122

        // byte to float
        float f = b;
        System.out.println(" Byte to float : "+f); //122.0

        //byte to double
        double d = b;
        System.out.println("  byte to double : "+d); //122.0

        System.out.println("-------------------------------------------");
        System.out.println();
        s = 32000;
        System.out.println("Initial value of short : "+s); //32000
        System.out.println("widening : short to ");
        i = s;
        System.out.println("int : "+i); // 32000
        l = s;
        System.out.println("long : "+l); // 32000
        f = s;
        System.out.println("float : "+f); // 32000.0
        d = s;
        System.out.println("double : "+d); //32000.0

        System.out.println("-------------------------------------------");          // creates a empty line
        System.out.println();          // cteates a empty line
        i = 348738;
        System.out.println("Initial value of int : "+i); //348738
        System.out.println("Widening : int to ");
        l = i;
        System.out.println("long : "+l); // 348738
        f = i;
        System.out.println("float : "+f); // 348738.0 // pricison loss happens when the value exceeds greater than 16,777,216. Even though  int and float are 32 bit representations , the float uses 1 bit for sign , 8 for exponent and 23 for mantissa
        d =i;
        System.out.println("double : "+d); // 348738.0

        System.out.println("-------------------------------------------");
        System.out.println();
        l = 45487845454934834l;
        System.out.println("Initial value of long : "+l); // 45487845454934834
        System.out.println("Widening : long to ");
        f = l;
        System.out.println("float : "+f); // 4.5487844E16 // precision loss happen when long to float(tries to hold nearer value)
        d = l;
        System.out.println("double : "+d); //  4.548784545493483E16 // precision loss happens when long to double. even though both are 64 representations the double can hold upto 2^53 (9,007,199,254,740,992) safe .

        System.out.println("-------------------------------------------");
        System.out.println();
        f = 54587.94887f;
        System.out.println("Initial value of float : "+f); // 54587.95
        System.out.println("Widening : float to ");
        d = f ;
        System.out.println("double : "+d); // 54587.94921875

    }
}
