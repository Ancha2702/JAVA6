import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lesson6_2 {

    public static void main(String[] args) {
        int count = 0;

        Notebook notebook1 = new Notebook("13.3 Ноутбук Apple MacBook Pro 13 Mid 2019", 8, 128,  "macOS",  65990);
        Notebook notebook2 = new Notebook("16 Ноутбук ASUS Vivobook 16X M1603QA-MB183", 8,512, " без ОС", 46217);
        Notebook notebook3 = new Notebook("15.6 Ноутбук Acer Nitro 5 AN515-45", 8, 512, "без ОС", 62690);
        Notebook notebook4 = new Notebook("14 Ноутбук Lenovo IdeaPad 5 Pro 14ACN6 ", 16, 512, "Windows 10", 65590);
        Notebook notebook5 = new Notebook("Ноутбук Lenovo IdeaPad 3-15 IGL05 15.6 FHD TN/Intel Celeron N4020", 4, 512, "Windows 11 Pro", 23900);


        Set<Notebook> uninote = new HashSet<Notebook>();
        uninote.add(notebook1);
        uninote.add(notebook2);
        uninote.add(notebook3);
        uninote.add(notebook4);
        uninote.add(notebook5);


        Map<Integer, String> allCharacter = new HashMap<>();
        allCharacter.put(1, "объем оперативной памяти");
        allCharacter.put(2, "объем накопителя");
        allCharacter.put(3, "ОС");
        allCharacter.put(6, "цена");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите характеристики:");
        System.out.print("Объем оперативной памяти больше: ");
        int ramFind = scaner.nextInt();
        System.out.print("Объем накопителя больше: ");
        int HDDFind = scaner.nextInt();
        System.out.print("максимальная цена не более: ");
        double priceFind = scaner.nextInt();
        System.out.println();
        scaner.close();

        for(Notebook item: uninote) {
            if ((item.getRam() >= ramFind) && (item.getHDD() >= HDDFind)  && (item.getPrice() <= priceFind)) {
                System.out.println(item.toString());
                count ++;
            }
        }

        if (count == 0){
            System.out.println("совпадений не найдено, попобуйте изменить параметры поиска.");
        }else{
            System.out.println("[найдено " + count + " совпадений]" );
        }
    }
}