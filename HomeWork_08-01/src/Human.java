import java.io.Serializable;

public class Human implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private int age;
    private Gender sex;

    public Human(String name, String surname, int age, Gender sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + ", Name: " + name + ", Age: " + age + ", Sex: " + sex;
    }
}
