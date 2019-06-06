import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String sourceDirPath = ".\\SourceDir";
        String targetDirPath = ".\\TargetDir";
        String fileType = "docx";

        Dir.copyDir(sourceDirPath, targetDirPath, fileType);
    }

}
