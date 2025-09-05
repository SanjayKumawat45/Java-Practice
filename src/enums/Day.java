package enums;

public enum Day {
    SUNDAY("sunday"), MONDAY("monday"), TUESDAY("tuesday"), WEDNESDAY("wednesday"), THURSDAY("thursday"), FRIDAY("friday"), SATURDAY("saturday");


    private String lower;

    private Day(String lower){
        this.lower = lower;
        System.out.println("our constructor called");
    }

    public String display(){
        return "Today is " + this.name();
    }
}
