package pokemon;

public class Electric extends Pokemon {
    private String favoriteSong;
    private int backAccountNumber;
    private double hairLength;
    private boolean isBrave;

    // Constructor
    public Electric(int number, String name, int age, String favoriteSong, int backAccountNumber, double hairLength, boolean isBrave) {
        super(number, name, age);
        this.favoriteSong = favoriteSong;
        this.backAccountNumber = backAccountNumber;
        this.hairLength = hairLength;
        this.isBrave = isBrave;
    }

    // Getters & Setters
    public String getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public double getHairLength() {
        return hairLength;
    }

    public void setHairLength(double hairLength) {
        this.hairLength = hairLength;
    }

    // Methodes
    public void calcEnergy(){
        double superPower = (backAccountNumber * hairLength);
        System.out.println("Mijn energie score is: " + superPower);
    }

    public void isReady(){
        System.out.println("I can't wait to start!");
    }

}
