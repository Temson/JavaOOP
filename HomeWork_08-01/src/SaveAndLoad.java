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

/*    public static void groupOutput(Object object, String file) {
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(file))) {
            OOS.writeObject(object);
            System.out.println("Group was saved to file");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Group groupInput(String file) {
        Group inputGroup = null;
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(file))) {
            inputGroup = (Group) OIS.readObject();
            System.out.println("Group was loaded from file");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return inputGroup;
    }
*/


    public static void groupOutput(Group group, File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file.getName());
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(group);
        fos.close();
        oos.close();
    }

    public static Group groupInput(File file) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(file.getName());
        ObjectInputStream ois = new ObjectInputStream(fis);
        Group group = (Group) ois.readObject();
        fis.close();
        ois.close();
        return group;
    }
}
