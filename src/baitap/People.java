package baitap;

public class People {
    private String name;
    private int age;
    private String sex;
    private double height;
    private int weight;
    public People (){}

    public People(String name, int age, String sex, double height, int weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                " name =" + name + '\'' +
                " age = " + age +
                " sex = " + sex + '\'' +
                " height =" + height +
                " weight =" + weight ;
    }
}
