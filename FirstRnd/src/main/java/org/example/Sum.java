package org.example;

public class Sum {

    /**
     * Given two integers a and b, which can be positive or negative, find the sum of all the integers between
     * and including them and return it. If the two numbers are equal return a or b.
     * Note: a and b are not ordered!
     * Examples (a, b) --> output (explanation)
     * (1, 0) --> 1 (1 + 0 = 1)
     * (1, 2) --> 3 (1 + 2 = 3)
     * (0, 1) --> 1 (0 + 1 = 1)
     * (1, 1) --> 1 (1 since both are same)
     * (-1, 0) --> -1 (-1 + 0 = -1)
     * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
     * Your function should only return a number, not the explanation about how you get that number.
     */


    public int sum(int a, int b){
        int sum = 0;
        while (a <= b){
            sum += a;
            a++;
        }
        return sum;

    }

    public int GetSum(int a, int b)
    {
        if (a == b)
            return a;
        if (a < b){
           return sum(a, b);
        }
        return sum(b, a);

    }


    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.GetSum(-3,0));
    }


}
