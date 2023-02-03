import java.util.*;
public class Main {
    public static void main(String[] args) {

        LinkedList<String> mass = new LinkedList<>();
        mass.add("каждый");
        mass.add("охотник");
        mass.add("желает");
        mass.add("знать");
        mass.add("где");
        mass.add("сидит");
        mass.add("фазан");

        System.out.println(mass);

        mass.addLast("!");
        System.out.println(mass);

        mass.remove(0);
        System.out.println(mass);

        System.out.println(mass.peekFirst());





    }





    }
