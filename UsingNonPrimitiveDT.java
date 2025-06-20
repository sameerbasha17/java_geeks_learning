class Point{
    int a;
    int b;
}

public class UsingNonPrimitiveDT {
    public static void main(String args[])
    {
        Point p = new Point();  //creating the object for the class point
        p.a = 1;
        p.b = 2;

        System.out.println("a = "+p.a+" b = "+p.b); //The variables are accessed by using object_name.variable_name 
    }
}
