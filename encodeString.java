
class GfG
 {
	String encode(String str)
	{
          //Your code here
          int n = str.length();
          int cnt = 1;
          String ans = "";
          int i = 0;
          for(i = 1; i < n; i++){
              if(str.charAt(i) == str.charAt(i-1)){
                  cnt++;
              }else{
                  ans += str.charAt(i-1);
                  ans += cnt;
                  cnt = 1;
              }
          }
           ans += str.charAt(i-1);
           ans += cnt;
          return ans;
	}
	
 }