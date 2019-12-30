package com.github.hcsp.controlflow;

public class Main {
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
        /*
            OK，看了其中一位优秀的同学，他没有单独处理0的阶乘
            而是用了倒序循环（万万没想到，还有这种骚操作），巧妙的处理了
            学习了学习了！
         */
        int sum= 1;
        for (int i = n; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }
}
