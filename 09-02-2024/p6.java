// Nested Loop

public class p6 {
    public static void main(String[] args) {
        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * 8
         * 4 4
         * 6 6 6
         * 8 8 8 8
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * 2 + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * 3
         * 5 5
         * 7 7 7
         * 9 9 9 9
         */
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i*2+1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         */
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
                *
              * *
            * * *
          * * * *
         */
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        /*
          *
          * *
          * * *
          * * * *
         */
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
