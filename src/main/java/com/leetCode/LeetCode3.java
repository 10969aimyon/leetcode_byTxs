package com.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20.有效的括号
 */
public class LeetCode3 {

    // 消耗内存
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        for (int i = 0; i< s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                if (map.get(stack.peek()) != s.charAt(i)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }


    // 另一种思路，时间会快点
    public static boolean isValid2(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (stack.size() == 0){
                stack.push(aChar);
            }else if(isSym(stack.peek(), aChar)){
                stack.pop();
            }else {
                stack.push(aChar);
            }
        }
        return stack.size()==0;
    }

    private static boolean isSym(Character peek, char aChar) {
        return (peek == '{' && aChar == '}') || (peek == '[' && aChar == ']') || (peek == '(' && aChar == ')');
    }


    public static void main(String[] args) {
        System.out.println(isValid2("}"));
    }
}
