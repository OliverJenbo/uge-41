package Task_1;

public class Driver {
    private int age;
    private String name;

    //konstruktør
    public Driver(int age, String name){
        this.age= age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Is driven by:{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

