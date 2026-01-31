class Animal{
    void type()
    {
        System.out.println("there different of animals");
    }
}
class Mammals extends Animal
{
    void chari()
    {
        System.out.println(" mammals give a birth ");
    }
}
class Humans extends Mammals
{
    void feature()
    {
        
        System.out.println(" Humans can talk");
    }
}
class code2
{
    public static  void main(String[]args)
    {
       Humans h = new Humans();
       h.feature();
       h.chari();
       h.type();
    }
}