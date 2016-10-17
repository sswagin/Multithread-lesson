package HomeWork_2016_10_10;

/**
 * Created by Smaug on 10.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Beef steak = new Beef(200);
        Candy lollipop = new Candy(20);

        Flavours flavour_sweet = Flavours.SWEET;
        Flavours flavour_bitter = Flavours.BITTER;
//        flavour_bitter.printInfo();
        Flavours.BITTER.printInfo();
        Flavours.SWEET.printInfo();
        Flavours.SALTY.printInfo();

        System.out.println(Flavours.getFlavourByOrder(2));
        Enum enum1 = Flavours.ACIDIC;

        System.out.println(enum1.name());


            System.out.println("1. Type: " + steak.getClass() + " Callories: " + steak.getCallories() + " Taste: " + steak.getFlavour());
            System.out.println("2. Type: " + lollipop.getClass() + " Callories: " + lollipop.getCallories() + " Taste: " + lollipop.getFlavour());
    }
}
