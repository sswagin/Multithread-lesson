package HomeWork_2016_10_10;

/**
 * Created by Smaug on 10.10.2016.
 */

abstract class Food implements Edible {
    @Override
    abstract public String getEdible();

    @Override
    abstract public Flavours getFlavour();

    @Override
    abstract public int getCallories();

    int weight;

};

