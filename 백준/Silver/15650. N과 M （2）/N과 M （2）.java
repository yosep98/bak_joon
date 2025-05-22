import java.util.*;
public class Main {
  static int n;
  static int m;
  static int[] selected;
  static int[] arr;
   public static void main(String[]args){

       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       m = sc.nextInt();
       selected = new int[m];
       arr =new int[n];
       for(int i=0;i<n;i++){
           arr[i]=i+1;
       }
       DFS(0,0);
    }

    public static void DFS(int level, int start) {
    if(level==m){
        for(int i=0;i<m;i++){
            System.out.print(selected[i]+" ");
        }
        System.out.println();
    }
    else{
        for(int i=start;i<n;i++){
            selected[level]=arr[i];
            DFS(level+1,i+1);
        }
    }


    }
}
