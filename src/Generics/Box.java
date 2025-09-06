package Generics;

public class Box<N extends Number> {
    private N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}
