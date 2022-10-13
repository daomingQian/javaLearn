import java.util.HashMap;

public class Hello {
    public static void main(String[] args) {
        String str = "holle world";
        System.out.println(str.length());
        System.out.println("chenqian is studing java");

        Cat obj = new Cat();
        obj.getName("qianjin", 10);

        Persen p = new Persen();
        obj.outPutInfo(p);

        System.out.println(p.age);
    }
}

class Cat {
    public String getName(String name, int age) {
        String str = "your name is " + name + ", " + "your age is " + age;
        System.out.println(str);
        return name + age;
    }

    public void outPutInfo(Persen obj) {
        obj = new Persen();
        obj.age = 20;
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
        int[][] path = { { 2, 12 }, { 45, 17 }, { 35, 32 }, { 34, 13 }, { 40, 27 }, { 41, 0 }, { 1, 11 }, { 1, 47 },
                { 21, 18 }, { 19, 29 }, { 23, 30 }, { 17, 22 }, { 2, 17 }, { 26, 20 }, { 15, 32 }, { 27, 47 }, { 0, 2 },
                { 34, 16 }, { 20, 41 }, { 45, 8 }, { 4, 33 }, { 15, 25 }, { 24, 6 }, { 39, 35 }, { 1, 46 }, { 40, 21 },
                { 23, 47 }, { 40, 39 }, { 2, 32 }, { 22, 45 }, { 7, 1 }, { 6, 35 }, { 7, 40 }, { 5, 28 }, { 14, 4 },
                { 26, 25 }, { 1, 15 }, { 39, 30 }, { 5, 43 } };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = 1000;
        int max = 0;
        for (int i = 0; i < path.length; i++) {
            map.put(path[i][0], 1);
            map.put(path[i][1], 1);
            min = Math.min(min, path[i][0]);
            min = Math.min(min, path[i][1]);
            max = Math.max(max, path[i][0]);
            max = Math.max(max, path[i][1]);
        }
        int size = map.size();
        int[] enter = new int[max + 1];
        int[] outer = new int[max + 1];
        for (int i = 0; i < path.length; i++) {
            outer[path[i][0] - min] += 1;
            enter[path[i][1] - min] += 1;
        }
        for (int i = 0; i <= max; i++) {
            if (outer[i] == 0 && enter[i] == size - 1) {
                System.out.println(i + min);
            }
        }
    }

    public int[] sort(int[] nums) {

        return nums;
    }

    public int[] bind(int[] nums1, int nums2) {
        int[] nums = {};
        return nums;
    }

    public int transportationHub(int[][] path) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min = 1000;
        for (int i = 0; i < path.length; i++) {
            map.put(path[i][0], 1);
            map.put(path[i][1], 1);
            min = Math.min(min, path[i][0]);
            min = Math.min(min, path[i][1]);
        }
        int size = map.size();
        int[] enter = new int[size];
        int[] outer = new int[size];
        for (int i = 0; i < path.length; i++) {
            outer[path[i][0] - min] += 1;
            enter[path[i][1] - min] += 1;
        }
        for (int i = 0; i < size; i++) {
            if (outer[i] == 0 && enter[i] == size - 1)
                return i + min;
        }
        return -1;
    }
}

class Persen {
    String name = "qianjin";
    int age = 10;
}