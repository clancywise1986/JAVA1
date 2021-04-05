public class Bird extends Animal{


    private int numberOfWings;
    private boolean canFly;

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public Bird(String name, int numberOfWings, boolean canFly) {
        super(name);
        this.numberOfWings = numberOfWings;
        this.canFly = canFly;
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a  Bird");

    }
    public void printBird(){
        String fly ="";
        if (this.isCanFly() == true)
            fly = "Yes";
        else
            fly = "No";
        System.out.println("I am Bird");
        System.out.println("My name is : "+super.getName());
        System.out.println("I have : "+this.getNumberOfWings() + " wings");
        System.out.println("Can I fly ? : "+fly);
    }

}
