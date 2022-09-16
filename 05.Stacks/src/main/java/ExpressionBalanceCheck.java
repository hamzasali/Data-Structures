public class ExpressionBalanceCheck {
    public static void main(String[] args) {

        System.out.println(balanceCheck("((A*B) + [v-m])"));
    }

    public static boolean balanceCheck(String expr) {
        MyStack<Character> myStack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {
            Character ch = expr.charAt(i);
            if (ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != ']' && ch != '}') continue;
            if (ch == '(' || ch == '[' || ch == '{') {
                myStack.push(ch);
                continue;
            }
            if (myStack.isEmpty()) return false;
            switch (ch) {
                case ')':
                    if (myStack.pop() != '(') return false;
                    break;
                case ']':
                    if (myStack.pop() != '[') return false;
                    break;
                case '}':
                    if (myStack.pop() != '{') return false;
                    break;
            }
        }
        return myStack.isEmpty();

    }
}
