package Unknown.enumLearn;

public enum Topping {
    // no order

    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    // after semi colon ;
    // methods
    public int getPrice()
    {
        return switch (this)
        {
            case MUSTARD -> 10;
            case PICKLES -> 5;
            default -> 0;
        };
    }

}
