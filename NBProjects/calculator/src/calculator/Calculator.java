/*  Name: Pallav Shah  Title: Calculator.java 
Description: The purpose of this program is to create a calculator that takes 
an infix string and converts to a postfix expression and calculates it. 
The expression can contain integer constants, a variable x, unary operators 
(+ and -), binary operators (plus, negative, multiply, divide, and remainder),
and parentheses. This program will repeatedly prompt the user for the value of
x and display the result from the conversion and evaluate it each time. If the
users enters letter ‘q’, then the program gets terminate. If the infix expression
contains any kind of error, the program must display the error in expression 
and then terminate the program. The data structure that is being used is stacks.
Once the user runs this program, it’s going to prompt the user enter infix 
expression. If the user enters an infix expression, then it is going to check 
for errors and if no errors are found, then it is going to convert to a postfix
expression. If the infix expression contains a variable x, then it’s going to
prompt the user to enter a value of x and then evaluates the postfix expression
and prints out the answer.

OperatorError(String s): Accepts a string value as a parameter and checks if
there are operator with another operator or an operand with another operand.
calculate: This method accepts a postString and a value of x and solves the
expression and returns the answer.
checkForIllegalChar: this method checks if the expression contains any
illegal character.
checkLastToken: It checks if last character is an operand and if it is, prints
error message.
hasHighPrec: This method checks if the current character has higher precedence
than the top of the stack
infixToPostfix: this method converts the entered infix string in to postfix
expression.
isClosingBarc: this checks if the current character is a closing bracket.
isOpeningBrac: this checks if the current character is a opening bracket.
isOperand: this method checks if the current character is operand or not.
isOperator: this method checks if the current character is operator or not.
isUnary: This method checks if the character is a unary operator or not.
checNumOfBracket: This method checks if the infix string has the same 
number of opening and closing parentheses.
*/
package calculator;

import java.util.Stack;
import java.util.Scanner;

public class Calculator {

    static Stack<Character> s = new Stack();
    static Stack<Integer> s1 = new Stack();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infixString = input.nextLine();
        checkForIllegalChar(infixString);
        checkLastToken(infixString);
        checkNumOfBrac(infixString);
       
        String postString = infixToPostfix(infixString);
        System.out.println("Postfix String is: " + postString);
        String x;
        System.out.print("Enter Value Of X(q to exit): ");
        x = input.nextLine();
        while (!x.equalsIgnoreCase("q")) {
            int ans = calculate(postString, x);
            System.out.println("Answer to the expression:" + ans);
            System.out.print("Enter Value Of X(q to exit): ");
            x = input.nextLine();
        }
    }
// accepts a prefix string, checks for unary operators and the turns the string
// into a post string and returns the string.
    public static String infixToPostfix(String infixString) {
        for (int i = 0; i < infixString.length() - 1; i++) {
            if (i == 0) {
                //Takes the unary operator + out of the string
                if (infixString.charAt(i) == '+') {  
                    infixString = infixString.substring(1);
                }
                // Converts the unary operators - to _
                if (infixString.charAt(i) == '-') {
                    infixString = "_" + infixString.substring(1);
                }
            } else {
                char c = infixString.charAt(i);
                boolean before = isOperator(infixString.charAt(i - 1));
                if (c == '+' && before) {
                    infixString = infixString.substring(0, i) + infixString.substring(i + 1);
                }
                if (c == '-' && before) {
                    infixString = infixString.substring(0, i) + infixString.substring(i + 1, i + 2) + "_" + infixString.substring(i + 2);
                }
            }

        }
        System.out.println(infixString);
         //OperatorError(infixString);
        String res = "";
        //Converts infix to postfix 
        for (int i = 0; i < infixString.length(); i++) {
            char c = infixString.charAt(i);

            if (isOperand(c)) {
                res += c;
            } else if (isOperator(c)) {
                while (!s.empty() && !isOpeningBrac(s.peek()) && hasHighPrec(s.peek(), c)) {
                    res += s.peek();
                    s.pop();

                }

                s.push(c);
            } else if (isOpeningBrac(c)) {
                
                s.push(c);
            } else if (isClosingBrac(c)) {
                while (!(s.empty()) && !isOpeningBrac(s.peek()) && hasHighPrec(s.peek(), c)) {
                    res += s.peek();
                    s.pop();
                }
                s.pop();
            }

        }
        
        while (!s.empty()) {
            if (s.peek() == '(') {//checks if stack contains '(' left in the
                //stack
                System.out.println("Error in Sxpression!!");
                System.exit(0);
            }
            res += s.pop();
        }

        return res;
    }
//isOperand: this method checks if the current character is operand or not.
    public static boolean isOperand(char c) {
        return c == '0' || c == '1' || c == '2' || c == '3'
                || c == '4' || c == '5' || c == '6' || c == '7'
                || c == '8' || c == '9' || c == 'x' || c == 'X' || c == '_';
    }
//isOperator: this method checks if the current character is operator or not.
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%';
    }
//hasHighPrec: This method checks if the current character has higher precedence
//than the top of the stack
    public static boolean hasHighPrec(char c, char d) {
        int i = 0, j = 0;

        switch (c) {
            case '+':
            case '-':
                i = 2;
                break;
            case '*':
            case '/':
            case '%':
                i = 4;
                break;
            default:
                i = 0;

        }
        switch (d) {
            case '+':
            case '-':
                j = 2;
                break;
            case '*':
            case '/':
            case '%':
                j = 4;
                break;
            default:
                j = 0;
        }
        return i >= j;
    }
//isOpeningBrac: this checks if the current character is a opening bracket.
    public static boolean isOpeningBrac(char c) {

        return c == '(' || c == '{' || c == '[';
    }
//isClosingBarc: this checks if the current character is a closing bracket.
    public static boolean isClosingBrac(char c) {
        return c == ')' || c == '}' || c == ']';
    }
//isUnary: This method checks if the character is a unary operator or not.
    public static boolean isUnary(char c) {
        return c == '_';
    }
//calculate: This method accepts a postString and a value of x and solves the
//expression and returns the answer.
    public static int calculate(String s, String a) {
        int x = Integer.parseInt(a);
        for (int i = 0; i < s.length(); i++) {
            String k = s.substring(i, i + 1);
            char c = s.charAt(i);
            int ans, temp1, temp2;
            if (isOperand(c) && s.charAt(i + 1) == '_') {
                if (c == 'x') {
                    s1.push(-x);
                } else {
                    s1.push(-Integer.parseInt(k));
                }
                i += 1;
            } else if (isOperand(c)) {
                if (c == 'x') {
                    s1.push(x);
                } else {
                    s1.push(Integer.parseInt(k));
                }
            } else {
                switch (c) {
                    case '*':
                        ans = s1.pop() * s1.pop();
                        s1.push(ans);
                        break;
                    case '/':
                        temp2 = s1.pop();
                        temp1 = s1.pop();
                        ans = temp1 / temp2;
                        s1.push(ans);
                        break;
                    case '+':
                        ans = s1.pop() + s1.pop();
                        s1.push(ans);
                        break;
                    case '-':
                        temp2 = s1.pop();
                        temp1 = s1.pop();
                        ans = temp1 - temp2;
                        s1.push(ans);
                        break;
                    case '%':
                        temp2 = s1.pop();
                        temp1 = s1.pop();
                        ans = temp1 % temp2;
                        s1.push(ans);
                        break;
                }
            }
        }
        return s1.pop();
    }
//checkForIllegalChar: this method checks if the expression contains any
//illegal character.
    public static void checkForIllegalChar(String s) {
        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i) == '.') {
                System.out.println("Error in expression!! Cannot accept floating point numbers");
                System.exit(0);
            }
        }
    }
//checkLastToken: It checks if last character is an operand and if it is, prints
//error message.
    public static void checkLastToken(String s) {
        if (isOperator(s.charAt(s.length() - 1))) {
            System.out.println("Error in Lxpression!!");
            System.exit(0);
        }

    }
//Accepts a string value as a parameter and checks if
//there are operator with another operator or an operand with another operand.
    public static void OperatorError(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i), d = s.charAt(i + 1);
            
            
            
            if ((isOperator(c) && isOperator(d)) || (isOperand(c) && isOperand(d))) {
                System.out.println("Error in Oxpression!!");
                System.exit(0);
            }
        }
    }
  //checNumOfBracket: This method checks if the infix string has the same 
//number of opening and closing parentheses.
    public static void checkNumOfBrac(String s){
        int count1=-1,count2 = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count1++;
            }
            if(s.charAt(i)==')'){
                count2++;
            }
           
            
        }
        if(!(count1 == count2)){
                System.out.println("Error in Nxpression!!");
                System.exit(0);
            }
    }
}
