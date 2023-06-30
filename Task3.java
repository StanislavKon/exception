public class Task3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line;
            int numbersSum = 0;
            try {
                while ((line = br.readLine()) != null) {
                    try {
                        numbersSum += Integer.parseInt(line);
                    } catch (NumberFormatException ex) {
                        System.out.println("Некорректное значение числа в файле.");
                    }
                } System.out.println("Сумма чисел: " + numbersSum);
            } catch (IOException ex) {
                System.out.println("Ошибка чтения файла.");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден.");
        }
    }
}