/**
 * Copyright (C), 2018, 上海米袋融资有限公司
 * ProjectName: leetcode
 * FileName: TwoSum
 * Author:   屈志刚
 * Date:     2018/7/10 0010 9:28
 * Description: 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ones.quzhigang.leetcode.chapter001;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 功能描述: <br>
 * 〈给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。〉
 *
 * @param
 * @return:
 * @@throws: 
 * @Version: 1.0.0
 * @Author: 屈志刚
 * @Date: 2018/7/10 0010 9:28
 */
public class TwoSum {


    /**
     * 功能描述: <br>
     * 〈给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。〉
     *
     * @param nums
     * @param target
     * @return: int[]
     * @@throws:
     * @Version: 1.0.0
     * @Author: 屈志刚
     * @Date: 2018/7/10 0010 9:37
     */
    private static int[] twosum(int[] nums, int target){

        if(nums ==null || nums.length == 0){
            throw new RuntimeException("给定的数组为空！无法进行计算......");
        }

        int[] result = new int[2];
        boolean continueFlag = true;

        int numsLength = nums.length;
        int setpNum = 0;

        int i=0;
        int j = 0;

        while (setpNum < numsLength && continueFlag){

            System.out.println("");
            System.out.println("======================="+(setpNum+1)+"==================================");

            i = setpNum + 1;

            for(j = i; j<numsLength; j++){

                int next = 0;

                if(j <= (numsLength-1)){
                    next = nums[j];
                }else{
                    next = nums[j+1];
                }

                boolean foundFlag = nums[setpNum] + next == target ? true : false;

                System.out.println("j+1====>["+(j+1)+"] nums["+setpNum+"]+next ==> 【"+nums[setpNum]+"】+【"+next +"】====>>> 【"+target+"】  ==========>>  "+foundFlag);

                if(foundFlag){
                    result[0] = setpNum;
                    result[1] = j <= (numsLength-1) ? j : j+1;
                    continueFlag = false;
                    break;
                }

            }
            setpNum++;
        }

        System.out.println("target : {"+target+"} ==> "+ Arrays.toString(result));

        return result;
    }


    public static void main(String[] args) {


        int[] nums = {2,7,11,15};

        int target = 0;

        System.out.println("nums ==> \n"+ Arrays.toString(nums));
        System.out.println("请输入你要查找的数字: ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String read = null;

        try{
            read = bufferedReader.readLine();
            target = Integer.valueOf(read);
        }catch (IOException e){
            System.out.println("输入异常!");
        }catch (NumberFormatException e){
            System.out.println("请输入正确的字符！");
        }


        int[] result = twosum(nums, target);
        System.out.println("target : {"+result+"} ==> "+ Arrays.toString(result));


    }










}
