package chapter02;

public class Java04_Operator {
    public static void main(String[] args) {
        // TODO 运算符：参与数据运算的符号
        // TODO 表达式：采用运算符和数据连接在一起形成符合Java语法规则的指令代码

        // TODO 算数运算符
        // 1.二元运算符：2个元素参与运算的运算符 1+2
        // TODO 算数表达式= 元素1 二元运算符 元素2
        // 这个表达式是有结果的，有结果就有类型，这里的类型是元素类型最大的那一种,最小是int
        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2); // 0.5 （int int ）=> int
        System.out.println(1.0 / 2);
        System.out.println(1 % 2); //取余 模运算

        // 2.一元运算符：1个元素参与运算的运算符 ++(自增运算符+1)  --
        int i = 0;
//        int j = i; j=0
//        i = i + 1; i=1
//        int j = i++; // j=0 i=1
        int j = ++i; // j=1 i=1
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
