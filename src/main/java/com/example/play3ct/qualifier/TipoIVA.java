package com.example.play3ct.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public interface TipoIVA {
    public double calcular(double importe) ;
}

