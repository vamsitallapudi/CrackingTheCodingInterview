public class Student {
    private int age;
    private String name;
    public static String uniform = "white";


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

    public static int  fetchBatchNo() {
        return (int) Math.floor(Math.random()*100);
    }
}
