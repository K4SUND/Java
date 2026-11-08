package OOP.interfaceLearn.challengeTwo;

import OOP.interfaceLearn.challengeTwo.enums.GeometryType;

public interface Mappable {


    // public static final
    String JSON_PROPERTY = """
            "properties":{%s}""";

    String getLabel();
    GeometryType getGeometryType();
    String getIconType();


    default String toJson()
    {
        return """
                "type": "%s", "label":"%s", "marker":"%s" """
                .formatted(getGeometryType(),getLabel(),getIconType());
    }

    static void mapIt(Mappable mappable)
    {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }

}
