package main.java;


import items.Table;
import items.TableService;


public class lol {

    private static TableService service = new TableService();


    public static void main(String[] args) {
        Table car = new Table("Машины");
        service.addRow("Сузуки", car);
        service.addRow("Бентли", car);
        service.addProperties("Тип машины", car);
        service.addProperties("Владелец", car);
        service.addNode(car, "Сузуки","Тип машины", "Легковая");
        service.addNode(car, "Сузуки","Владелец", "Петя");
    }
}
