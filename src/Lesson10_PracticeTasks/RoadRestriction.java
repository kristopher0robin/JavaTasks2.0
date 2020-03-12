package Lesson10_PracticeTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoadRestriction {
    public static void main(String[] args) throws IOException {
        // Обработать аргументы, переданные через командную строку
        RoadRestriction roadRestriction = new RoadRestriction();
        String arg1 = args[0]; // путь к файлу
//        String arg2 = args[1]; // дата

        //  Прочитать файл построчно
        try {
            File file = new File(arg1);
            Scanner sc = new Scanner(file);

            ArrayList<String> arr = new ArrayList<>();

            while(sc.hasNext()) {
                String line = sc.next();
                arr.add(line);
                // Распарсили строки
                String[] splitted = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                System.out.println(Arrays.toString(splitted));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 4) Чтобы получить из строки дату, можно использовать SimpleDateFormat

        // 5) Сравнить даты
    }

    /**@
    private void debug() {
        System.out.println("Какие-то действия по параметру debug");
    }

    private void help() {
        System.out.println("Какие-то действия по параметру help");
    }
     */
}
