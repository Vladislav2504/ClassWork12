import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private double height;
    private boolean married;

    public Person(String name, int age, double height, boolean married ){
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public double getMarried() {

        return 0;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
