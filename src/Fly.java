public class Fly {
    //instance variables
    private double mass;
    private double speed;

    //static constants/variables
    public static final double DEFAULT_SPEED = 10;
    public static final double DEFAULT_MASS = 5;

    //constructors
    public Fly(double mass){
        this(mass, DEFAULT_SPEED);
    }

    public Fly(){
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }

    //methods
    public double getMass(){
        return this.mass;
    }

    public void setMass(double mass){
        if (mass == 0.0){
            this.mass = mass;
        } else {
            this.mass += mass;
            setSpeed(mass);

        }
    }

    public void setSpeed(double newMass){
        if (this.mass < 20.0){
            this.speed += newMass;
        } else {
            this.speed = this.speed - newMass * 0.5;
        }
    }

    public double getSpeed(){
        return this.speed;
    }
    public boolean isDead(){
        return this.mass == 0;
    }
    public String toString(){
        if (this.mass == 0){
            return "I'm dead, but I used to be a fly with a speed of " + String.format("%.2f", this.speed) + ".";
        } else {
            return "I'm a speedy fly with " + String.format("%.2f", this.speed) + " speed and " + String.format("%.2f", this.mass) + " mass.";
        }
    }
    public void grow(int newMass){
        if (newMass != 0){
            setMass((double) newMass);
        }


    }
}
