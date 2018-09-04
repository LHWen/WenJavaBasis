public class JavaPuppyClass {

    int puppyAge;
    public JavaPuppyClass(String name) { // 名称与类名一致
        // 构造仅有一个参数 name
        System.out.println("小狗狗名字: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄: " + puppyAge);
        return  puppyAge;
    }

    public static void main(String []args) {
        // 创建对象
        JavaPuppyClass myPuppy = new JavaPuppyClass("tommy");
        // 通过方法设定 age
        myPuppy.setAge(2);
        // 调用方法获取age
        myPuppy.getAge();
        // 访问成员变量
        System.out.println("成员变量值: " + myPuppy.puppyAge);
    }
}
