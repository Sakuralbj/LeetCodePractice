public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String minstr=strs[0];
        for (int i=1;i<strs.length;i++){
            if (minstr.length()==0){
                return "";
            }
            String temp="";
            for (int j=0;j<minstr.length()&&j<strs[i].length();j++){
                if (strs[i].charAt(j)!=minstr.charAt(j)){
                    break;

                }
                temp+=minstr.charAt(j);


            }
            minstr=temp;
        }
        return minstr;

    }


}
