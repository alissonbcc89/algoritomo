public class FizzBuzz {

    public void fb(int n) {
        for (int i = 1; i <= n; i++) {
            if (n != 0) {
                if (i % 3 == 0){
                    System.out.println("Fizz\n" );
                }
                if (i % 5 == 0) {
                    System.out.println("Buzz\n");
                } if(i % 3 != 0 && i % 5 != 0) {
                    System.out.println("FizzBuzz\n");
                }
            }
        }

    }
}

