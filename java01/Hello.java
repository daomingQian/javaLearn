public class Hello {
    public static void main(String[] args) {
        System.out.println("holle world");
        System.out.println("chenqian is studing java");
    }
}

class Loop {
    public static void main(String[] args) {
        int num = 10;
        switch (num) {
            case 9:
                System.out.println("this is nine");
                break;
            case 10:
                System.out.println("this is ten");
            default:
                break;
        }
    }

}

class Array {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }
}