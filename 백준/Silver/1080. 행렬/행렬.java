import java.util.Scanner;

public class Main {
    static int n, m;
    static int[][] a, b;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        b = new int[n][m];
        
   
        for(int i = 0; i < n; i++){
            String line = sc.next();
            for(int j = 0; j < m; j++){
                a[i][j] = line.charAt(j) - '0';
            }
        }
        

        for(int i = 0; i < n; i++){
            String line = sc.next();
            for(int j = 0; j < m; j++){
                b[i][j] = line.charAt(j) - '0';
            }
        }
        
        int count = 0;
        

        for(int i = 0; i <= n - 3; i++) {
            for(int j = 0; j <= m - 3; j++) {
                if(a[i][j] != b[i][j]) {
                    flip3x3(i, j);
                    count++;
                }
            }
        }
        
       
        if(isEqual()) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
        
        sc.close();
    }
    

    static void flip3x3(int startI, int startJ) {
        for(int i = startI; i < startI + 3; i++) {
            for(int j = startJ; j < startJ + 3; j++) {
                a[i][j] = 1 - a[i][j]; 
            }
        }
    }
    

    static boolean isEqual() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}