
public class Main
{
	
public static void StringCompare(String str){
	    
int len = str.length();
	    
String strNew = "";
	    
	    
strNew += str.charAt(0);
	   
 for(int i = 1; i < len-1; i++){
	        
if((str.charAt(i-1) == 'S' || str.charAt(i-1) == 's')&(str.charAt(i+1) == 'R' || str.charAt(i+1) == 'r'))
{continue;
}
else{strNew += str.charAt(i);}
	    
}
	    
	    
strNew += str.charAt(len-1);
	    
System.out.println(strNew);
	
}
	
	
public static void main(String[] args) {
		
StringCompare("SarkSurvey");
}

}
