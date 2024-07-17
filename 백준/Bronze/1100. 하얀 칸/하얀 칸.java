import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count=0;
        for(int i=0;i<8;i++)
        {char arr[]= sc.nextLine().toCharArray();
            for(int j=0;j<8;j++){
            if(arr[j]=='F'&&(i+j)%2==0)
            {
                count++;
            }
            }
        }
        System.out.println(count);
    }
}
