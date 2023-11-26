package curs9homework.company;

public class Person {
    private String name;
    private Integer age;
    private String position;

    public Person(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return "name: %s, age: %s, position: %s".formatted(name, age, position);
    }

}
