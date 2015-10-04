package main;

import java.util.List;
import main.ru.javawebinar.webapp.model.Link;

/**
 * User: T.Berenzon
 * Date: 18.06.2014
 */
 public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello WebApp!");


            /**Link link = new Link("Siemens", "link");
            new Main().test(link.i, link.getName(), link);
            System.out.println(link.i + " " + link.getName() + " " + link.getUrl());
            System.out.println("equals: " + (link.getClass() == Link.class));
            System.out.println(link.toString());
            System.out.println(Arrays.toString(link.getClass().getMethods()));
             */
        }
    }
}