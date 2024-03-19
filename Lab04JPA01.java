import java.util.Scanner;

public class Lab04JPA01 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("請輸入10個整數:");
       int pass = 0;
       int total = 0;
       int [] numbers = new int[10];
       for(int i = 0 ; i <10 ; i++){
        System.out.print("第"+(i+1)+"個整數:");
        int number = input.nextInt();
        numbers[i] = number;

       }
       for(int j = 0 ; j < 10 ; j++){
        if (numbers[j] > 60) {
            pass += 1;
            total = total+numbers[j];
        }
    }
        System.out.println("陣列中大於60的有"+pass+"個");
        System.out.println("總合為"+total);
        System.out.println("平均值為"+(double)total/(double)pass);
       
    }
}
