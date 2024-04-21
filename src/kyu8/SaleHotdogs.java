package kyu8;


/*
Usage of ternary operation in java

Task:

Complete function saleHotdogs/SaleHotDogs/sale_hotdogs,
function accept 1 parameters:n, n is the number of customers to buy hotdogs,
different numbers have different prices (refer to the following table),
return a number that the customer need to pay how much money.

number              price (cents)
n < 5               100
n >= 5 and n < 10   95
n >= 10             90

Categories : Fundamentals
 */
public class SaleHotdogs {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionSaleHotDogs(11));
    }

    static int YevgeniySolutionSaleHotDogs(int n) {
        if (n < 5) return 100;
        if (n >= 10) return 90;
        return 95;
    }

}