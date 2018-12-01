public class Animal
{
    boolean hasSkin;
    boolean breathes;
    String colour;
    String name;
    public Animal()
    {
        breathes = true;
        hasSkin = true;
        colour = "grey";
    }

    public void move(int distance){
        System.out.printf("I move %d metres \n", distance);
    }
    
    public String getColour(){
        return colour;
    }
    
    public boolean hasSkin(){
        return hasSkin;
    }
    
    public String getName()
    {
        String str = this.name + " the " + this.getClass().getCanonicalName();
        return str;
    }
}
