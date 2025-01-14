package Workshop8;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    public static void main(String[] args) {
        Student student = new Student("Bibidh", 18);
        System.out.println(student);
    }
}


