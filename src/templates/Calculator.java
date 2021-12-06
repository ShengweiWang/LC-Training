package templates;

import java.util.Stack;

/**
 * Created by Shengwei_Wang on 9/7/21.
 */
public class Calculator {
    enum Op{
        Add(1), Sub(1), Mul(2), Div(2), Open(0), Close(0);
        int p;
        Op(int p) {
            this.p = p;
        }
    }
    public int calculate(String s) {
        Stack<Op> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();
        int curr = 0;
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                curr = curr * 10 + c - '0';
            } else if (c == '+') {
                curr = reduce(curr, operator, operand, Op.Add);
                operator.push(Op.Add);
                operand.push(curr);
                curr = 0;
            } else if (c == '-') {
                curr = reduce(curr, operator, operand, Op.Sub);
                operator.push(Op.Sub);
                operand.push(curr);
                curr = 0;
            } else if (c == '*') {
                curr = reduce(curr, operator, operand, Op.Mul);
                operator.push(Op.Mul);
                operand.push(curr);
                curr = 0;
            } else if (c == '/') {
                curr = reduce(curr, operator, operand, Op.Div);
                operator.push(Op.Div);
                operand.push(curr);
                curr = 0;
            } else if (c == '(') {
                operator.push(Op.Open);
            } else if (c == ')') {
                curr = reduce(curr, operator, operand, Op.Close);
            } else {
                throw new RuntimeException();
            }
        }
        if(!operator.isEmpty()) {
            curr = reduce(curr, operator, operand, Op.Close);
        }
        return curr;
    }

    private int reduce(int curr, Stack<Op> operator, Stack<Integer> operand, Op cur) {
        while(!operator.isEmpty() && cur.p <= operator.peek().p) {
            Op next = operator.pop();
            if (next == Op.Open) {
                cur = Op.Mul;
            } else {
                int left = operand.pop();
                if (next == Op.Add) {
                    curr = left + curr;
                } else if (next == Op.Sub) {
                    curr = left - curr;
                } else if (next == Op.Mul) {
                    curr = left * curr;
                } else if (next == Op.Div) {
                    curr = left / curr;
                }
            }
        }
        return curr;
    }


    private int onlyPlusMul(String s) {
        int prev = 0; // before op
        int curr = 0;
        int sum = 0;
        char op = '+';
        s += "+";
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                curr = curr * 10 + c - '0';
            } else if (c != ' ') {
                if (op == '+' || op == '-') {
                    sum += prev;
                    prev = op == '+' ? curr : -curr;
                } else if (op == '*') {
                    prev = prev * curr;
                } else if (op == '/') {
                    prev = prev / curr;
                }
                op = c;
                curr = 0;
            }
        }
        sum += prev;
        return sum;
    }

    public int calculateUsingStack(String s) {
        if(s == null || s.length() == 0) return 0;
        int len = s.length();
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                currentNumber = currentNumber * 10 + s.charAt(i) - '0';
            }
            if(!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) || i == len - 1){
                if(operation == '-'){
                    stack.push(-currentNumber);
                } else if(operation == '+'){
                    stack.push(currentNumber);
                } else if(operation == '*'){
                    stack.push(stack.pop() * currentNumber);
                } else if(operation == '/'){
                    stack.push(stack.pop() / currentNumber);
                }
                operation = s.charAt(i);
                currentNumber = 0;
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
