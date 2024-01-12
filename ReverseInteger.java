import java.math.BigInteger;
class Solution {
    public int reverse(int x) {
        int limiteInferior = Integer.MIN_VALUE;
        int limiteSuperior = Integer.MAX_VALUE;
        DecimalFormat decimalFormat = new DecimalFormat("#");
        Long a = Long.valueOf(x);
         if(x < 0){
             a = -a;
         }
        String myNumberAsString = decimalFormat.format(a);
        String fraseInvertida = new StringBuilder(myNumberAsString).reverse().toString();
        Long number = Long.parseLong(fraseInvertida);
        if (x < 0) {
            number = -number ;
        }
        if (limiteInferior <= number && number <= limiteSuperior) {
            int jurema = Integer.parseInt(fraseInvertida);
            return (x < 0) ? -jurema : jurema;
        }
        return 0;
    }
}
