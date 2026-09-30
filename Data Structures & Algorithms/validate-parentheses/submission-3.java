class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c== '['){
                stack.push(c);
            }else{
                switch(c){
                    case ')':
                        if(stack.isEmpty() || stack.pop() != '(') return false;
                        break;
                    case '}':
                        if(stack.isEmpty() || stack.pop() != '{') return false;
                        break;
                    case ']':
                        if(stack.isEmpty() || stack.pop() != '[') return false;
                        break;
                }   
            }
            }
            if(stack.isEmpty()){
                return true;
            }else{
                return false;
            }
        }
    }

