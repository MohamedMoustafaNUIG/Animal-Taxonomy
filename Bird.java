public class Bird extends Animal
{
    boolean hasFeathers;
    boolean hasWings;
    boolean flies;

    public Bird()
    {
        super();
        colour = "black";
        hasFeathers = true;
        hasWings = true;
        flies = true;
    }

    @Override
    public void move(int distance){
        if(flies){
            System.out.printf("I fly %d metres \n", distance);
        }else{
            System.out.printf("I am a bird but cannot fly. I walk %d metres \n", distance);
        }
    }
    
    public void sing(){
        System.out.println("tra la la");
    }

    public boolean hasWings(){
        return hasWings;
    }
    
    public boolean hasFeathers(){
        return hasFeathers;
    }
}
