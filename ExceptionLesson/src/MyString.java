public class MyString {
    String newS;

    //классы exception

        class InvalidStringFormat extends Exception {
            public void getMessage1(String error) {
                System.out.println(error);
            }
        }

        class OtherLength extends Exception {
            public void getMessage(String error) {
                System.out.println(error);
            }
        }

        class NonTwoDigitNumbers extends Exception {
            public void getMessage2(String error) {
                System.out.println(error);
            }
        }


    MyString(String newS) throws Exception {
        this.newS = newS;
        //Проверяем длину строки
        try {
            this.methodlength(newS);
            System.out.println("Length OK");
        }catch (OtherLength o){
            o.getMessage("Error for OtherLength");
        }

        //проверяем число - двузначное или нет
        //ловим ошибку NumberFormatException
        try {
          this.methodZeroDigit(newS);
        }
        catch (NumberFormatException m){
            InvalidStringFormat i = new InvalidStringFormat();
            i.initCause(m);
            i.getMessage1("Error for InvalidStringFormat");
        }
        catch (NonTwoDigitNumbers non){
            non.getMessage2("Error for NonTwoDigitNumbers");
        }

        //считаем

        try {
            this.methodArithmetical(newS);
        }
        catch (NumberFormatException m){
            InvalidStringFormat i = new InvalidStringFormat();
            i.initCause(m);
            i.getMessage1("Error for InvalidStringFormat");
        }
    }


    void methodlength(String newS) throws OtherLength {
           if ((newS.length() > 5)||(newS.length() < 5)) {
               throw new OtherLength();
           }
    }

    void methodZeroDigit(String newS) throws NonTwoDigitNumbers{
        int s1 = Integer.parseInt(newS.substring(0,1));
        int s2 = Integer.parseInt(newS.substring(3,4));
        if ((s1==0)|(s2==0)){
            throw new NonTwoDigitNumbers();
        }
    }

    void methodArithmetical(String newS)throws InvalidStringFormat{
        char sign = newS.charAt(2);
        int int1 = Integer.parseInt(newS.substring(0, 2));
        int int2 = Integer.parseInt(newS.substring(3));
        //если числа двузначные, то выполняем над ними действия
        if ((sign != '+') & (sign != '-') & (sign != '*') & (sign != '/')) {
            System.out.println("error in sign");
        } else {
            if (sign == '+') {
                System.out.println(newS+ " = " +(int1 + int2));
            }
            if (sign == '-') {
                System.out.println(newS+ " = " +(int1 - int2));
            }
            if (sign == '*') {
                System.out.println(newS+ " = " +(int1 * int2));
            }
            if (sign == '/') {
                System.out.println(newS+ " = " +(int1 / int2));
            }
        }
    }

        public static void main (String[]args) throws Exception{
            MyString newS = new MyString("16*07");

        }
    }

