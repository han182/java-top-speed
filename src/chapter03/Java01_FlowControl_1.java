package chapter03;

public class Java01_FlowControl_1 {
    public static void main(String[] args) {
        // TODo 流程控制：执行代码时，对指令代码执行顺序的控制
        // 分支执行
        // 1.可选分支：单分支结构,if
        System.out.println("第一步");
        System.out.println("第二步");
        // 判断：条件表达式的结果是否为true,如果为true，执行分支逻辑。如果为false，继续执行
        int i = 20;
        if (i == 10) {
            System.out.println("分支");
        }
        System.out.println("第三步");


        //2.必选分支：双分支结构，必须二选一，if ... else
        System.out.println("第一步");
        System.out.println("第二步");
        int i1 = 20;
        if (i1 == 10) {
            System.out.println("分支1");
        } else {
            System.out.println("分支2");
        }
        System.out.println("第三步");


        //3.多分支结构，多重判断，if ...else if...else ,
        // TODO else不是必须的，可以不走分支直接往下走
        int i2 = 100;
        if (i2 == 10) {
            System.out.println("分支1");
        } else if (i2 == 20) {
            System.out.println("分支2");
        } else {
            System.out.println("分支3");
        }
        System.out.println("第三步");



    }
}
