package edu.samir.demo.dependencyinjection.servicelayer.impl;

import edu.samir.demo.dependencyinjection.servicelayer.abst.ITooService;
import edu.samir.demo.dependencyinjection.model.Too;

public class TooServiceImpl implements ITooService
{
    // We can do IoC here also
    private Too too = new Too();

    @Override
    public Too getToo(){
        return too;
    }
}
