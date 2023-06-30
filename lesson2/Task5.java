package lesson2;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double divisible;
            double divider;
            while (true) {
                try {
                    System.out.print("Введите делимое: ");
                    divisible = scanner.nextDouble();
                    break;
                } catch (InputMismatchException ex) {
                    System.out.println("Ошибка: введенные данные не являются цифрой.\n");
                    scanner.nextLine();
                }
            }

            while (true) {
                try {
                    System.out.print("Введите делитель: ");
                    divider = scanner.nextInt();
                    checkInput(divider);
                    break;
                } catch (DivisionByZeroException ex) {
                    System.out.println("Ошибка: " + ex.getMessage() + "\n");
                    scanner.nextLine();
                } catch (InputMismatchException ex){
                    System.out.println("Ошибка: введенные данные не являются цифрой.\n");
                    scanner.nextLine();
                }
            }
            System.out.printf("Решение: %s / %s = %s", divisible, divider, String.format("%.2f", divisible / divider));
        } catch (Exception ex) {
            System.out.println("Ошибка.\n");
            scanner.nextLine();
        }
    }