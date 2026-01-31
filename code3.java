class Animal{
    void sound()
    {
        System.out.println("sound of dog and cat");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("  Dog bark bow bow ");
    }
    
}
class Cat extends Animal
{
    void bark()
    {
        
        System.out.println("Cat sound meow meow");
    }
}
class code3
{
    public static  void main(String[]args)
    {
       Dog  d = new Dog();
       Cat  c = new Cat();
       d.sound();
       d.bark();
       c.bark();
      
    }
}