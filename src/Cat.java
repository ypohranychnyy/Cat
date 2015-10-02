/**
 * Created by ypoh on 02.10.2015.
 */
public class Cat {
    private String name;
    private String color;
    private int age;
    private boolean sex;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void voice(){
        System.out.printf("Murrr-murrr");
    }
}
