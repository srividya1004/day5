abstract class shape{
    abstract void draw();
    void message()
    {
        System.out.println("Hello developer...");

    }
}
class circle extends shape{
    void draw()
    {
     System.out.println("circle can draw using the compass");
    }
}
class code7
{
    public static void main(String[]args)
    {
        circle c = new circle();
        c.message();
        c.draw();

    }
}