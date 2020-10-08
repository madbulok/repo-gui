public class JavaMain {

    public static void main(String[] args) {
        Person[] persArray = {
                new Person("89992002121", "artem@bk.ru", "hr", 40000L, 23),
                new Person("89992002123", "ivan@bk.ru", "seo", 50000L, 25),
                new Person("89992002124", "sergey@bk.ru", "c++ developer", 70000L, 51),
                new Person("89992002125", "vladimir@bk.ru", "androidi developer", 80000L, 21),
                new Person("89992002126", "alex@bk.ru", "teamlead", 120000L, 46),
        };
        for (Person person: persArray) {
            if (person.getAge() > 41) person.info();
        }
    }
}

class Person {
    private String phone;
    private String email;
    private String stuff;
    private long salary;
    private int age;

    public Person(String phone, String email, String stuff, long salary, int age) {
        this.phone = phone;
        this.email = email;
        this.stuff = stuff;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Email: "+email+
                " Phone: "+phone+
                " Stuff: "+stuff+
                " Salary: "+ salary+
                " Age: "+ age;
    }

    public void info(){
        System.out.printf("Email: %s Phone: %s Stuff: %s Salary: %d Age: %d\n", email, phone, stuff, salary, age);
    }
}
