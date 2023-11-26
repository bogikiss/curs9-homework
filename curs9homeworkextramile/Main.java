package curs9homework.curs9homeworkextramile;

public class Main {
    public static void main(String[] args) {
        SortedSet name = new SortedSet();
        name.add(1);
        name.add(5);
        name.add(2);
        name.add(3);
        name.add(4);
        System.out.println(name.numbers);
        name.remove(2);
        System.out.println(name.numbers);
        System.out.println(name.get(3));
    }
}
