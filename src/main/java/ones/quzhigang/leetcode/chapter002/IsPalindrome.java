/**
 * Copyright (C), 2018, 上海米袋融资有限公司
 * ProjectName: leetcode
 * FileName: IsPalindrome
 * Author:   屈志刚
 * Date:     2018/7/10 0010 13:10
 * Description:  判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ones.quzhigang.leetcode.chapter002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        // 1、使用Java自带的 StringBuffer.reverse()反转后比较

//        String paramter = String.valueOf(x);
//
//        StringBuffer stringBuffer = new StringBuffer(paramter);
//
//        String reverseStr = stringBuffer.reverse().toString();
//
//        if(paramter.equals(reverseStr)){
//            return true;
//        }
//
//        return false;

        // 1 end  =========================================


        // 2、转换成数组比较

//        String paramter = String.valueOf(x);
//
//        int left = 0, right = paramter.length()-1;
//
//        char[] paramterArray = paramter.toCharArray();
//
//
//        while (left < right){
//            if(paramterArray[left] == paramterArray[right]){
//                left++;
//                right--;
//            }else{
//                return false;
//            }
//        }
//
//        return true;
        // 2 end  =========================================

        // 3、数字翻转比较

//        int reverse = 0;
//        int before = x;
//
//        while (x != 0){
//
//            reverse = reverse * 10 + x % 10;
//            x /= 10;
//        }
//
//        System.out.println("reverse ==>> "+reverse +" \n before ==> "+before);
//
//        if(reverse == before){
//            return true;
//        }
//
//        return false;
        // 3 end  =========================================

        // 4、数字位判断法

        if(x < 0){
            return false;
        }

        int reverse = 1;

        while (x/ reverse >= 10){
            reverse *= 10;
        }

        while (x != 0){
            int left = x / reverse;
            int right = x % 10;

            if(left != right){
                return false;
            }

            x = (x % reverse) / 10;
            reverse /= 100;
        }

        return true;
        // 4 end  =========================================
    }


    public static void main(String[] args) {


        String readLine = "";

        do{

            System.out.println("请输入一个数字......");

            int paramter = 0;

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try{
                readLine = bufferedReader.readLine();
                paramter = Integer.valueOf(readLine);
                boolean result = isPalindrome(paramter);
                System.out.println(readLine+"是否是回文数 ？  \n "+result);

            }catch (IOException e){
                System.out.println("输入异常......");
            }catch (NumberFormatException e){
                System.out.println("请输入正确的整数......");
            }

        }while (!"exit".equals(readLine));

        System.out.println("程序结束......");
    }

}
