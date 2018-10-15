package Lesson_2_2konstruk;

public class WithDraw {
    int calcWithDraw(){
       int wd = 15000;
        int error = 0;
        int result = 0;

        Amount amount = new Amount();

        TestMain testMain = new TestMain();
        testMain.withDraw = wd;

        Deposite deposite = new Deposite();
        int bc = deposite.calcDeposite();

        if(bc<wd){
            result = bc - wd;
            return result;
        }
        return error;
    }
}

