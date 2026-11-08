package OOP.interfaceLearn.challengeTwo;

import OOP.interfaceLearn.challengeTwo.enums.*;

public class UtilityLine implements Mappable {


    private String name;
    private UtilityType utilityType;

    public UtilityLine(String name, UtilityType utilityType) {
        this.name = name;
        this.utilityType = utilityType;
    }

    @Override
    public String getLabel() {
        return name + "(" + utilityType + ")";
    }

    @Override
    public GeometryType getGeometryType() {
        return GeometryType.LINE;
    }

    @Override
    public String getIconType() {
        return switch (utilityType)
        {
            case ELECTRICAL -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            case FIBER_OPTIC -> Color.RED + " " + PointMarker.SQUARE;
            default -> Color.BLUE + " "+PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                ,"name":"%s" ,"utility":"%s" """.formatted(name,utilityType);
    }
}
