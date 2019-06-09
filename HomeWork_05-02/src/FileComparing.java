import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileComparing {

    public static void fileComparing(String firstFilePath, String secondFilePath, String resultFilePath) {
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(firstFilePath));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(secondFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFilePath))) {

            String str1 = "";
            String str2 = "";
            StringBuilder stringBuilder1 = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();

            while ((str1 = bufferedReader1.readLine()) != null) {
                String lc1 = str1.toLowerCase();
                stringBuilder1.append(lc1).append(" ");
            }


            while ((str2 = bufferedReader2.readLine()) != null) {
                String lc2 = str2.toLowerCase();
                stringBuilder2.append(lc2).append(" ");
            }

            String[] strings1 = stringBuilder1.substring(0).split("\\s");
            String[] strings2 = stringBuilder2.substring(0).split("\\s");
            List<String> temp = new ArrayList<String>();

            for (String s : strings1) {
                for (String s1 : strings2) {
                    if (s1.equals(s)) {
                        if (!temp.contains(s1)){
                            temp.add(s1);
                            bufferedWriter.write(s1 + "\n");
                        }

                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done!");
        System.out.println("Result File '" + resultFilePath + "' was successfully created.");

    }
}
