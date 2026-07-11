import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(currNum);
                strStack.push(currStr);
                
                currNum = 0;
                currStr = new StringBuilder();
            } else if (ch == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder decodedSegment = currStr;
                
                currStr = strStack.pop();
                
                while (repeatTimes > 0) {
                    currStr.append(decodedSegment);
                    repeatTimes--;
                }
            } else {
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }
}







































