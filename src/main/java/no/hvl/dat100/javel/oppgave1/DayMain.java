package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("Hello world!");
        System.out.println("==============");
        System.out.println();

        /*
        Andrea:
        */
        DailyPower.printPowerPrices(powerprices_day);
        System.out.printf("Den totale strømprisen: %.2f NOK%n", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.printf("Med Norges pris: %.2f NOK%n", DailyPower.computeNorgesPrice(powerusage_day));


        /*
        Solfrid:
        */




        /*
        Grethe:
        */

    }
}
