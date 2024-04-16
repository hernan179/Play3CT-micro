package com.example.play3ct.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
 
@Component
@Qualifier("france")
public class TipoIVAFrance  implements TipoIVA{
 
    @Override
    public double calcular(double importe) {
        // TODO Auto-generated method stub
        return importe *1.25;
    }
 
}

@Component
@Qualifier("spain")
class TipoIVASpain  implements TipoIVA{

   @Override
   public double calcular(double importe) {
       // TODO Auto-generated method stub
       return importe *1.21;
   }

}
class Gasto {
	 
    private double importe;
 
    public double getImporte() {
        return importe;
    }
 
    public void setImporte(double importe) {
        this.importe = importe;
    }
 
    public Gasto(double importe) {
        super();
        this.importe = importe;
    }
 
}