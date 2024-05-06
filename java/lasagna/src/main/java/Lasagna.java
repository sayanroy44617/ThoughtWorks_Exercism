public class Lasagna {

    public int expectedMinutesInOven()
    {
        return 40;
    }


    public int remainingMinutesInOven(int minutesInOven)
    {
        int remaningMinutes = expectedMinutesInOven() - minutesInOven;
        return remaningMinutes;
    }


    public int preparationTimeInMinutes(int layers)
    {
        int preparationTime = 2*layers;
        return preparationTime;
    }


    public int totalTimeInMinutes(int layers , int minutesInOven)
    {
        int totalTime = preparationTimeInMinutes(layers) + minutesInOven ;
        return totalTime;
    }
}
