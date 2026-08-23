package Day16.classwork.GenericInterface;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Generic<String> g  = new Generic<String>();

        g.add("Shivam");
        System.out.println(g.retreive());
    }

}
