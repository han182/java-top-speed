package chapter03;

public class Java01_FlowControl_2 {
    public static void main(String[] args) {
        // TODo 流程控制：执行代码时，对指令代码执行顺序的控制
        //  分支结构 3.特殊多分支
        // switch语法会对数据进行判断。如果等于某个分支的值，那么执行对应分支的逻辑代码
        // 如果都不匹配，那么一个分支都不会执行
        //如果想要无法匹配也需要执行分支，那么可以增加default关键字
        //如果执行某一个分支后，不想继续执行其他分支，加break

        System.out.println("第一步");
        System.out.println("第二步");
        int i = 10;
        switch (i) {
            case 10:
                System.out.println("分支1");
            case 2:
                System.out.println("<分支2>");
            case 3:
                System.out.println("<分支3>");
            default:
                System.out.println("<其他分支>");
        }

        System.out.println("第三步");
    }
}
