/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
   public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int res = n;
        while(start<=end){
            int mid = start + (end - start) / 2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                res = mid ;
                end = mid -1 ;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }
}