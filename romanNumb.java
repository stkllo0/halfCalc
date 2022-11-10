package ru.javaschool.test.calculator;

public enum romanNumb {
    I(1, "I"), II(2, "II"), III(3, "III"), IV(4, "IV"), V(5, "V"), VI(6, "VI"), VII(7, "VII"), VIII(8, "VIII"), IX(9, "IX"), X(10, "X"), XI(11, "XI"), XII(12, "XII"), XIII(13, "XIII"), XIV(14, "XIV"), XV(15, "XV"), XVI(16, "XVI"), XVII(17, "XVII"), XVIII(18, "XVIII"), XIX(19, "XIV"), XX(20, "XX");


    private int Arab;
    private String Romanian;
    romanNumb(int Arab, String i) {
        this.Arab = Arab;
    }
    romanNumb(String Romanian){
        this.Romanian = Romanian;
    }

    public int getArab(){
        return Arab;
    }
    public String GetRoman(){
        return Romanian;
    }
}
