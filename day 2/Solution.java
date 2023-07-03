import java.util.*;

class Solution {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (final char c : s.toCharArray())
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;

    return stack.isEmpty();
  }

  public static void main(String[] args){
    Solution solution = new Solution();
    boolean result = solution.isValid("aabb");
    System.out.println(result);
  }
}
