public class Cat {

    private String nickName;
    private int age;
    private double weight;
    private String breed;
    private String color;
    private String eyesColor;
    private String sex;
    private String ration;

    public Cat(String nickName, int age, double weight, String breed, String color, String eyes, String sex, String ration) {
        this.nickName = nickName;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.color = color;
        this.eyesColor = eyesColor;
        this.sex = sex;
        this.ration = ration;
    }

    public Cat() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public void getVoice() {
        System.out.println("Meow");
    }

    public void getPurr() {
        System.out.println("Purr");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                ", sex='" + sex + '\'' +
                ", ration='" + ration + '\'' +
                '}';
    }
}
