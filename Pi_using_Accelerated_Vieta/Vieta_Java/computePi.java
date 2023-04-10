import java.math.BigDecimal;

public class computePi{
    public static void main(String args[]){
        //System.out.println("Let's calculate Pi using Vieta");
        int n=27, k=100;
        Vieta vieta = new Vieta();
        AcceleratedVieta Av = new AcceleratedVieta();
        BigDecimal[] V = new BigDecimal[k+1];
        BigDecimal V_pi = vieta.ComputeVieta(n,k,V);
        BigDecimal AV_pi = Av.ComputeAcceleratedVieta(k,V);

        System.out.println(AV_pi);
    }
}
