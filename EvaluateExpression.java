package com.ik.homework.recursion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvaluateExpression {
	

    /*
     * Complete the function below.
     */
     
     final static char COMBINE = ' ';
     final static char MULTI = '*';
     final static char ADD = '+';
     
    static String[] generate_all_expressions(String s, long target) {
        
        char[] input = new char[(2 * s.length()) - 1];
        
        for(int i=0, j=0; i<input.length; i=i+2, j++){
            input[i] = s.charAt(j);
        }
        
        String[] exprs = evaluate(input, target);
        
        return exprs;

    }
    
    static String[] evaluate(char[] in, long T){
        Map<String, Long> expr = new HashMap<String, Long>();
        evaluate(in, 0, T, expr);
        
        String[] op = new String[expr.size()];
        
        int i=0;
        for(String key: expr.keySet()){
            op[i++] = key;
        }
        
        return op;
    }
    
    static void evaluate(char[] input, int index, long T, Map<String, Long> expressions){
        if(index == input.length - 1){
            long computeVal = computeExpression(input);
            String exprString = String.valueOf(input).replaceAll("\\s", "");
//            System.out.println(exprString + "="+computeVal);
            if(computeVal == T && !expressions.containsKey(exprString)){
                expressions.put(exprString, computeVal);
            }
            return;
        }
        
        for(int i=index; i<input.length -2; i=i+2){
            input[i+1] = COMBINE;
            evaluate(input, i+2, T, expressions);
            
            input[i+1] = MULTI;
            evaluate(input, i+2, T, expressions);
            
            input[i+1] = ADD;
            evaluate(input, i+2, T, expressions);
            
        }
    }
    
    static long computeExpression(char[] input){
        Map<Character, Integer> precedence = new TreeMap<Character, Integer>();
        precedence.put(ADD, 1);
        precedence.put(MULTI, 2);
        precedence.put(COMBINE, 3);
        
        Stack<Long> vals = new Stack<Long>();
        Stack<Character> ops = new Stack<Character>();
        
        for(int i=0; i<input.length; i++){
            
            if(!precedence.containsKey(input[i])){
                vals.push((long)(input[i] - '0'));
            } else {
                while(true){
                    if(ops.isEmpty() || precedence.get(input[i]) > precedence.get(ops.peek())){
                        ops.push(input[i]);
                        break;
                    }
                    char op = ops.pop();
                    long right = vals.pop();
                    long left  = vals.pop();
                    vals.push(eval(op, left, right));
                }
            }
        }
        
        while(!ops.isEmpty()){
            char op = ops.pop();
            long right = vals.pop();
            long left = vals.pop();
            vals.push(eval(op, left, right));
        }
        
        return vals.pop();
    }
    
    static long eval(char op, long left, long right){
        if(op == COMBINE) return (left * 10) + right;
        else if(op == MULTI) return left * right;
        else return left + right;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] res;
        String s;
        try {
            s = in.nextLine();
        } catch (Exception e) {
            s = null;
        }

        long target;
        target = Long.parseLong(in.nextLine().trim());

        res = generate_all_expressions(s, target);
        
        
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        System.out.println(res.length + " different expressions possible.");

        bw.close();
    }
}