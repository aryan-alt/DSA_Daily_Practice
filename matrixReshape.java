class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        
        if(m*n != r*c)return mat;
        if(r == m && c == n)return mat;
        
        int newIdx = 0; //new indexing for matrix
        int orgIdx = 0; //original indexing for matrix
        int newMat[][] = new int[r][c];
        while(newIdx < r*c && orgIdx < m*n){
            
            newMat[newIdx/c][newIdx%c] = mat[orgIdx/n][orgIdx%n];
            
            newIdx++;
            orgIdx++;
        }
        
        return newMat;
    }
}