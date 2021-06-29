/*
 * Book: Starting Out with Java, 7th Edition by Tony Gaddis
 * Program Author: Kyle Martin | https://github.com/thesnowmanndev
 * This program was created to calculate how many acres are in a tract of land.
 * */
public class LandCalculation {
    public static void main(String[] args) {
        int acreOfLand = 43560, tractOfLand = 389767, numberOfAcresInTract = tractOfLand / acreOfLand;

        System.out.println("There are " + numberOfAcresInTract + " acres in a tract of land.");
    }
}
