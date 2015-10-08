package main.ru.javawebinar.webapp.model;

import java.time.LocalDate;

/**
 * Created by T.Berenzon on 01.10.2015.
 */
public class Position {
    private LocalDate startDate;
    private LocalDate endDate;
    private String title;
    private String description;

    public Position(LocalDate startDate, LocalDate endDate, String title, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Position position = (Position) o;

        if (!startDate.equals(position.startDate)) {
            return false;
        }
        if (endDate != null ? !endDate.equals(position.endDate) : position.endDate != null) {
            return false;
        }
        if (!title.equals(position.title)) {
            return false;
        }
        return !(description != null ? !description.equals(position.description) : position.description != null);

    }

    @Override
    public int hashCode() {
        int result = startDate.hashCode();
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + title.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

}
