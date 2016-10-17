package HomeWork_2016_10_10;

/**
 * Created by Smaug on 10.10.2016.
 */
public enum Flavours {
    BITTER {
        @Override
        void printInfo() {
            System.out.println("I'm Bitter!");
            //super.printInfo();
        }
    },
    SALTY {
        @Override
        void printInfo() {
            super.printInfo();
        }
    },
    SWEET {
        @Override
        void printInfo() {
            super.printInfo();
        }
    },
    SHARP {
        @Override
        void printInfo() {
            super.printInfo();
        }
    },
    ACIDIC {
        @Override
        void printInfo() {
            super.printInfo();
        }
    };

    static Flavours getFlavourByOrder(int order) {
        //Flavours.valueOf()
        if (order >= values().length)
            return null;
        return values()[order];

    }

    void printInfo() {
        System.out.println("I am flavour");
    }
}
