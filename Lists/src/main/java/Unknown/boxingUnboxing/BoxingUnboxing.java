package Unknown.boxingUnboxing;

public class BoxingUnboxing {

    public static void main(String[] args) {

        // manual boxing
        Double doubleValueObject = Double.valueOf(100.24);
//        Double doubleValue2 = new Double(100.24);  //depreciated

        //auto boxing
        Double doubleValue3 = 100.24;
        Double doubleValue4 = getPrimitiveDouble();


        // manual unboxing

        double doubleV = doubleValueObject.doubleValue();
        //auto unboxing
        double doubleV2 = doubleValueObject;
        double doubleV3 = getWrapperDoubleObject();





    }
    public static double getPrimitiveDouble()
    {
        return 25.34;
    }
    public static Double getWrapperDoubleObject()
    {
        return Double.valueOf(25.34);
    }
}
