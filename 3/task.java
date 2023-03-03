import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("HUAWEI MateBook D15", 8, 256, "Windows 11", "серый", 15.6);
        Laptop laptop2 = new Laptop("HP 15-DW1495NIA", 4, 1024, "без ОС", "черный", 15.6);
        Laptop laptop3 = new Laptop("Acer Extensa 15", 8, 128, "Windows 10", "синий", 14.1);
        Laptop laptop4 = new Laptop("Apple MacBook Air A2337", 8, 256, "Mac OS", "серый космос", 13.3);
        Laptop laptop5 = new Laptop("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        Laptop laptop6 = new Laptop("HUAWEI MateBook D15", 16, 512, "Windows 11", "серый", 15.6);
        Laptop laptop7 = new Laptop("Apple MacBook Pro A2338", 8, 256, "Mac OS", "серебристый", 13.3);
        Laptop laptop8 = new Laptop("Apple MacBook Pro A2485", 32, 512, "Mac OS", "серый космос", 16.2);
        Laptop laptop9 = new Laptop("ASUS Vivobook 15 M1502I", 8, 512, "без операционной системы", "серебристый", 15.6);
        Laptop laptop10 = new Laptop("HP 1556", 32, 1024, "Windows 10", "серый", 15.6);
        Laptop laptop11 = new Laptop("HP 1556", 32, 1024, "Windows 10", "серый", 15.6);

        Set<Laptop> uniqLaptop = new HashSet<Laptop>();
        uniqLaptop.add(laptop1);
        uniqLaptop.add(laptop2);
        uniqLaptop.add(laptop3);
        uniqLaptop.add(laptop4);
        uniqLaptop.add(laptop5);
        uniqLaptop.add(laptop6);
        uniqLaptop.add(laptop7);
        uniqLaptop.add(laptop8);
        uniqLaptop.add(laptop9);
        uniqLaptop.add(laptop10);
        uniqLaptop.add(laptop11);

        // System.out.println(unicLaptop);
        // System.out.println(laptop10.equals(laptop11));
        // System.out.printf("Всего уникальных ноутбуков: %d \n", uniqLaptop.size());

        Map<Integer, String> mapCritery = new HashMap<>();
        mapCritery.put(1, "объем оперативной памяти");
        mapCritery.put(2, "объем жесткого диска");
        mapCritery.put(3, "операционная система");
        mapCritery.put(4, "цвет");
        mapCritery.put(5, "диагональ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Давайте выберем ноутбук: 1.Желаемый объем оперативной памяти: ");
        int ramAnswer = scanner.nextInt();
        System.out.println("Объем жесткого диска: ");
        int storageAnswer = scanner.nextInt();
        System.out.println("Диагональ: ");
        double diagAnswer = scanner.nextDouble();

        for (Laptop notebook : uniqLaptop) {

            if ((notebook.getRam() >= ramAnswer) && (notebook.getHardDrive() >= storageAnswer)
                    && notebook.getDiagonal() >= diagAnswer) {
                        System.out.println(notebook.toString());
            }
        }
        scanner.close();

    }
}