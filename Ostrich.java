public class Ostrich extends Bird
{

    String name;
    boolean hasThinLongLegs;
    boolean isTall;

    public Ostrich(String name)
    {
        super(); 
        this.name = name;
        flies = false;
        hasThinLongLegs=true;
        isTall=true;
    }
    
    @Override
    public String getName()
    {
        String str = this.name + " the " + this.getClass().getCanonicalName();
        return str;
    }
    
    @Override
    public String toString(){
        
        String strng ="";
         strng+= "\n";
        strng+= "Ostrich; ";
        strng+= "\n";
        strng+= "name: ";
        strng+= name;
        strng+= "\n";
        strng+= "colour: ";
        strng+= getColour();
        strng+= "\n";
        
        strng+= "Has thin long legs: ";
        strng+= hasThinLongLegs;
        strng+= "\n";
        strng+= "Is tall: ";
        strng+= isTall;
        strng+= "\n";
        strng+= "Can fly: ";
        strng+= flies;
        strng+= "\n";
        
        strng+= "Has feathers: ";
        strng+= hasFeathers;
        strng+= "\n";
        strng+= "Has wings: ";
        strng+= hasWings;
        strng+= "\n";
        strng+= "Can sing: ";
        strng+= "tra la la";
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
        
        if(object instanceof Ostrich)
        {
            Ostrich ostrich = (Ostrich)object;
            
            if(this.name == ostrich.name)
                {
                    return true;
            }
        }
        return false; //default equals
    }
}
