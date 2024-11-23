public class First_ex {

    public static int solution(int number){
        int sum =0;

        for (int i = 0; i < number ; i++) {
            if (i % 3 == 0 || i % 5 == 0){

                System.out.println(i);
                sum += i;
            }

        }
        return sum;
    }


    public static void main(String[] args) {
       System.out.println(solution(10));
        solution(10);
    }
}
