package koschei.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Deth8 deth8;

    public Egg6(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + getNeedle(deth8).toString();
    }
    @Bean
    public static Needle7 getNeedle(Deth8 deth8) {
        return new Needle7(deth8);
    }
}
