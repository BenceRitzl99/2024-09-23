package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Adatbázis elérés");

        DataSource dataSource = new DataSource();
        ArrayList <Employee> employeeList = dataSource.getEmployees();
        System.out.println(employeeList.get(0).getName());
    }
}