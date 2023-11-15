public class Pattern {
    void printTriangle(int n) {
        // code here
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=((2*n)-(2*i)+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    void printTriangle2(int n) {
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    void printTriangle3(int n) {
        // code here
        for(int i=1; i<=n; i++) {
            StringBuilder row = new StringBuilder();
            for(int j=1; j<=n-i+1; j++) {
                row.append(j+" ");
            }
            System.out.println(row);
        }
    }
    void printTriangle4(int n) {
        // code here
        for(int i=1; i<=n; i++) {
            StringBuilder row = new StringBuilder();
            for(int j=1; j<=n-i+1; j++) {
                row.append("*"+" ");
            }
            System.out.println(row);
        }
    }
    static void printTriangle5(int n) {
        // code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    void printTriangle6(int n) {
        // code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                if((i+j)%2!=0){
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    
    // Prime number
    static int isPrime(int N){
        // code here
        if(N==0||N==1){
            return 0;
        } else if(N==2){
            return 1;
        } else {
            for(int i=2; i<=Math.sqrt(N); i++){
                if(N%i==0){
                    return 0;
                }
            }
        }
        return 1;
    }

    // Flyod's triangle
    static void printFloydTriangle(int N){
        // code here
        int num = 1;
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    void printSquare(int n) {
        // code here
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    void printTrianglee(int n) {
        // code here
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    void printTriangleee(int n) {
        // code here
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle5(5);
    }
}
