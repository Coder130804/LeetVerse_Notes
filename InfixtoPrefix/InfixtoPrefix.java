import java.util.*;
public class InfixtoPrefix 
{
    //A symbol in the expression is an operator or not
    static boolean isOp(char c) 
    {
        if (c=='+'||c=='-'||c=='*'||c=='/'||c=='^'||c == '%')
            return true;
        else
            return false;
    }

    //Gives the operator precedence
    static int precedence(char op) 
    {
        switch(op) 
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    //Checks for right associative operator
    static boolean Right(char op) 
    {
        return (op == '^');
    }

    //reverses the String
    static String reverse(String s) 
    {
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }

    //swaps the brackets
    static String swapBrackets(String exp) 
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < exp.length(); i++) 
        {
            char c = exp.charAt(i);
            if(c == '(')
                result.append(')');
            else if(c == ')')
                result.append('(');
            else
                result.append(c);
        }
        return result.toString();
    }

    //generates a Postfix expression
    static String Postfix(String exp) 
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            //CASE 1: If its an operand, then its appended to the output exp
            if(Character.isLetterOrDigit(c))
                output.append(c);

            //CASE 2: Open Bracket
            else if(c == '(') 
                stack.push(c);
            
            //CASE 3: Closing Bracket
            else if(c == ')')
            {
                while(!stack.isEmpty() && stack.peek() != '(') 
                    output.append(stack.pop());
                stack.pop();
            }
            
            //CASE 4: When an operator is encountered
            else if(isOp(c)) 
            {
                while(!stack.isEmpty() && ((precedence(stack.peek()) > precedence(c)) || (precedence(stack.peek()) == precedence(c) && !Right(c))) && stack.peek() != '(') 
                    output.append(stack.pop());
                stack.push(c);
            }
        }

        // when END OF EXPRESSION 
        while(!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    //generates prefix expression
    static String Prefix(String exp) 
    {
        exp = reverse(exp);
        exp = swapBrackets(exp);
        String post = Postfix(exp);
        String pre = reverse(post);
        return pre;
    }

     //driver function
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Infix Expression: ");
        String exp = in.nextLine();
        String prefix = Prefix(exp);
        System.out.println("Prefix Expression: " + prefix);
    }
}