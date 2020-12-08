package edu.samir.demo.dependencyinjection.injection;

public class DemoBean<T> {

    private String qualifier;
    private Class<T> clazz;
    private T object;

    public DemoBean(String qualifier, Class<T> clazz, T object) {
        this.qualifier = qualifier;
        this.clazz = clazz;
        this.object = object;
    }

    public String getQualifier() {
        return qualifier;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public T get(){
        return object;
    }
}
