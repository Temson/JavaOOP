import java.io.*;

public class SaveAndLoad {

    public static void saveGroup(Group group){
        File f = new File("Group.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            for (Student i:group.getStudents()) {
                if (i != null){
                    bw.write(i.getName() + "," + i.getSurname() + "," + i.getAge() + "," + i.getSex() + "," + i.getStudentId() );
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("\n" + "Group is saved to File." + "\n");
    }

    public static Group loadGroup(String file){
        File f = new File(file);
        Group gr = new Group();
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String str = "";
            for (; (str = br.readLine()) != null;) {
                String[] str1 = str.split(",");
                gr.addStudent(new Student(str1[0], str1[1], Integer.valueOf(str1[2]), Gender.valueOf(str1[3].toUpperCase()), Integer.valueOf(str1[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (FullGroupException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + "Group is loaded from File." + "\n");
        return gr;
    }


}
