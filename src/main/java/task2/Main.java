package task2;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Brandon", "Texas");
        System.out.println(person.toString());

        Student student = new Student("Adam", "California", "Civil Enginering", 7, 20000);
        System.out.println(student.toString());

        Lecturer lecturer = new Lecturer("Cris", "Ohia", "civil", 2000);
        System.out.println(lecturer.toString());
    }
}
