public class Main {
    public static void main (String[] args) {
        String s = "Это Светлана, ей 24 года, ее рост 160.4 см. Должность - программист";
        String name = s.substring(3,12);
        String age = s.substring(17,19);
        String growth = s.substring(34,39);
        String position = s.substring(56,67);
        Man man = new Man(name, position, age, growth);
        System.out.println(man.getName());
        System.out.println(man.getAge());
        System.out.println(man.getGrowth());
        System.out.println(man.getPosition());
    }
}
