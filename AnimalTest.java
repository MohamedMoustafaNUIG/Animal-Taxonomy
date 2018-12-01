public class AnimalTest
{

    public static void main(String[] args)
    {
        AnimalTest at = new AnimalTest();
        at.test1();
    }
    
    public void test1()
    {
        Animal[] animals = new Animal[6];
        
        animals[0] = new Canary("Bluey");
        animals[1] = new Ostrich("Bluey");
        animals[2] = new Ostrich("Bluey");
        animals[3] = new Trout("Bluey");
        animals[4] = new Shark("Bluey");
        animals[5] = new Canary("Yellowy");
        
        for(int i = 0;i<6;i++)
        {
            System.out.println("Is "+animals[i%6].getName()+" the same as "+animals[(i+1)%6].getName()+" ?");
            System.out.println(animals[i%6].equals(animals[(i+1)%6]));
            //So that the last and first objects can be compared, mod was used
        }
    }
}
