package main.ru.javawebinar.webapp.model;

import java.util.Collection;

/**
 * Created by Tanja Berenzon on 02.10.2015.
*/

public class MultiTextSection extends Section {
    private Collection<String> content;
    Segment segment;

    public MultiTextSection(Segment segment) {
        this.segment = segment;

    }
}
