package chapter03;

public class Java01_FlowControl_3_test {
    public static void main(String[] args) {

        int age = 30;
        // 儿童（0-6） 少年（7-17） 青年（18-40） 中年 （41-65） 老年 （66）

        if (age <= 6) {
            System.out.println("儿童");
        } else if (age >= 7 && age <= 17) {
            System.out.println("少年");
        } else if (age >= 18 && age <= 40) {
            System.out.println("青年");
        } else if (age >= 41 && age <= 65) {
            System.out.println("少年");
        } else {
            System.out.println("老年");
        }
    }
}
