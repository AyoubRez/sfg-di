package shredder.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FR")
@Service("i18nService")
public class I18nFrenshGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Salut en Francais c'est quoi ? ";
    }
}
