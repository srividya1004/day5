class Animal{
    void sound()
    {
        System.out.println("Every animals make different sound");
    }
}
class Dog extends Animal
{
    void sound() // method overriding
    {
        System.out.println(" Dog bark like bow bow ");
    }
}
class code4
{
    public static  void main(String[]args)
    {
        Dog d = new Dog();

        d.sound();
    }
}