public class FullGroupException extends Exception {

    @Override
    public String getMessage(){
        return "Current Group is full." + '\n';
    }
}
