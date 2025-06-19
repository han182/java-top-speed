package chapter02;

public class Java04_Operator_3 {
    public static void main(String[] args) {
        // TODO 运算符 -逻辑运算符：描述多个表达式直接关系的运算符
        // 变量 = （条件表达式1） 逻辑运算符  （条件表达式2）
        // 结果的变量的类型是布尔类型，所以逻辑运算表达式也是布尔类型
        // true true => ?
        // false true => ?
        // false false => ?
        // true false => ?

        //TODO 逻辑运算符 & 与运算，必须两个结果都为true才返回true
        int i = 1;
        boolean result = (i == 1) & (i > 10);
        System.out.println(result);

        //TODO 逻辑运算符 | 或运算，必只要有一个结果为true就会返回true
        int i1 = 1;
        boolean result1 = (i1 == 1) | (i1 > 10);
        System.out.println(result1);

        //TODO 逻辑运算符 && 短路与运算，根据第一个条件表达式的结果来判断是否执行第二个表达式
        int i2 = 1;
        boolean result2 = (i2 == 1) & (i2 > 10);
        System.out.println(result2);

        //TODO 逻辑运算符 ! 非（相反）运算
        int i3 = 1;
        boolean result3 = (i3 == 1) & (i3 > 10);
        System.out.println(!result3);
    }
}
