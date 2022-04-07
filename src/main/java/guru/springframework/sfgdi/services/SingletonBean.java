package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creatin a singleton bean.");
    }

    public String getMyScope() {
        return "I am a Singleton";
    }
}
