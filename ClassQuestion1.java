class ClassQuestion1
{
    public static void main(String arg[])
    {
        Rectangle rect = new Rectangle(5, 5);
        
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
    
    }
}
class Rectangle
{
    double length;
    double breadth;
    boolean isSquare;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

}