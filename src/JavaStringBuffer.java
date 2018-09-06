public class JavaStringBuffer {

    public static void main(String []args) {

        // append 追加
        StringBuffer sBuffer = new StringBuffer("自己喜欢的东西，\n");
        sBuffer.append("就不要征求他人意见了，\n");
        sBuffer.append("人生这点责任，\n");
        sBuffer.append("自己负。\n");
        System.out.println(sBuffer);

        // reverse 将此字符序列用其反转形式取代。
        StringBuffer rBuffer = new StringBuffer("abcdefg");
        System.out.println("string buffe reverse : " + rBuffer.reverse()); // gfedcba

        // delete 移除字符串中字符 （6, 9）6 -> 9 123456 789 0  = 1234560
        StringBuffer dBuffer = new StringBuffer("1234567890");
        System.out.println("delete : " + dBuffer.delete(6, 9)); // 1234560

        // insert 将 int 参数的字符串表示形式插入此序列中
        StringBuffer iBuffer = new StringBuffer("qwerdf");
        System.out.println("insert : " + iBuffer.insert(3, 4)); // 在第三的位置后插入数字 4  qwe4rdf
        System.out.println("insert string : " + iBuffer.insert(3, "UUID")); // 在第三的位置后插入字符 qweUUID4rdf

        // replace 使用给的 String 中的字符替换此序列的子字符串的字符
        StringBuffer replaceStr = new StringBuffer("floatPoint");
        System.out.println("replace : " + replaceStr.replace(3, 6, "HE")); // floHEoint
    }
}
