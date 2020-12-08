package edu.samir.demo.dependencyinjection;

import edu.samir.demo.dependencyinjection.injection.ContextInitializer;
import edu.samir.demo.dependencyinjection.servicelayer.ServiceFactory;
import edu.samir.demo.dependencyinjection.servicelayer.abst.IFooService;

public final class DependencyInjectionDemoApp {

    private static final DependencyInjectionDemoApp INSTANCE = new DependencyInjectionDemoApp();

    public ContextInitializer getInitializer() {
        return initializer;
    }

    private final ContextInitializer initializer = new ContextInitializer();

    public static DependencyInjectionDemoApp getInstance() {
        return DependencyInjectionDemoApp.INSTANCE;
    }

    public static void main(String[] args) {

        ContextInitializer initializer = DependencyInjectionDemoApp.getInstance().getInitializer();
        ServiceFactory serviceFactory = initializer.getIocContainer().getBean("serviceFactory", ServiceFactory.class);

        /* Test if we have an instance of ServiceFactory */
        serviceFactory.getFooService().getFoo().doSomething();
        serviceFactory.getTooService().getToo().doSomething();

        /* Test if we have the same Object Foo */
        // Access to getFoo() from the serviceFactory Bean
        System.out.println(serviceFactory.getFooService().getFoo());
        // Access to getFoo() from the BeanContainer
        System.out.println(initializer.getIocContainer().getBean("fooService", IFooService.class).getFoo());
    }
}
