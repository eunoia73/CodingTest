import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //배열로 바꾸기 
        char[] arr = a.toCharArray();
        for(int i = 0; i<arr.length; i++){
            if (65 <= arr[i] && arr[i] <= 90) {  //대문자일 때
                arr[i] = (char) (arr[i] + 32);
            } else {    //소문자일 떄
                arr[i] = (char) (arr[i] - 32);
            }
        }
        System.out.println(arr);
        
    }
}