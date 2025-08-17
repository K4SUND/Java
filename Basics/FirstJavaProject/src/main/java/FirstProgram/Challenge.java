package FirstProgram;

public class Challenge {
    public static void main(String[] args) {
        double variableOne = 20.00d;
        double variableTwo = 80.00d;

        //add vOne and vTwo , then multiply by 100
        double variableThree = (variableOne +variableTwo) *100.00d;

        //remainder (%)
        double variableFour = variableThree % 40.00d;

        boolean isRemainderZero = (variableFour == 0.00);

        System.out.println("isRemainderZero is " + isRemainderZero);

        if(!isRemainderZero){
            System.out.println("got some remainder");
        }

    }
}
