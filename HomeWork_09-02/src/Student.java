import java.io.Serializable;
import java.util.Objects;

public class Student extends Human implements Serializable {

    private static final long serialVersionUID = 1L;
    private int studentId;

    public Student(String name, String surname, int age, Gender sex, int studentId) {
        super(name, surname, age, sex);
        this.studentId = studentId;
    }

    public Student(String s, Gender gender, Integer integer) {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Student_ID: " + studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student other = (Student) o;
        return ((getName() != other.getName()) || (getSurname() != other.getSurname()) ||
                (getAge() != other.getAge()) || (getSex() != other.getSex()) || (studentId != other.studentId));
    }
/*
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.getName() == null ? 0 : this.getName().hashCode());
        result = prime * result + (this.getSurname() == null ? 0 : this.getSurname().hashCode());
        result = prime * result + this.getAge();
        result = prime * result + (this.getSex() == null ? 0 : this.getSex().hashCode());
        result = prime * result + this.studentId;
        return result;
    }


 */


   @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentId);
    }

}
