class ClassQ3
{
    public static void main(String arg[])
    {
        Rectangle rect = new Rectangle(5, 5);
        
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("The Rectangle is = " + rect.isSquare());
    
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

    double getArea()
    {
        return length * breadth;
    }
    boolean isSquare()
        {

        if (length==breadth)
        isSquare = true;
        else
        isSquare = false;
    return isSquare;
        }

}