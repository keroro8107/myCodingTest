package Demo05;

import java.util.ArrayList;
import java.util.Arrays;


public class Exam {
//    一、物件導向繼承介面
//    汽車和機車都是繼承交通工具，但汽車可以有音響和空調這個介面
//    父類別為交通工具
    public static class Transportation {
        public void run() {
            System.out.println(this.toString() + ": run");
        }
    }
//    子類別為汽車
    public static class Car extends Transportation implements Audio{
    @Override
    public String toString() {
        return "Car";
    }

    @Override
        public void playMusic() {
            System.out.println(this.toString() + ": 播放音樂");
        }
    }
//    子類別為機車
    public static class Motocycle extends Transportation{
    @Override
    public String toString() {
        return "Motocycle";
    }

    }
    static interface Audio{ //新增一個音響的介面
        public abstract void playMusic();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        car.playMusic();
        Motocycle moto = new Motocycle();
        moto.run();

    }

//**************************************************************************


//          二、資料處理-字串
//        public static void main(String[] args) {
//        String a = "人易科技:上 機 測 驗 - 演算法";
//
////      1. 字元「:」改成全型
//        String b = a.replace(":","：");
//        System.out.println(b);
////      2. 去掉中文字間的空白(保留一號二側空白)
//        String c = b.replace(" ","");
//        String d = c.replace("-"," - ");
//
////      3. 列印出符號:到-之間的字元
//        System.out.println(d);
//        System.out.println(d.substring(0,10));
//
//        String[] e = d.split("-");
//        System.out.println(e[0]);
//
//
//   }


//**************************************************************************


////    三、資料處理-陣列
//
////
////      1. 計算出「奇數值總和」減去「偶數值總和」
////
//        public static void main(String[] args) {
//            int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//            int even = 0;
//            int odd = 0;
//            for (int i = 0; i < a.length; i++) {
//                if (a[i] % 2 == 0) {
//                    even += a[i];
//                } else {
//                    odd += a[i];
//                }
//
//            }
//            System.out.println("奇數值總和　減去　偶數值總和　" + (odd - even));
//
////      2. 分割成二陣列,分別存放「偶數值」及「奇數值」
//
//        ArrayList elist = new ArrayList();
//        ArrayList olist = new ArrayList();
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                elist.add(a[i]);
//            }else{
//                olist.add(a[i]);
//            }
//
//        }
//        System.out.println("偶數值: " + elist);
//        System.out.println("奇數值: " + olist);
//    }


//**************************************************************************


////    四、資料排序-正序
////    今有一陣列資料 77,5,5,22,13,55,97.4.796.1.0.9 請寫出正序排列處理程式碼
//
//    public static void main(String[] args) {
//        int[] a = {77, 5, 5, 22, 13, 55, 97, 4, 796, 1, 0, 9};
//
//
//        int tmp;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] < a[i]) {
//                    tmp = a[i];
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }

//**************************************************************************


////    五、邏輯處理-交集、差集、聯集
////        今有二陣列,請寫出資料處理程式碼
////        陣列a:775,5,22,13,55,974,796,1,09
////        陣列b:0.1,2,3,4,5,6,7,8,9
////  ************交集**************
//            public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int[] a = {775,5,22,13,55,974,796,1,0,9};
//        int[] b = {0,1,2,3,4,5,6,7,8,9};
//
//        for(int i= 0; i<a.length;i++){
//            for(int j=0;j<b.length;j++) {
//                if (a[i] == b[j]) {
//                    list.add(b[j]);
//                }
//            }
//            }
//        System.out.println("交集:"+ list.toString());
//        }


////        ****************差集**************
//
//            public static void main(String[] args) {
//                ArrayList<Integer> list = new ArrayList<>();
//                int[] a = {775,5,22,13,55,974,796,1,0,9};
//                int[] b = {0,1,2,3,4,5,6,7,8,9};
//
//                for(int i=0;i<a.length;i++){
//                    list.add(a[i]);
//                }
//
//                for(int i=a.length-1;i>=0;i--){
//                    for(int j=0;j<b.length;j++){
//                        if(a[i]==b[j]){
//                            list.remove(i);
//                        }
//                    }
//                }
//                System.out.println("差集:" + list.toString());
//
//
//                }

//        ****************聯集**************
//        public static void main(String[] args) {
//            ArrayList<Integer> list = new ArrayList<>();
//            int[] a = {775, 5, 22, 13, 55, 974, 796, 1, 0, 9};
//            int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//            for (int i = 0; i < a.length; i++) {
//                list.add(a[i]);
//            }
//            for (int j = 0; j < b.length; j++) {
//                list.add(b[j]);
//            }
//
//            for (int i = a.length - 1; i >= 0; i--) {
//                for (int j = 0; j < b.length; j++) {
//                    if (a[i] == b[j]) {
//                        list.remove(i);
//                    }
//                }
//            }
//            System.out.println(list.toString());
//
//        }


////*********************************************************************
//
//    //      六、兩數總和
//    public static void main(String[] args) {
//        int[] a = {2, 7, 11, 15};
//        int b = 9;
//        twoSum(a, b);
//        int[] c = {3, 2, 4};
//        int d = 6;
//        twoSum(c, d);
//    }
//
//
//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] anws = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            if ((nums.length >= 2 && nums.length <= 103) &&
//                    (nums[i] >= -109 && nums[i] <= 109) &&
//                    (target >= -109 && target <= 109)) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[i] + nums[j] == target) {
//                        anws[0] = i;
//                        anws[1] = j;
//                        System.out.println(Arrays.toString(anws));
//                        return anws;
//                    }
//                }
//            }
//        }
//        return anws;
//    }

}




























