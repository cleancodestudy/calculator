package calculator;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.round;

public class CalculatorApplication {
public static void main(String[] args) {
    System.out.println("입력하세요 : ");
    Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();
    String[] split_value = value.split(" ");
    int[] number_arr = new int[(split_value.length/2)+1];
    String[] sign_arr = new String[split_value.length/2];
    int j = 0;
    int k = 0;
    for(int i =0; i<split_value.length;i++){
        if(i%2==0){ //숫자
            number_arr[k++] = Integer.parseInt(split_value[i]);
        }
        if(i%2==1){//부호
            sign_arr[j++] = split_value[i];
        }
    }

    Calculator calculator = new Calculator();

    System.out.println(calculator.callVal(sign_arr,number_arr));


}
}
