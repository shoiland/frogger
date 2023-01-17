import java.util.List;

public class Frog {
    //static constants/variables
    public static final int DEFAULT_AGE = 5;
    public static final double DEFAULT_TONGESPEED = 5;
    private static String species = "Rare Pepe";
    //instance variables
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;

    //constructors
    public Frog(String name, double age, double tongueSpeed) {
        this.name = name;
        this.age = (int) age;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name, int age, double tongueSpeed) {
        this(name, (double) age, tongueSpeed);
    }

    public Frog(String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGESPEED);
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String updatedSpecies) {
        species = updatedSpecies;

    }

    //methods
    public void grow(int months) {
        if (this.age < 12) {
            this.tongueSpeed += (months - 1);
            this.age += months;
            this.isFroglet = this.age > 1 && this.age < 7;
        } else if (this.age >= 30 && months != 0) {
            this.age += months;
            int decrease_tongue_by = this.age - 31;
            this.tongueSpeed -= decrease_tongue_by;
            if (this.tongueSpeed < 5) {
                this.tongueSpeed = 5;
            }
            this.isFroglet = this.age > 1 && this.age < 7;
        } else {
            this.age += months;
            this.isFroglet = this.age > 1 && this.age < 7;
        }
    }

    public void grow() {
        this.age += 1;
        this.tongueSpeed += 1;
    }

    public void eat(Fly fly) {
        if (fly.isDead()) {

        } else if (this.tongueSpeed > fly.getSpeed()) {
            if (fly.getMass() >= 0.5 * this.age) {
                this.grow();
                fly.setMass(0.0);
            }
        } else {
            fly.grow(1);
        }
    }

    public String toString() {
        this.isFroglet = this.age > 1 && this.age < 7;
        if (this.isFroglet) {
            return "My name is " + this.name + " and I'm a rare froglet! I'm " + this.age + " months old and my tongue has a speed of " + this.tongueSpeed + ".";
        } else {
            return "My name is " + this.name + " and I'm a rare frog. I'm " + this.age + " months old and my tongue has a speed of " + this.tongueSpeed + ".";
        }
    }

}
