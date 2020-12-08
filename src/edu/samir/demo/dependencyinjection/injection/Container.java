package edu.samir.demo.dependencyinjection.injection;

import java.util.ArrayList;
import java.util.List;

public class Container {

    private List<DemoBean> beanList = new ArrayList<>();

    public void createBean(DemoBean bean){
        beanList.add(bean);
    }

    public <T> T getBean(String qualifier, Class<T> requiredType) {
        for (DemoBean<T> bean : beanList ) {
            if(qualifier.equals(bean.getQualifier()) && requiredType.getSimpleName().equals(bean.getClazz().getSimpleName()))
                return bean.get();
        }
        return null;
    }
}
