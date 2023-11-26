package curs9homework.basket;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Basket {
    private List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = fruits;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public boolean find(String stringToFind){
        return fruits.contains(stringToFind);
    }

    public boolean remove(String stringToRemove){
        return fruits.remove(stringToRemove);
    }

    public int position(String string){
        return fruits.indexOf(string);
    }

    public Set<String> distinct(){
        HashSet<String> distinct = new HashSet<>();
        for (String fruit : fruits){
            distinct.add(fruit);
        }
        return distinct;
    }

    public List<String> add(String string){
        fruits.add(string);
        return fruits;
    }

    public int count(){
        return fruits.size();
    }

    public int customCount(){
        int count = 0;
        for (int i=0; i< fruits.size(); i++){
            count++;
        }
        return count;
    }
}
