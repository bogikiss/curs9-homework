package curs9homework.bouquet;

import java.util.HashSet;

public class Flower {
    private HashSet<String> name = new HashSet<>();

    public HashSet<String> getAll() {
        return name;
    }

    public void add(String stringToAdd) {
        name.add(stringToAdd);
    }

    public void remove(String stringToRemove) {
        name.remove(stringToRemove);
    }

}
