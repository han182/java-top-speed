package chapter03;

public class Java01_FlowControl_4 {
    public static void main(String[] args) {

        // 流程控制  - 重复执行（循环执行）：根据条件循环执行某段代码
        //while:有条件循环  while (条件表达式) {需要循环的代码}
        int age = 30;
        while (age <= 40) {
            System.out.println("<循环的代码>");
            age++;
        }
        // do...while
        /*
         * do {
         * 循环代码
         * } while (条件表达式)
         * */
        int age1 = 30;
        do {
            System.out.println("<UNK>");
        } while (age <= 30);

        //for
        /*
        * for(初始化表达式;条件表达式;更新表达式){
        * }
        * */

        int age2 = 30;
        for (int i = 28; i <= age2; i++) {
            System.out.println("<<循环>>");
        }

    }
}
