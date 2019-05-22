import java.util.Arrays;

public class Solution5 {
    public String longestPalindrome(String s) {
        Boolean[][] D=new Boolean[1000][1000];
        if (s.length()==0){
            return "";
        }
        for(int i=0;i<1000;i++){
            Arrays.fill(D[i],false);
        }

        int right=0,left=0;
        for (int i=0;i<s.length();i++){
            D[i][i]=true;

            for (int j=i-1;j>=0;j--){


                if (i-j==1){
                D[i][j]=(s.charAt(i)==s.charAt(j));}
                else {
                    D[i][j]=(s.charAt(i)==s.charAt(j))&&D[i-1][j+1];
                }

                if (i-j>right-left&&D[i][j]){
                    right=i;
                    left=j;


                }

            }
        }
        return s.substring(left,right+1);

    }

    public static void main(String[] args) {
       Solution5 s =new Solution5();
        System.out.println(s.longestPalindrome(""));

    }

}
