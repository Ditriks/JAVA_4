import java.util.*;
public class Main {
    public static void main(String[] args) {

        LinkedList<String> skor = new LinkedList<String>();

        skor.add("шла");
        skor.add("Саша");
        skor.add("по");
        skor.add("шоссе");
        skor.add("и");
        skor.add("сосала");
        skor.add("сушку");

        System.out.println(skor);

        Iterator x = skor.descendingIterator();
        while (x.hasNext()) {
            System.out.print(x.next() + " ");
        }

    }





    }
