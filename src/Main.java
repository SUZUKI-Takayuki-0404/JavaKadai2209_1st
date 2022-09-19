public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("------------");

        for (int i = 0; i < 12; i++) {
            if (i < 10) {
                System.out.print("Hello world!");
            } else {
                System.out.print("Hello");
            }
            System.out.println(" [" + (i + 1) + "]");
        }

    }

}