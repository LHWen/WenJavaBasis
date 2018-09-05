public class CycleExpression {

    public static void main(String []args) {

        // while 表达式
        int x = 10;
        while (x < 20) {
            System.out.println("value of x : " + x);
            x++;
        }

        int t = 10;
        do {
            System.out.println("value of t : " + t);
            t++;
        }while (t < 20);

        for (int i = 1; i < 10; i++) {
            System.out.println("value of t : " + i);
        }

        int [] num = {10, 20, 30, 40, 50};
        for (int n : num) {
            System.out.print( n );
            System.out.print(",");
        }

        System.out.print("\n");
        String [] names = {"James", "Larry", "Tome", "Lacy"};
        for (String name : names) {
            System.out.print( name );
            System.out.print(",");
        }

        // break // 跳出循环
        for (int n : num) {
            if (n == 30) {
                break;
            }
            System.out.println("break n is " + n);
        }

        // continue
        for (int n : num) {
            if (n == 30) {
                continue;
            }
            System.out.println("continue n is " + n);
        }
    }
}
