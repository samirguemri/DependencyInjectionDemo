package edu.samir.demo.dependencyinjection.injection;

import edu.samir.demo.dependencyinjection.resourcelayer.AbstractResource;
import edu.samir.demo.dependencyinjection.servicelayer.ServiceFactory;
import edu.samir.demo.dependencyinjection.servicelayer.abst.IFooService;
import edu.samir.demo.dependencyinjection.servicelayer.abst.ITooService;
import edu.samir.demo.dependencyinjection.servicelayer.impl.FooServiceImpl;
import edu.samir.demo.dependencyinjection.servicelayer.impl.TooServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ContextInitializer {

    Container IocContainer = new  Container();

    public ContextInitializer()
    {
        ServiceFactory serviceFactory = new ServiceFactory();
        DemoBean<ServiceFactory> serviceFactoryBean = new DemoBean<>("serviceFactory", ServiceFactory.class, serviceFactory);
        IocContainer.createBean(serviceFactoryBean);

        FooServiceImpl fooService = new FooServiceImpl();
        serviceFactory.setFooService(fooService);
        DemoBean<IFooService> fooServiceBean = new DemoBean<>("fooService", IFooService.class, fooService);
        IocContainer.createBean(fooServiceBean);

        TooServiceImpl tooService = new TooServiceImpl();
        serviceFactory.setTooService(tooService);
        DemoBean<ITooService> tooServiceBean = new DemoBean<>("tooService", ITooService.class, tooService);
        IocContainer.createBean(tooServiceBean);

        AbstractResource.setServiceFactory(serviceFactory);
    }

    public Container getIocContainer() {
        return IocContainer;
    }
}
