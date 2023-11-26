package curs9homework.curs9homeworkextramile;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortedSet {
    TreeSet<Integer> numbers = new TreeSet<>();

    public void add(Integer integerToAdd) {
        numbers.add(integerToAdd);
    }

    public void remove(Integer integerToRemove) {
        numbers.remove(integerToRemove);
    }

    public Integer get(Integer getIndex) {
        List<Integer> convertedNumbers = new ArrayList<Integer>(numbers);
        return convertedNumbers.indexOf(getIndex);
    }
}