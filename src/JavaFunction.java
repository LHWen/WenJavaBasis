public class JavaFunction {

    public static void main(String []args) {

        System.out.println("func max : " + maxValue(33, 70));

        printGrade(78);
    }

    // 返回两个整型变量数据的较大值
    public static int maxValue(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static void printGrade(double score) {
        if (score >= 90.0) {
            System.out.println('A');
        }
        else if (score >= 80.0) {
            System.out.println('B');
        }
        else if (score >= 70.0) {
            System.out.println('C');
        }
        else if (score >= 60.0) {
            System.out.println('D');
        }
        else {
            System.out.println('F');
        }
    }
}
