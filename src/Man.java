public class Man {
    private String name;
    private String position;
    private int age;
    private double growth;

    public Man(String name, String position, String age, String growth) {
        this.name = name;
        this.position = position;
        this.age = Integer.parseInt(age);
        this.growth = Double.parseDouble(growth);
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getAge() {
        return age;
    }
    public double getGrowth() {
        return growth;
    }
}
