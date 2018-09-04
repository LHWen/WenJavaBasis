public class EmployeeTest {

    public static void main(String []args) {
        // 使用构造器创建两个对象
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        // 调用对象成员方法
        empOne.empAge(22);
        empOne.emoDesignation("银行业务员");
        empOne.empSalary(10000);
        empOne.printEmployee();

        empTwo.empAge(24);
        empTwo.emoDesignation("临床医师");
        empTwo.empSalary(12000);
        empTwo.printEmployee();
    }
}
