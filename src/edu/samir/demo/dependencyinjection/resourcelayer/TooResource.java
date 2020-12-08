package edu.samir.demo.dependencyinjection.resourcelayer;

import edu.samir.demo.dependencyinjection.servicelayer.abst.ITooService;

public class TooResource  extends AbstractResource
{
    public ITooService getTooResource(String qualifier)
    {
        return getServiceFactory().getTooService();
    }
}
