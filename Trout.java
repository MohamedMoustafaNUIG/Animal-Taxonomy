public class Trout extends Fish
{
    String name;
    boolean hasSpikes;
    boolean edible;
    public Trout(String name)
    {
        super();
        this.name = name;
        colour = "brown";
        hasSpikes= true;
        edible = true;
    }

    @Override
    public void move(int distance){
        System.out.printf("I can swim %d meters ,and I can also swim upriver to lay eggs",distance);
    }
    
    public String getName()
    {
        String str = this.name + " the " + this.getClass().getCanonicalName();
        return str;
    }
    
    public boolean getHasSpikes()
    {
        return hasSpikes;
    }
    
    public boolean getEdible()
    {
        return edible;
    }
    
    @Override
    public String toString(){
        String strng ="";
        strng+= "Trout; ";
        strng+= "\n";
        strng+= "Name: ";
        strng+= name;
        strng+= "\n";
        strng+= "Colour: ";
        strng+= getColour();
        strng+= "\n";
        
        strng+= "Can swim: ";
        strng+= "Can swim and can also swim upriver to lay eggs";
        strng+= "\n";
        strng+= "Has Spikes: ";
        strng+= getHasSpikes();
        strng+= "\n";
        strng+= "Is Edible: ";
        strng+= getEdible();
        strng+= "\n";
        
        strng+= "Has fins: ";
        strng+= hasFins;
        strng+= "\n";
        strng+= "Has gills: ";
        strng+= hasGills;
        strng+= "\n";
        
        strng+= "Has skin: ";
        strng+= hasSkin;
        strng+= "\n";
        strng+= "Eats: ";
        strng+= true;
        strng+= "\n";
        strng+= "Breathes: ";
        strng+= breathes;
        strng+= "\n";
        return strng;
    }

    @Override
    public boolean equals(java.lang.Object object){
        if(object == null)
        {
            return false;
        }
        
        if(object instanceof Trout)
        {
            Trout trout = (Trout)object;
            
            if(this.name == trout.getName())
                {
                    return true;
            }
        }
        return false;
    }
}
