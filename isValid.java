class Solution {
    public boolean isValid(String s) {
        Stack<Character> ip = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                ip.push(x);
            }else{
                if(ip.isEmpty())return false;    //no elements in stack exist initially
                
                char c = ip.peek();
                ip.pop();
                
                 if((x == ')' && c == '(') ||  (x == ']' && c == '[') || (x == '}' && c == '{')) continue;
                else{
                    return false;
                }
            }
        }
        
        
        return (ip.isEmpty());
       // if(ip.isEmpty())return true;
        //return false;
    }
}