public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int value;
            while (true) {
                try {
                    System.out.print("Введите целое положительное число: ");
                    value = scanner.nextInt();
                    checkInput(value);
                    break;
                } catch (InvalidNumberException ex) {
                    System.out.println("Ошибка: " + ex.getMessage() + "\n");
                    scanner.nextLine();
                }
            }
        }
    }

    /**
     * checkInput - метод объявляет, что может выкинуть исключение типа InvalidNumberException.
     * Внутри метода происходит проверка значения value. Если оно меньше или равно нулю,
     * то выбрасывается исключение.
     * В остальных случаях - выводится сообщение о корректности ввода данных.
     *
     * @param value - проверяемое значение.
     * @throws InvalidNumberException - новый объект-исключение.
     */
    public static void checkInput(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("некорректное число.");
        }
        System.out.println("Число " + value + " - корректно.");
    }
}

/**
 * InvalidNumberException - конструктор, который наследуется от класса Exception.
 * Имеет один метод для вывода сообщений на консоль.
 */
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}