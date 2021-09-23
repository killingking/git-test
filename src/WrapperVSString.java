public class WrapperVSString {
    public static void main(String[] args) {
        //Integer ->String
        Integer num = 100;
        //方式1
        String str = num + "";
        System.out.println(str);
        //方式2
        String str1 = num.toString();
        System.out.println(str1);
        //方式3使用String的valueOf方法
        String str2 = String.valueOf(num);
        System.out.println(str2);

        //String -> Integer
        //方式1
        Integer n1 = new Integer(str);
        System.out.println(n1);
        //方式2
        Integer n2 = Integer.parseInt(str);
        System.out.println(n2);
        //方式3
        Integer n3 = Integer.valueOf(str2);
        System.out.println(n3);
    }
}
