public class Double_DT {
    public static void main(String args[])
    {
        // Understanding the Double data type
        /* Size = 8 bytes( 64 bits)
         * Values = upto 16 decimal places
         * Default value = 0.0
         */

         double a = 08.04;
         double b = 07.05;
         double c = 89.98d;
         double d = 89.98;

                                    //Outputs :
         System.out.println(a); // 8.04
         System.out.println(c); //89.98
         System.out.println(a+b); //15.09
         System.out.println(a+c); //98.02000000000001
         System.out.println(a+d); //98.02000000000001                          


    }
    
}
