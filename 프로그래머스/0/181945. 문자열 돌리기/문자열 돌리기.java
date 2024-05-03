import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //String을 char 배열로 만들기
        char[] arr = a.toCharArray();
        for(char c : arr){
            System.out.println(c);
        }
       
    }
}