package innerclasses;

public class Computer {
    private String brand;
    private String model;

    public OperatingSystem getOs() {
        return os;
    }

    OperatingSystem os;

    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

 public class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: "+ model + ", OS: "+ osName +" os = " + os);
        }
    }

}
