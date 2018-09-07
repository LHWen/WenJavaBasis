
// 简单构造函数
class  MyClass {

    int x;
    // 构造函数
    MyClass(int i) {
        x = i;
    }
}

public class JavaFunction {

    public static void main(String[] args) {

        System.out.println("func max : " + maxValue(33, 70));

        printGrade(78);

        // 调用构造函数
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + " " + t2.x);

        // 调用可变参数方法
        printMax(34, 3, 4, 26, 52, 19);
        printMax(new double[]{1, 2, 3, 6, 2, 4});
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
        } else if (score >= 80.0) {
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }

    // 可变参数 在指定参数类型后加一个省略号(...)
    public static void printMax(double... numbers) {

        if (numbers.length == 0) {
            System.out.println("No argument passed");
        }

        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    /**
     * finalize() 方法
     * Java 允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做 finalize( )，它用来清除回收对象。
     * 例如，你可以使用 finalize() 来确保一个对象打开的文件被关闭了。
     * 在 finalize() 方法里，你必须指定在对象销毁时候要执行的操作。
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        /**
         * 释放对象，关闭操作
         * */
    }
}
