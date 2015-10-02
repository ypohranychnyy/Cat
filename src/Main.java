/**
 * Created by ypoh on 02.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        Cat Murzik = new Cat("Murzik", "grey", 2);
        System.out.println("Age - "+Murzik.getAge());
        System.out.println("Name - "+Murzik.getName());
        System.out.println("Color - "+Murzik.getColor());

        Murzik.voice();

    }

}
