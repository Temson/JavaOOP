public class Main {
    public static void main(String[] args) throws FullGroupException, StudentNotFoundException {


        Student stud1 = new Student("Martin", "McFly", 18, Gender.MALE, 1000001);
        Student stud2 = new Student("Martha", "Stewart", 17, Gender.FEMALE, 1000002);
        Student stud3 = new Student("Rebecca", "Coulson", 17, Gender.FEMALE, 1000003);
        Student stud4 = new Student("Antony", "Burke", 19, Gender.MALE, 1000004);
        Student stud5 = new Student("Joseph", "Conrad", 20, Gender.MALE, 1000005);
        Student stud6 = new Student("Andrea", "Elson", 21, Gender.FEMALE, 1000006);
        Student stud7 = new Student("Jennifer", "Lowson", 19, Gender.FEMALE, 1000007);
        Student stud8 = new Student("Peter", "Hamish", 17, Gender.MALE, 1000008);
        Student stud9 = new Student("Richard", "Dawson", 18, Gender.MALE, 1000009);
        Student stud10 = new Student("Tijs", "Vervest", 18, Gender.MALE, 1000010);
        Student stud11 = new Student("Silvia", "Rodrigues", 19, Gender.FEMALE, 1000011);
        Student stud12 = new Student("Chen", "Lun", 20, Gender.MALE, 1000012);
        Student stud13 = new Student("Prachit", "Sharma", 20, Gender.MALE, 1000013);
        Student stud14 = new Student("Marcus", "Schulz", 19, Gender.MALE, 1000014);

        Group gr = new Group();
        try {
            gr.addStudent(stud1);
            gr.addStudent(stud2);
            gr.addStudent(stud3);
            gr.addStudent(stud4);
            gr.addStudent(stud5);
            gr.addStudent(stud6);
            gr.addStudent(stud7);
            gr.addStudent(stud8);
            gr.addStudent(stud9);
            gr.addStudent(stud10);
            gr.addStudent(stud11);
            gr.addStudent(stud12);
        } catch (FullGroupException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(gr);

        gr.searchBySurname("Dawson");


        gr.delStudent(1000007);

        System.out.println(gr);

    }
}
