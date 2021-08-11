public class Results {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(5, new Counter() {
            @Override
            public String report(int months) {
                return "Отчет за " + months + " месяцев";
            }
        });
    }
}
