package curs9homework.company;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.employ(new Person("Walter Moore", 41, "manager"));
        company.employ(new Person("Anne White", 35, "carpenter"));
        company.employ(new Person("Christopher Bennett", 50, "walder"));
        company.employ(new Person("Thomas Bennett", 41, "plumber"));
        company.employ(new Person("James Black", 45, "carpenter"));
        System.out.println(company.getManager());
        System.out.println(company.getPersons("carpenter"));
        System.out.println(company.getPersonsOlder(40));
        System.out.println(company.getPerson("Bennett"));
    }
}
