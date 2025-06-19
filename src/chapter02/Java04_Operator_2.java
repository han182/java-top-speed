package chapter02;

public class Java04_Operator_2 {
    public static void main(String[] args) {
        // TOD0 运算符 -关系运算符
        //所谓的关系运算符其实就是用于比较两个数据之间关系的运算符
        // TODO 关系表达式： 元素1（数据1，表达式1） 关系运算符（==,!=,>=,<=） 元素2（数据2，表达式2）
        //关系表达式的结果为布尔类型，true,false
        int i = 10;
        int j = 20;
        System.out.println(i==j); // false
        System.out.println(i!=j); // true
        System.out.println(i>j); // false
        System.out.println(i>=j); // false
        System.out.println(i<j); // true
        System.out.println(i<=j); // true
    }
}
