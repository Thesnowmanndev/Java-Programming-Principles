import java.text.DecimalFormat;

public class EnergyDrinkConsumption {
    /*
    A soft drink company recently surveyed 12,467 of its customers and found that approximately 14 percent of those
    surveyed purchase one or more energy drinks per week. Of those customers who purchase energy drinks, approximately
    64 percent of them prefer citrus-flavored energy drinks. Write a program that displays the following:

    - The approximate number of customers in the survey who purchase one or more energy drinks per week
    - The approximate number of customers in the survey who prefer citrus-flavored energy drinks
     */
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("#,###");
        int amountOfCustomersSurveyed;
        double  purchaseOneOrMore;
        double  preferCitrus;

        amountOfCustomersSurveyed   =   12467;
        purchaseOneOrMore   =   0.14;
        preferCitrus    =   .64;

        int amountThatPurchaseOneOrMore =   (int)   (amountOfCustomersSurveyed * purchaseOneOrMore);
        int amountThatPreferCitrus  =   (int)   (amountOfCustomersSurveyed * preferCitrus);

        System.out.println( "There were " + format.format(amountOfCustomersSurveyed) + " people surveyed.");
        System.out.println( "The approximate number of customers who purchase one or more energy drinks per week is " +
                            format.format(amountThatPurchaseOneOrMore));
        System.out.println( "The approximate number of customers who prefer citrus-flavored energy drinks is " +
                            format.format(amountThatPreferCitrus));
    }
}
