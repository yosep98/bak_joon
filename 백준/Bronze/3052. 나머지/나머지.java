import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> mySet = new HashSet<>();
        for(int i =0; i<10; i++)
        {
            int a= sc.nextInt()%42;
            mySet.add(a);
        //여기도 sorted 있니 ?-> Hash map
        }
        System.out.println(mySet.size());
        }

    }
