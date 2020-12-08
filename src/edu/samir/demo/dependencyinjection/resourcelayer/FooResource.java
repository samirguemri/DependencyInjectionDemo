package edu.samir.demo.dependencyinjection.resourcelayer;

import edu.samir.demo.dependencyinjection.servicelayer.abst.IFooService;

//Path("/foo)
public class FooResource extends AbstractResource{

    public IFooService getFooResource()
    {
        return getServiceFactory().getFooService();
    }
}
