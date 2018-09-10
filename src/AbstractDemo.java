public class AbstractDemo {

    public static void main(String []args) {

        Salary s = new Salary("Mohd Mohtasim", "Ambehta, UP", 3, 3600.00);
        AbstractClass a = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        /* 以下是不允许的，会引发错误 */
       // AbstractClass e = new AbstractClass("George W.", "Houston, TX", 43);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("call mailCheck using AbstractClass reference --");
        a.mailCheck();
    }
}
