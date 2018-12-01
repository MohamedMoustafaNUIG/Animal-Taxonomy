public class Fish extends Animal
{
    boolean hasFins;
    boolean hasGills;
    boolean swims;

    public Fish()
    {
        super(); 
        hasFins = true;
        hasGills = true;
        swims = true;
    }

    @Override
    public void move(int distance){
            System.out.printf("I swim %d metres \n", distance);
    }
    
    public boolean hasGills(){
        return hasGills;
    }

    public boolean hasFins(){
        return hasFins;
    }
    
    public boolean getHasGills(){
        return hasGills;
    }
    
    public boolean getHasFins(){
        return hasFins;
    }
}
