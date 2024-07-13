package org.example.leetcode.leetcode;

public class _125_验证回文串自写优化 {
    public static boolean isPalindrome(String s){
        StringBuffer stringBuffer = new StringBuffer();
        int len = s.length();
        for (int i =0 ; i < len; i++){
            if (Character.isLetterOrDigit(s.charAt(i))) stringBuffer.append(Character.toLowerCase(s.charAt(i)));
        }
        StringBuffer reverse = new StringBuffer(stringBuffer).reverse();
        return reverse.toString().equals(stringBuffer.toString());

    }
    public static void test(String s){
        StringBuffer stringBuffer = new StringBuffer("123");
        StringBuffer stringBuffer1 = new StringBuffer("123");

        if (stringBuffer.toString().equals(stringBuffer1.toString())) System.out.println("1相等吗");
        stringBuffer1 = stringBuffer;
        if (stringBuffer.equals(stringBuffer1)) System.out.println("2相等吗");
    }
    public static void main(String[] args) {
//        String string = "A man, a plan, a canal: Panama";
//        if (isPalindrome(string)) System.out.println("是的");
//        else System.out.println("不是的");
        test("test");
    }

}
