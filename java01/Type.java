public class Type {
    public static void main(String[] args) {
        char ch = 's';
        int a = ch;
        System.out.println(a);
        String str = "135";
        int b = Integer.parseInt(str);
        String flag = "true";
        System.out.println(b);
        boolean bool = Boolean.parseBoolean(flag);
        System.out.println(bool);

        short sh = 12;
        byte by = 11;
        int res = ch + sh + by;
        System.out.println(res);
    }
}
