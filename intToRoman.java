class Solution {
    public String intToRoman(int num) {
        int[] intValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] codes = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < intValues.length; i++){
            while(num >= intValues[i])
            {
                ans.append(codes[i]);
                num -= intValues[i];
            }
        }
        
        return ans.toString();
    }
}