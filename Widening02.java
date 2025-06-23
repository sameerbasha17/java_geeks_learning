public class Widening02 {
    public static void main(String[] args) {
        // let us dive deepper
        byte b =123;
        short s =32700;
        int i = 89989909; // not printed due to reassignment of values(overwritten later)
        long l =878798978779l; // not printed due to reassignment of values(overwritten later)
        float f = 8799098.899999f; // not printed due to reassignment of values(overwritten later)
        double d = 9484879487879487944884d; // not printed due to reassignment of values(overwritten later)

        // byte to int
        i =b;
        System.out.println(i);
        // byte to long
        l = b;
         System.out.println(l);
        // byte to float
        f = b;
        System.out.println(f);
        // byte to double
        d = b;
        System.out.println(d);
        // short to long
        l = s;
        System.out.println(l);
        // short to float
        f = s;
        System.out.println(f);
        // short to double
        d = s;
        System.out.println(d);
        // int to long
        l = i;
        System.out.println(l);
        // int to float 
        f = i;
        System.out.println(f);
        // int to double
        d = i;
        System.out.println(d);
        // long to float
        f = l;
        System.out.println(f);
        // long to double
        d = l;
        System.out.println(d);
        // float to double
        d = f;
        System.out.println(d);

    }
}
