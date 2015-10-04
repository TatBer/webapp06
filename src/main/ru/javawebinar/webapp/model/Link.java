package main.ru.javawebinar.webapp.model;

/**
 * Created by T.Berenzon on 01.10.2015.
 */

public class Link {
    private final String name;
    private final String url;

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}