package edu.samir.demo.dependencyinjection.servicelayer.impl;

import edu.samir.demo.dependencyinjection.servicelayer.abst.IFooService;
import edu.samir.demo.dependencyinjection.model.Foo;

public class FooServiceImpl implements IFooService
{
    // We can do IoC here also
    private Foo foo = new Foo();

    @Override
    public Foo getFoo(){
        return foo;
    }
}
