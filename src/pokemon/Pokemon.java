package pokemon;

public abstract class Pokemon {
    private int number;
    private String name;
    private int age;

    // Constructor
    public Pokemon(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    // Getters & Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methode
    public void increaseAge(){
        age++;
    }

    public void tailLength(int a, int b){
        int c = a * b;
        System.out.println("My tail is: " + c + " inch long");
    }
}
