package pokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Fire charmander = new Fire(4, "Charmander", 24, "Buurman&Buurman", 15, 48, true);
        Electric pikachu = new Electric(25, "Pikachu", 9, "Sexy als ik dans", 4578945, 1.25, true);
        Grass sunflora = new Grass(192, "Sunflora", 16, "Hockey", 145, 33.5, false);
        Water wartortle = new Water(8, "Wartortle", 19,"Spa-Rood", 5, 40, true);

        // Wijzig de breedte van Charmander
        charmander.setWidth(17);
        System.out.println(charmander.getWidth());

        // Bereken de energy score van Pikachu
        pikachu.calcEnergy();

        // Bereken de lengte van de staart van Charmander (via super class) en Wartortle (via subclass @Override)
        charmander.tailLength(5,7);
        wartortle.tailLength(5,7);

        // Print the color of Sunflora's nose
        sunflora.isGreen();

        // It's Pikachu's Birthday!
        pikachu.increaseAge();
        System.out.println("Pikachu is now " + pikachu.getAge() + " years old");

    }
}
