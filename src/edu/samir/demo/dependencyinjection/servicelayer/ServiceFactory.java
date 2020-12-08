package edu.samir.demo.dependencyinjection.servicelayer;

import edu.samir.demo.dependencyinjection.servicelayer.abst.IFooService;
import edu.samir.demo.dependencyinjection.servicelayer.abst.ITooService;

public class ServiceFactory
{
    private IFooService fooManager;
    private ITooService tooManager;

    public IFooService getFooService() {
        return fooManager;
    }

    public void setFooService(IFooService fooManager) {
        this.fooManager = fooManager;
    }

    public ITooService getTooService() {
        return tooManager;
    }

    public void setTooService(ITooService tooService) {
        this.tooManager = tooService;
    }
}
