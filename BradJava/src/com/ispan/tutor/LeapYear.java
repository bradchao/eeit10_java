package com.ispan.tutor;

import java.util.Scanner;
 
public class LeapYear {
 
    /**
     * 判斷給定的公元年份是否為閏年（Gregorian rules）。
     *
     * 規則：
     * - 年份不是 4 的倍數 -> 平年
     * - 年份是 4 的倍數但不是 100 的倍數 -> 閏年
     * - 年份是 100 的倍數但不是 400 的倍數 -> 平年
     * - 年份是 400 的倍數 -> 閏年
     *
     * @param year 公元年份（可為任意整數）
     * @return 若為閏年回傳 true，否則回傳 false
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;               // 非 4 的倍數 -> 平年
        } else if (year % 100 != 0) {
            return true;                // 4 的倍數但非 100 的倍數 -> 閏年
        } else if (year % 400 != 0) {
            return false;               // 100 的倍數但非 400 的倍數 -> 平年
        } else {
            return true;                // 400 的倍數 -> 閏年
        }
    }
 
    public static void main(String[] args) {
        // 範例測試
        int[] examples = {1600, 1700, 1800, 1900, 2000, 2004, 2001};
        System.out.println("範例測試：");
        for (int y : examples) {
            System.out.printf("%d -> %s%n", y, isLeapYear(y) ? "閏年(366天)" : "平年(365天)");
        }
 
        // 互動輸入
        Scanner sc = new Scanner(System.in);
        System.out.print("\n請輸入一個年份來判斷是否為閏年（輸入非數字結束）：");
        while (sc.hasNextInt()) {
            int year = sc.nextInt();
            System.out.printf("%d 是 %s%n", year, isLeapYear(year) ? "閏年 (366天)" : "平年 (365天)");
            System.out.print("請再輸入一個年份（或輸入非數字結束）：");
        }
        sc.close();
        System.out.println("程式結束。");
    }
}