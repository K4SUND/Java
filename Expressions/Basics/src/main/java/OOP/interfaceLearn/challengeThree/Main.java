package OOP.interfaceLearn.challengeThree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ISaveable> iSaveables = new ArrayList<>();
        iSaveables.add(new Player("Player1",1,1));
        iSaveables.add(new Player("Player2",2,2));
        iSaveables.add(new Monster("Monster1",1,1));
        iSaveables.add(new Monster("Monster2",2,2));

        //write
//        for(var isaveble:iSaveables)
//        {
//            System.out.println(isaveble.write());
//        }

        //read
        System.out.println(iSaveables.get(0).write());
        iSaveables.get(0).read(List.of("Player11","2","2","Foot"));
        System.out.println(iSaveables.get(0).write());
    }
}
