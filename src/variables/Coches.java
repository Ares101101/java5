package variables;

public class Coches {

    String model;
    String color;
    int age;
    String fabric;

    public Coches(String model, String color, int age, String fabric) {
        this.model = model;
        this.color = color;
        this.age = age;
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", fabric='" + fabric + '\'' +
                '}';
    }
}
