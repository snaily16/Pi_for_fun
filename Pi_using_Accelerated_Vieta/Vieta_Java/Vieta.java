import java.math.*;

public class Vieta{

    public BigDecimal ComputeVieta(int n, int k, BigDecimal V[]){
        int m = n+k;
        BigDecimal p = new BigDecimal(1.0);
        BigDecimal a_n = new BigDecimal(0.0);
        //BigDecimal[] V = new BigDecimal[k+1];
        BigDecimal two = new BigDecimal(2.0);
        BigDecimal pi, ptemp;
        // Set precision to 100
        MathContext mc = new MathContext(5000);

        for(int i=0; i<m+1; i++){
            a_n = (a_n.add(two)).sqrt(mc);
            ptemp = two.divide(a_n, 5000, RoundingMode.DOWN);
            p = p.multiply(ptemp);
            if(i>=n){
                V[i-n]=p;
            }
        }
     pi = two.multiply(V[k-1]);
     //System.out.println(pi);
     return pi;
    }
}
