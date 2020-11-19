package Data_Structures.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class RemoveParentheses {
    public String removeOuterParentheses(String S) {
        Deque deque = new LinkedList();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for(int i = 0; i<=S.length();i++) {
            if(count==0 && !deque.isEmpty()) {
                deque.removeFirst();
                deque.removeLast();
                while (!deque.isEmpty())
                    stringBuilder.append(deque.pollFirst());
            }
            if(i == S.length())
                break;
            if(S.charAt(i) == ')')
                count--;
            else
                count++;
            deque.offerLast(S.charAt(i));
        }
        return stringBuilder.toString();
    }
}
