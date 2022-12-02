package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Names {
    public static void main(String[] args) throws IOException {


        List<Map<String, String>> employees = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();

        map.put("Имя", "Kiril");
        map.put("Возраст", "26");
        map.put("Должность", "Middle java dev");
        map.put("Зарплата", "150000 руб");
        employees.add(map);


        map1.put("Имя", "Виталий");
        map1.put("Возраст", "28");
        map1.put("Должность", "Senior java automation QA");
        map1.put("Зарплата", "2000$");
        employees.add(map1);


        map2.put("Имя", "Александр");
        map2.put("Возраст", "31");
        map2.put("Должность", "junior functional tester");
        map2.put("Зарплата", "50000 руб");
        employees.add(map2);


        map3.put("Имя", "Дементий");
        map3.put("Возраст", "35");
        map3.put("Должность", "dev-ops");
        map3.put("Зарплата", "1500$");
        employees.add(map3);

        System.out.println("Task #1");
        //вывести имена всех сотрудников, получающих зарплату в рублях
        employees.stream()
                .filter(n -> n.get("Зарплата").contains("руб"))
                .forEach(System.out::println);

        System.out.println("Task #2");
        //Employees who are less than 30:
        employees.stream()
                .filter(n -> Integer.parseInt(n.get("Возраст")) < 30)
                .forEach(System.out::println);

        //printing out the average
        System.out.println("Task #3");
        employees.stream()
                .mapToInt(x -> Integer.parseInt(x.get("Возраст")))
                .average()
                .ifPresent(System.out::println);

    }
}
