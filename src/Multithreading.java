public class Multithreading {
    static boolean coincided = false;
    public static void main(String[] args) {
        double a = Math.random() * 10;
        int b = (int) a ;
        System.out.println(b + " - загаданное число");
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try { int i = 0;
                    while (1 < 1000000) {
                        System.out.println("Время " + i++);
                        Thread.sleep(1000);
                        if(coincided == true) {
                            break;
                        }
                    }
                } catch (Exception e) {}
            }
        });
        timer.start();

        Thread fortuneteller = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        double c = Math.random() * 10;
                        int d = (int)c;
                        System.out.println("Число " + d);
                        if (d == b) {
                            coincided = true;
                            System.out.println("Гадалка угадала загаданное число b");
                            break;
                        }
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {}
            }
        });
        fortuneteller.start();
    }
}