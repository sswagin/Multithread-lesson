package HomeWork_2016_10_10;

import org.omg.PortableInterceptor.ServerRequestInfo;

/**
 * Created by Smaug on 10.10.2016.
 */
public class Beef extends Food {
    Beef(int w) {
        super.weight = w;
        Flavours flavour;
    }

    @Override
    public String getEdible() {
        return null;
    }

    @Override
    public Flavours getFlavour() {
        return Flavours.ACIDIC;
    }

    @Override
    public int getCallories() {
        return 150 * this.weight;
    }

}
