public class Cat {

    private byte age;
    private String name;

    public Cat() {}

    public Cat(byte age, String name) {
        this.name = name;
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
