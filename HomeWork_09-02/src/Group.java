import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Group implements Serializable, Voencom {

    private static final long serialVersionUID = 1L;
    private final static int MAX_GROUP_SIZE = 10;
    private List<Student> students = new ArrayList<Student>();


    public Group(List<Student> students) {
        super();
        this.students = students;
    }

    public Group() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public void addStudent(Student student) throws FullGroupException{
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        if (students.size() < MAX_GROUP_SIZE) {
            students.add(student);
        } else {
            throw new FullGroupException();
        }
    }


    public void delStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getStudentId() == id) {
                Student st = students.get(i);
                students.remove(i);
                System.out.println("Student [" + st.toString() + "] was successfully deleted." + '\n');
                return;
            }
        }

    }


    public Student searchBySurname(String surname) throws StudentNotFoundException {
        for (Student student: students) {
            if (student != null && student.getSurname().equals(surname)) {
                String res = "Search result by request " + "'" + surname + "'" + ": " + "[" + student + "]" + '\n';
                System.out.println(res);
                return student;
            }
        }
        throw new StudentNotFoundException(); // должно быть без эксепшена, return null;
    }

    private void sortGroup() {
        students.sort(Comparator.comparing(Student::getSurname));
    }


    @Override
    public String toString() {
        sortGroup();
        System.out.println("Current Group");
        System.out.println("List of Students:");
        for (Student student:students) {
           if (student != null){
               System.out.println(student.toString());
           }
        }
        return "";
    }

    public Student[] getRecruter(){
        int n = 0;
        for (Student student : students) {
            if (student != null && student.getAge() >= 18 && student.getAge() < 27 && student.getSex() == Gender.MALE) {
                    n += 1;
            }
        }
        Student[] recuits = new Student[n];
        int i = 0;
        for (Student student : this.students) {
            if (student != null && student.getAge() >= 18 && student.getAge() < 27 && student.getSex() == Gender.MALE) {
                recuits[i++] = student;
            }
        }
        return recuits;
    }
}
