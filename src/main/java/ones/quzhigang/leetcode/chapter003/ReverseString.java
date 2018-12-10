/**
 * Copyright (C), 2018, 上海米袋融资有限公司
 * ProjectName: leetcode
 * FileName: ReverseString
 * Author:   屈志刚
 * Date:     2018/7/10 0010 16:37
 * Description: 请编写一个函数，其功能是将输入的字符串反转过来。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ones.quzhigang.leetcode.chapter003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 功能描述: <br>
 * 〈请编写一个函数，其功能是将输入的字符串反转过来。〉
 *
 * @param
 * @return:
 * @@throws:
 * @Version: 1.0.0
 * @Author: 屈志刚
 * @Date: 2018/7/10 0010 16:37
 */
public class ReverseString {


    public static String reverseString(String s) {

        if(s.length() == 1){
            return s;
        }

        char[] sArray = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = sArray.length-1; i >= 0; i--){
            stringBuffer.append(sArray[i]);
        }

        return stringBuffer.toString();

    }

    public static void main(String[] args) {

        String readLine = "";

        do{

            System.out.println("请输入一个字符串......");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try{
                readLine = bufferedReader.readLine();
                System.out.println(readLine+"执行结果===>>>>>>>   "+reverseString(readLine));

            }catch (IOException e){
                System.out.println("输入异常......");
            }

        }while (!"exit".equals(readLine));

        System.out.println("程序结束......");
    }






}
