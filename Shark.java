public class Shark extends Fish
{
    String name;
    boolean isDangerous;
    public Shark(String name)
    {
        super();
        this.name = name;
        isDangerous = true;
    }
    
    public String getName()
    {
        String str = this.name + " the " + this.getClass().getCanonicalName();
        return str;
    }
    
    public boolean getIsDangerous()
    {
        return isDangerous;
    }
    
    public void bites()
    {
        System.out.println("Sharks can bite!");
    }
    
    @Override
    public String toString(){
        String strng ="";
        strng+= "Shark; ";
        strng+= "\n";
        strng+= "Name: ";
        strng+= name;
        strng+= "\n";
        strng+= "Colour: ";
        strng+= getColour();
        strng+= "\n";
        
        strng+= "Can swim: ";
        strng+= swims;
        strng+= "\n";
        strng+= "Is Dangerous: ";
        strng+= getIsDangerous();
        strng+= "\n";
        strng+= "Can Bite: ";
        strng+= "Sharks can bite!";
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
        
        if(object instanceof Shark)
        {
            Shark shark = (Shark)object;
            
            if(this.name == shark.getName())
                {
                    return true;
            }
        }
        return false;
    }
}
