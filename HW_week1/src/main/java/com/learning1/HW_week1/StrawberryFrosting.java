package com.learning1.HW_week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.bake", havingValue = "Strawberry")
public class StrawberryFrosting implements Frosting{

    public String getFrostingType()
    {
        return "Strawberry Frosting + ";
    }
}
