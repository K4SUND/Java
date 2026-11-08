package OOP.interfaceLearn.challengeTwo;

import OOP.interfaceLearn.challengeTwo.enums.UsageType;
import OOP.interfaceLearn.challengeTwo.enums.UtilityType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Mappable> listOfMappable = new ArrayList<>();

        listOfMappable.add(new Building("ParkLand", UsageType.BUSINESS));
        listOfMappable.add(new Building("Sysco Labs", UsageType.BUSINESS));
        listOfMappable.add(new Building("Nelum Pokuna", UsageType.ENTERTAINMENT));
        listOfMappable.add(new Building("BC College", UsageType.SCHOOL));

        // utility
        listOfMappable.add(new UtilityLine("ECB", UtilityType.ELECTRICAL));
        listOfMappable.add(new UtilityLine("Telecom", UtilityType.FIBER_OPTIC));
        listOfMappable.add(new UtilityLine("WB", UtilityType.WATER));


        for(Mappable m : listOfMappable)
        {
            Mappable.mapIt(m);
        }

    }
}
