package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Names {
    public static void main(String[] args) throws IOException {


        List<Map<String, String>> employees = new ArrayList<Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        Map<String, String> map3 = new HashMap<String, String>();
        for (int i = 0; i < 1; i++) {
            map.put("Имя", "Kiril");
            map.put("Возраст", "26");
            map.put("Должность", "Middle java dev");
            map.put("Зарплата", "150000 руб");
            employees.add(map);
        }
        for (int i = 0; i < 1; i++) {
            map1.put("Имя", "Виталий");
            map1.put("Возраст", "28");
            map1.put("Должность", "Senior java automation QA");
            map1.put("Зарплата", "2000$");
            employees.add(map1);
        }
        for (int i = 0; i < 1; i++) {
            map2.put("Имя", "Александр");
            map2.put("Возраст", "31");
            map2.put("Должность", "junior functional tester");
            map2.put("Зарплата", "50000 руб");
            employees.add(map2);
        }
        for (int i = 0; i < 1; i++) {
            map3.put("Имя", "Дементий");
            map2.put("Возраст", "35");
            map3.put("Должность", "dev-ops");
            map3.put("Зарплата", "1500$");
            employees.add(map3);
        }

        //вывести имена всех сотрудников, получающих зарплату в рублях
        employees.stream()
                .filter(n -> n.get("Возраст").contains("руб"))
                .forEach(System.out::println);

       
        employees.stream()
                .mapToInt(num -> Integer.parseInt(String.valueOf(num)))
                .filter(num -> num < 30)
                .forEach(System.out::println);


        System.out.println("Testing");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Имя: " + employees.get(i).get("Имя"));
            System.out.println("Возраст: " + employees.get(i).get("Возраст"));
            System.out.println("Должность: " + employees.get(i).get("Должность"));
            System.out.println("Зарплата: " + employees.get(i).get("Зарплата"));
            System.out.println("****************");

        }

    }
}
