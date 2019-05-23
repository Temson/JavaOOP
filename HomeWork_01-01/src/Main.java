public class Main {
    public static void main(String[] args) {

        Cat cat01 = new Cat("Murka", 3, 5, "American Curl", "Tiger Grey", "Green", "Female", "Whiskas");
        System.out.println(cat01.getNickName());
        cat01.getVoice();
        cat01.getPurr();
        System.out.println(cat01.toString());
        System.out.println();

        Cat cat02 = new Cat("Felix", 2, 6, "Burmese", "Black", "Yellow", "Male", "Cream");
        System.out.println(cat02.getNickName());
        cat02.getVoice();
        cat02.getPurr();
        System.out.println(cat02.toString());
        System.out.println();

        Cat cat03 = new Cat("Vaska", 4, 5.5, "British Shorthair", "Smoky Grey", "Green", "Female", "Goose Liver");
        System.out.println(cat03.getNickName());
        cat03.getVoice();
        cat03.getPurr();
        System.out.println(cat03.toString());
        System.out.println();

    }



}
