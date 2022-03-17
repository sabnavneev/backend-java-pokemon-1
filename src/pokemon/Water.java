package pokemon;

public class Water extends Pokemon {
    private String favoriteDrink;
    private int score;
    private double weight;
    private boolean isWet;

    // Constructor
    public Water(int number, String name, int age, String favoriteDrink, int score, double weight, boolean isWet) {
        super(number, name, age);
        this.favoriteDrink = favoriteDrink;
        this.score = score;
        this.weight = weight;
        this.isWet = isWet;
    }

    // Getters & Setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isWet() {
        return isWet;
    }

    public void setWet(boolean wet) {
        isWet = wet;
    }

    // Methodes
    public void calcLength(){
        double superPower = (score * weight);
    }

    public static void isTired(){
        System.out.println("Pff, let me sleep please");
    }

    @Override
    public void tailLength(int a, int b){
        int c = a + b;
        System.out.println("My tail is: " + c + " inch long");
    }
}
