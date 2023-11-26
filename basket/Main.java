package curs9homework.basket;

import curs9homework.basket.Basket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Basket basket = new Basket(fruits);
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(basket.getFruits());
        System.out.println(basket.find("apple"));
        System.out.println(basket.remove("grapefruit"));
        System.out.println(basket.position("apple"));
        System.out.println(basket.distinct());
        System.out.println(basket.add("lemon"));
        System.out.println(basket.count());
        System.out.println(basket.customCount());
    }
}
