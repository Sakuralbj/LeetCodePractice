public class Solution7 {

    public int reverse(int x) {
        int result=0;
        if (x>=0) {
            while (x != 0) {
                int rev = x % 10;
                x /= 10;

                result = 10 * result + rev;
                if (result > Integer.MAX_VALUE ) {
                    return 0;
                }

            }
        }
        else if (x<0){
            x=-x;
            while (x!=0) {
                    int rev = x % 10;
                    x /= 10;
                System.out.println(x);

                    result = 10 * result + rev;
                System.out.println(result);
                    if (result>Integer.MAX_VALUE){
                        System.out.println(Integer.MIN_VALUE);
                        return 0;
                    }

                }
                result=-result;

            }
            return -result;







    }

    public static void main(String[] args) {
        Solution7 s1=new Solution7();

        System.out.println(s1.reverse(-123));
    }


}
