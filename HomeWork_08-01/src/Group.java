import java.io.Serializable;

public class Group implements Serializable, Voencom {

    private static final long serialVersionUID = 1L;

    private Student[] students = new Student[10];

    public Group(Student[] group) {
        this.students = group;
    }


    public Group() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public void addStudent(Student student) throws FullGroupException{
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }

        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                return;
            }
        }
        throw new FullGroupException();
    }

    public void delStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentId() == id) {
                Student st = students[i];
                students[i] = null;
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
        Student sorted;
        boolean flag;
        for (;;) {
            flag = true;
            for (int i = 0; i < students.length - 1; i++) {
                if ((students[i] == null) || ((students[i] != null) && (students[i + 1] != null))
                        && (students[i].getSurname().compareTo(students[i + 1].getSurname()) > 0)) {
                    sorted = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = sorted;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }



    @Override
    public String toString() {
//        sortGroup();
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
