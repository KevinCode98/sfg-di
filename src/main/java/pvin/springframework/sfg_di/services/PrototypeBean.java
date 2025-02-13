package pvin.springframework.sfg_di.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating a PrototypeBean");
    }

    public String getMyScope() {
        return "I'm a PrototypeBean";
    }
}
