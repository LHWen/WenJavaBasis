public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类构造器
    public Employee(String name) {
        this.name = name;
    }
    // 设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }
    // 设置designation的值
    public void emoDesignation(String empDesig) {
        designation = empDesig;
    }
    // 设置salary值
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("名字: " + name);
        System.out.println("年龄: " + age);
        System.out.println("职位: " + designation);
        System.out.println("薪水: " + salary);
    }
}
