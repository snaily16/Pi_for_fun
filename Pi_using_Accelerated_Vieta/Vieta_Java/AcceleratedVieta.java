import java.math.*;

public class AcceleratedVieta{

    public BigDecimal ComputeAcceleratedVieta(int k, BigDecimal V[]){
        int m = k;
        BigDecimal kpow = new BigDecimal(1.0);
        BigDecimal four = new BigDecimal(4.0);
        BigDecimal two = new BigDecimal(2.0);
        
        BigDecimal num, denom, pi;

        for(int j=0; j<k; j++){
            kpow = kpow.multiply(four);
            for(int i=0; i<m; i++){
                num = kpow.multiply(V[i+1]).subtract(V[i]);
                denom = kpow.subtract(BigDecimal.ONE);
                V[i] = num.divide(denom, 5000,RoundingMode.DOWN);
            }
            m-=1;
        }
        pi = V[0].multiply(two);
        return pi;
    }
}
