package animal;

/**
 * @Author lihaiyu
 * @Date 2020/11/10 22:30
 */
public class Dog {
    private String eyeColor;
    private int age;

    public Dog(String eyeColor, int age) {
        this.eyeColor = eyeColor;
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
}
