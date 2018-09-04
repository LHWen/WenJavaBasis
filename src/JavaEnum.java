
class FreshJuice {
    enum FreshJuiceSize{
        SMALL,
        MEDIUM,
        LARGE
    }
    FreshJuiceSize size;
}

public class JavaEnum {

    public static void main(String []args) {

        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;

        switch (juice.size) {
            case SMALL:
                System.out.println("juice size is SMALL");
                break;
            case MEDIUM:
                System.out.println("juice size is MEDIUM");
                break;
            case LARGE:
                System.out.println("juice size is LARGE");
                break;
            default:
                System.out.println("juice size is Other");
                    break;
        }
    }

}
