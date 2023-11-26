package curs9homework.bouquet;

public class Main {
    public static void main(String[] args) {
        Flower bouquet = new Flower();
        bouquet.add("tulip");
        bouquet.add("rose");
        bouquet.add("lily");
        bouquet.add("lily");
        bouquet.remove("rose");
        bouquet.add("orchid");
        System.out.println(bouquet.getAll());
    }
}
