package TINH_NGAY_TIEP_THEO;

public class NextDayCalculator {
    static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int numberOfDayInTheMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                month= 31;
                break;

            case 2:
                if (isLeapYear(year)) {
                    month= 29;
                }else {
                month= 28;
                }
                 break;

            case 4:
            case 6:
            case 9:
            case 11:
                month= 30;
                break;
        }
        return month;
    }

    public static String DayAfter(int year,int month,int day)
    {

        int yearAfter = year;
        int monthAfter = month;
        int dayAfter = day;

        if(year> 0 && month > 0 && month < 13 && day > 0 && day <= numberOfDayInTheMonth( month,  year)) {

            dayAfter = day + 1;

            if(month !=12 && day == numberOfDayInTheMonth(month,year))
            {
                dayAfter = 1;
                monthAfter = month+1;
            }

            else if(month == 12 && day == numberOfDayInTheMonth( month,  year))
            {
                dayAfter = 1;
                yearAfter = year+1;
                monthAfter = 1;
            }
            else if(month == 2 && day == numberOfDayInTheMonth( month,  year))
            {

                if(isLeapYear(year))
                {
                        dayAfter = 1;
                        monthAfter = 3;
                }
                else
                    {
                        dayAfter = 1;
                        monthAfter = month + 1;
                    }

            }
        }

        return dayAfter + "/" + monthAfter+ "/" + yearAfter;
    }
}