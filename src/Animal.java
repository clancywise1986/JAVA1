public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println("My name is: " + name);

    }
    public void whoAmI() {
        System.out.println("I am an  Animal");

    }
}
