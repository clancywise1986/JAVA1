public class SNOJI {
    public static void main(String[] args) {
        Animal someAnimal = new Animal("Cow");
        someAnimal.printName();
        someAnimal.whoAmI();
        System.out.println("=======================");

        Bird parrot = new Bird("Charlie",2, true);
        parrot.printName();
        parrot.whoAmI();
        System.out.println("=======================");

        Bird ostrich = new Bird("Max");
        ostrich.setNumberOfWings(4);
        ostrich.setCanFly(false);
        ostrich.printBird();
    }
}
