public class Car {

    private String model = "Mustang 1965 Shelby GT350";
    private int year = 1965;

    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }


    public void accelerate(int increment){
        speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
                if (speed < 0){
                    speed = 0;
                }
    }

}
