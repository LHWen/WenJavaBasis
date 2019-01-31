public class GenericMethodTest {

    /** 泛型方法 printArray */
    public static < E > void printArray (E []inputArray) {
        // 输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String []args) {

        // 创建不同类型数组
        Integer[] intArr = {1, 2, 3, 4, 5};
        Double[] doubleArr = {1.2, 2.3, 4.1, 6.1};
        Character[] charArr = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整数数组元素:");
        printArray(intArr);

        System.out.println("\n双精度型数组元素:");
        printArray(doubleArr);

        System.out.println("\n字符型数组元素:");
        printArray(charArr);
    }
}
