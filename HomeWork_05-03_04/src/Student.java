
public class Student extends Human {

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

}
