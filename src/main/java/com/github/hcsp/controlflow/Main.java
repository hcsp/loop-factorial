package com.github.hcsp.controlflow;

public class Main {
//    private static int m1 = 1; //240
    /*
     * 问题：发现当使用static声明一个静态变量的时候，5的阶乘输出结果错误。与正确答案相差2倍
     * 定位：通过断点调试发现，计算2的阶乘后m1=2，计算5的阶乘时候m1没有归1。
     * 原因分析：- 静态变量使用后依然存在于在遥远的内存空间中
     *         - 局部变量使用后，随着方法的结束一起销毁
     */
    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(5));
    }

    /**
     * 计算一个数的阶乘。 阶乘的定义为： 0的阶乘为1 n的阶乘为n*(n-1)*(n-2)*...*2*1
     *
     * @param n 输入数字
     * @return 该数字的阶乘
     */
    public static int factorial(int n) {
        int m = 1; //120
        //当传入数为0的时候
        if (n == 0) {
            return 1;
        } else {
            //当传入数不为0的时候
            for (int i = 1; i <= n; i++) {
                m = i * m;
//              m1 = i * m1;
            }
            return m;
        }

    }
}
