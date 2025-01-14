package Workshop8;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        System.out.println(student);
        student.setName("Bob");
        student.setAge(22);
        System.out.println(student);
    }
}



