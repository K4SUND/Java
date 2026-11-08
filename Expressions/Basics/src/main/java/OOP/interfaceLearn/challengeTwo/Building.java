package OOP.interfaceLearn.challengeTwo;

import OOP.interfaceLearn.challengeTwo.enums.Color;
import OOP.interfaceLearn.challengeTwo.enums.GeometryType;
import OOP.interfaceLearn.challengeTwo.enums.PointMarker;
import OOP.interfaceLearn.challengeTwo.enums.UsageType;

public class Building implements Mappable{

    private String name;
    private UsageType buildingUsageType;

    public Building(String name, UsageType buildingUsageType) {
        this.name = name;
        this.buildingUsageType = buildingUsageType;
    }

    @Override
    public String getLabel() {
        return name+"("+buildingUsageType+")";
    }

    @Override
    public GeometryType getGeometryType() {
        return GeometryType.POINT;
    }

    @Override
    public String getIconType() {
        return switch (buildingUsageType){
            case BUSINESS -> Color.BLACK + " " + PointMarker.STAR;
            case ENTERTAINMENT -> Color.GREEN + " "+PointMarker.TRIANGLE;
            default -> Color.BLUE + " "+PointMarker.CIRCLE;

        };
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                ,"name":"%s" ,"usage":"%s" """.formatted(name,buildingUsageType);

    }
}
