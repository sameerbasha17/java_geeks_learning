public class Comp_With_Wrapper_Cls{
    public static void main (String args [])
    {
        Integer p = new Integer(10); //creating the wrapper objects using new keyword
        Integer q = new Integer(10);

        if(a==b)
        {
            System.out.println("Both are same");  //if-else statement to check the both objects are same or not
        }
        else{                                    
            System.out.println("Both are different");  // the output is : Both are different , because here we are comparing with objects not with values . i mean a and b are two different objects
        }

        Integer c = 9; //auto-boxing
        Integer d = 9;

        if(c==d)
        {
            System.out.println("Both are same");  // Here the output is : Both are same , because java converts the int value 9 into integer object
        }
        else{
            System.out.println("Both are different");
        }

    }
}