package Pract;

import java.util.Scanner;

class Armstrong{
    Scanner sc = new Scanner(System.in);
    int number;
    int count;
    int decimal;
    int [] separated;
    int armstrong;
    int whichNumber(){
        number = sc.nextInt();
        return number;
    }
    int length(){
        count = 0;
        int a = number;
        while(a>0){
            a = a/10;
            count++;
        }
        System.out.println(count);
        return count;
    }
    int decimals(){
        decimal = 1;
        for(int i = 1;i<count;i++){
            decimal = decimal*10;
        }
        System.out.println(decimal);
        return decimal;
    }
    void newSeprateNum(){
        separated =  new int[count];
        for(int i = 0;i<count;i++){
            separated[i] = number/decimal;
            number = number-(separated[i]*decimal);
            decimal = decimal/10;
        }
        for (int j = 0;j<count;j++){
            System.out.println(separated[j]);
        }
    }
    void myArmstring(){
        armstrong = 0;
        for(int i = 0;i<separated.length;i++){
            count = separated[i];
            for(int j = 1;j<separated.length;j++){
                separated[i] = count*separated[i];
            }
        }
        for(int i = 0;i<separated.length;i++){
            armstrong = separated[i]+armstrong;
        }
        System.out.println(armstrong);
    }
}
public class ArmstrongTest {
    public static void main(String[] args) {
        Armstrong ok = new Armstrong();
        System.out.print("Enter your number : ");ok.whichNumber();
        System.out.print("Length of number is : ");ok.length();
        System.out.print("Decimals : ");ok.decimals();
        System.out.println("Separated numbers are : ");ok.newSeprateNum();
        System.out.print("Your armstrong number is : ");ok.myArmstring();
    }
}
