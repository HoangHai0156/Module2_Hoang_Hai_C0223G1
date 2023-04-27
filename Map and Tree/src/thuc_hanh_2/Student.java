package thuc_hanh_2;

public class Student {
    private String name;
    private int age;
    private String homeTown;

    public Student(String name, int age, String homeTown) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
