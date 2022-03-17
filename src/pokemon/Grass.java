package pokemon;

public class Grass extends Pokemon {
    private String favoriteSport;
    private int height;
    private double shoeSize;
    private boolean isAdult;

    // Constructor
    public Grass(int number, String name, int age, String favoriteSport, int height, double shoeSize, boolean isAdult) {
        super(number, name, age);
        this.favoriteSport = favoriteSport;
        this.height = height;
        this.shoeSize = shoeSize;
        this.isAdult = isAdult;
    }

    // Getters & Setters
    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    // Methodes
    public void calcSpeed(){
        double superPower = (height * shoeSize);
    }

    public void isGreen(){
        System.out.println("Oh my god, my nose is green!");
    }


}
