package ru.netology;

public class Main {
    public static void main(String[] args) {
        MyServise myService;
        myService = new MyServise();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}