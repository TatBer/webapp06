package main.ru.javawebinar.webapp.store;


import main.ru.javawebinar.webapp.model.ContactType;
import main.ru.javawebinar.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by Tanja on 08.10.2015.
 */

public class ArrayStorage implements IStore {
    public static final int MAX_LENGTH = 10000;

    private Resume[] array = new Resume[MAX_LENGTH];

    @Override
    public void clear() {

    }

    @Override
    public void save(Resume r) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < MAX_LENGTH; i++) {

            r.add(new Resume(i.toString(), "Berenzon Tanja", ContactType.PHONE("222"), ContactType.ICQ("xxx"),ContactType.MAIL("xcv"),
        }
        System.out.println(sb.toString());
        System.out.println(ArrayStorage.MAX_LENGTH);
        r.add(new Resume("1000", "Berenzon Tanja", "", "");


    }

    @Override
    public void update(Resume r) {


    }

    @Override
    public Resume load(String uuid) {


        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
