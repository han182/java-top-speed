package chapter03;

public class Java01_FlowControl_6_test {
    public static void main(String[] args) {
        // 九层妖塔


        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 8 - j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
