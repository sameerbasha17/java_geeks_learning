class Point2{
    int a;
    int b;
}

public class Referenc_Behavior_NPDT {
    public static void main(String args[])
    {
        Point2 p1 = new Point2();
        p1.a =100;
        p1.b =200;
        System.out.println("p1.a = "+p1.a+"   p1.b = "+p1.b); // p1.a = 100   p1.b = 200
        Point2 p2 = p1; //Both p1 and p2 points the same object
        p2.a =50;       //Here p1 and p2 are called reference variables

        System.out.println("p1.a = "+p1.a+ "   p2.a = "+p2.a); // p1.a = 50   p2.a = 50 //Any modifications made through p2 is reflected when accessing via p1
    }
}
