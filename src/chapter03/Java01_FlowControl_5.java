package chapter03;

public class Java01_FlowControl_5 {
    public static void main(String[] args) {

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 10; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }

        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
