package HomeWork_2016_10_10;

/**
 * Created by Smaug on 10.10.2016.
 */
public class Candy extends Food {
    Candy (int w){
        super.weight = w;
    }

    @Override
    public String getEdible() {
        return ED1;
    }

    @Override
    public Flavours getFlavour() {
        return Flavours.SWEET;
    }

    @Override
    public int getCallories() {
        return 150 * this.weight;
    }
}
