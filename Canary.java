public class Canary extends Bird
{
    String name;
    
    public Canary(String name)
    {
        super();
        this.name = name;
        colour = "yellow";
    }

    @Override
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
    
    public String getName()
    {
        String str = this.name + " the " + this.getClass().getCanonicalName();
        return str;
    }
    
    @Override
    public String toString(){
        String strng ="";
        strng+= "Canary; ";
        strng+= "\n";
        strng+= "name: ";
        strng+= name;
        strng+= "\n";
        strng+= "colour: ";
        strng+= getColour();
        strng+= "\n";
        
        strng+= "Has feathers: ";
        strng+= hasFeathers;
        strng+= "\n";
        strng+= "Has wings: ";
        strng+= hasWings;
        strng+= "\n";
        strng+= "Can fly: ";
        strng+= flies;
        strng+= "\n";
        strng+= "Can sing: ";
        strng+= "tweet tweet tweet";
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
        
        if(object instanceof Canary)
        {
            Canary canary = (Canary)object;
            
            if(this.name == canary.getName())
                {
                    return true;
            }
        }
        return false; //default equals
    }
}
