import java.io.File;
import java.io.IOException;

public class Dir {

    public static void copyDir(String sourceDirPath, String targetDirPath, String fileType) throws IOException {
        File sourceDir = new File(sourceDirPath);
        File targetDir = new File(targetDirPath);
        MyFileFilter mFF = new MyFileFilter(fileType);


        if (sourceDir == null || targetDir == null) {
            throw new IllegalArgumentException();
        }

        File[] fileList = sourceDir.listFiles(mFF);
        for (File file : fileList) {
            String targetPath = file.getPath().replace(sourceDir.getPath(), targetDir.getPath());
            IOService.fileCopy(file, new File(targetPath));
            System.out.println("File [" + file.getName() + "] was successfully copied from [" + sourceDir.getCanonicalPath() + "] to [" + targetDir.getCanonicalPath() + "]");
        }
    }



}
