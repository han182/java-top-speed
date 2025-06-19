package chapter02;

public class Java03_Datatype_2 {
    public static void main(String[] args) {
        // TODO 数据类型的转换
        String name = "zhangsan";
        int Lage = 30;

        name = "hs";
        // name =age;
        // byte -> short-> int-> long-> floot-> double

        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        // 范围小的数据可以直接转换成范围大的数据，范围大的数据不能转换为范围小的数据
        int i1 = (int)d;  //强制转换


    }

}

