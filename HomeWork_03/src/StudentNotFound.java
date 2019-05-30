public class StudentNotFound extends Exception {

    @Override
    public String getMessage(){
        return "Student not found" + '\n';
    }
}
