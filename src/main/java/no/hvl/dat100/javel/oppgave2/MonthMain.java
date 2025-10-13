package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        Andrea
        */
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println("Hytte over grense :" + MonthlyPower.exceedThreshold(power_usage_month,1000));
        System.out.println("Hus over grense :" + MonthlyPower.exceedThreshold(power_usage_month,5000));
        System.out.printf("Norgespris for måneden: %.2f NOK%n", MonthlyPower.computeNorgesPrice(power_usage_month));
        /*
        Solfrid
        */

        /*
        Grethe
        */

    }
}