package com.learning1.HW_week1;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;
    CakeBaker(Frosting frosting,Syrup syrup)
    {
        this.frosting=frosting;
        this.syrup=syrup;
    }

   public String bakeCake()
    {
           return frosting.getFrostingType() + syrup.getSyrupType() + " cake completed";
    }
}
