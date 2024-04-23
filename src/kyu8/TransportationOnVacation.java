package kyu8;


/*
Transportation on vacation

After a hard quarter in the office you decide to get some rest on a vacation.
So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

You will need a rental car in order for you to get around in your vacation.
The manager of the car rental makes you some good offers.

Every day you rent the car costs $40.
If you rent the car for 7 or more days, you get $50 off your total.
Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

Write a code that gives out the total amount for different days(d).

Categories : Fundamentals
 */
public class TransportationOnVacation {

    public static void main(String[] args) {

        System.out.println(YevgeniySolutionCountTotalAmount(1));
        System.out.println(YevgeniySolutionCountTotalAmount(2));
        System.out.println(YevgeniySolutionCountTotalAmount(3));
        System.out.println(YevgeniySolutionCountTotalAmount(7));
    }

    static int YevgeniySolutionCountTotalAmount(int days) {
        var sum = 0;
        for (var i = 1; i <= days; i++) {
            sum += 40;
        }
        if (days >= 7) {
            return sum - 50;
        } else if (days >= 3) {
            return sum - 20;
        }
        return sum;
    }

}
