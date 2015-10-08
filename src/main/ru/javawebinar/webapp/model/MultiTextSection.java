package main.ru.javawebinar.webapp.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tanja Berenzon on 02.10.2015.
*/

public class MultiTextSection extends Section {
    private final List<String> lines;

    public MultiTextSection(List<String> lines) {
        this.lines = lines;
    }

    public List<String> getLines() {
        return lines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MultiTextSection that = (MultiTextSection) o;

        return lines.equals(that.lines);

    }

    @Override
    public int hashCode() {
        return lines.hashCode();
    }
}