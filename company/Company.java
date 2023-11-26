package curs9homework.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Person> employees = new ArrayList<>();

    public Person getManager(){
        for (Person employee : employees){
            if (employee.getPosition() == "manager"){
                return employee;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession){
        List<Person> result = new ArrayList<>();
        for (Person employee : employees) {
            if (profession.equals(employee.getPosition())) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Person> getPersonsOlder(int age){
        List<Person> result = new ArrayList<>();
        for (Person employee : employees) {
            if (age < employee.getAge()) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<Person> getPerson(String filterName){
        List<Person> result = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getName().contains(filterName)) {
                result.add(employee);
            }
        }
        return result;
    }

    public void employ(Person employee){
        employees.add(employee);
    }
}
