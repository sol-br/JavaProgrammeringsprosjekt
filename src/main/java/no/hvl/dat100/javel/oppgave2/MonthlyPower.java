package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        int dagen = 1;
        for(double[] dag:usage){
            System.out.print("Dag " + dagen + ":");
            for(double strom:dag){
                System.out.printf("%5.2f kwh", strom);
            }
            System.out.println();
            dagen+=1;
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        // TODO

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        // TODO

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {
        boolean exceeded = false;
        double usage = 0;
        int dag = 0;
        int time = 0;
        while (usage < threshold && dag < powerusage.length) {
            usage += powerusage[dag][time];
            time += 1;
            if(time==24){
                dag+=1;
                time=0;
            }
        }
        if(usage >= threshold){
            exceeded=true;
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        double price = 0;
        for(double[] dag:usage) {
            for (double strom : dag) {
                price += strom * 0.5;
            }
        }
        return price;
    }
}
