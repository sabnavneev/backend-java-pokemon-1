package pokemon;

public class Fire extends Pokemon {
    private String favoriteMovie;
    private int width;
    private double bodyTemp;
    private boolean isStrong;


    // Constructor
    public Fire(int number, String name, int age, String favoriteMovie, int width, double bodyTemp, boolean isStrong) {
        super(number, name, age);
        this.favoriteMovie = favoriteMovie;
        this.width = width;
        this.bodyTemp = bodyTemp;
        this.isStrong = isStrong;
    }

    // Getters & Setters
    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public void setFavoriteMovie(String favoriteMovie) {
        this.favoriteMovie = favoriteMovie;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Methodes
    public void calcStrength(){
        double superPower = (width * bodyTemp);
    }

    public void isHot(){
        System.out.println("I am so hot!");
    }

}
