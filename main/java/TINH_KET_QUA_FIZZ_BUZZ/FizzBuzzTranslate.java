package TINH_KET_QUA_FIZZ_BUZZ;

public class FizzBuzzTranslate {
    public static String  translate(int number){

        int num1 = number/10;
        int num2 = number % 10;
        String readNumber="";
        boolean isFizz = ((num2 == 3) || num1 == 3 || (number % 3 ==0))  ;
        boolean isBuzz = (num1 == 5 || (number % 5 == 0));


        if(isFizz &&  isBuzz)
            return "FizzBuzz";

        else if(isFizz)
            return "Fizz";

        else if(isBuzz)
            return "Buzz";
        else {
            switch (num1){
                case 0:
                    readNumber += "";
                    break;
                case 1:
                    readNumber += "muoi";
                    break;
                case 2:
                    readNumber += "hai";
                    break;
                case 4:
                    readNumber += "bon";
                    break;
                case 6:
                    readNumber += "sau";
                    break;
                case 7:
                    readNumber += "bay";
                    break;
                case 8:
                    readNumber += "tam";
                    break;
                case 9:
                    readNumber += "chin";
                    break;
            }

            switch (num2){
                case 1:
                    readNumber += " mot";
                    break;
                case 2:
                    readNumber += " hai";
                    break;
                case 4:
                    readNumber += " bon";
                    break;
                case 6:
                    readNumber += " sau";
                    break;
                case 7:
                    readNumber += " bay";
                    break;
                case 8:
                    readNumber += " tam";
                    break;
                case 9:
                    readNumber += " chin";
                    break;
            }
            return readNumber;
        }




    }
}
