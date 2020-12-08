package edu.samir.demo.dependencyinjection.resourcelayer;

import edu.samir.demo.dependencyinjection.servicelayer.ServiceFactory;

public abstract class AbstractResource
{
    private static ServiceFactory serviceFactory;

    protected ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public static void setServiceFactory(ServiceFactory serviceFactory) {
        AbstractResource.serviceFactory = serviceFactory;
    }
}
