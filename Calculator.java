
    public enum Calculator {
        I("I"), II("II"), III("III"), IV("IV"), V("V"), VI("VI"), VII("VII"), IIX("IIX"), IX("IX"), X("X"), XI("XI"),
        XII("XII"), XIII("XIII"), XIV("XIV"), XV("XV"), XVI("XVI"), XVII("XVII"), XVIII("XVIII"), XIX("XIX"), XX("XX"),
        XXI("XXI"), XXII("XXII"), XXIII("XXIII"), XXIV("XXIV"), XXV("XXV"), XXVI("XXVI"), XXVII("XXVII"), XXIIX("XXIIX"),
        XXIX("XXIX"), XXX("XXX"), XXXI("XXXI"), XXXII("XXXII"), XXXIII("XXXIII"), XXXIV("XXXIV"), XXXV("XXXV"),
        XXXVI("XXXVI"), XXXVII("XXXVII"), XXXIIX("XXXIIX"), XXXIX("XXXIX"), XL("XL"), XLI("XLI"), XLII("XLII"),
        XLIII("XLIII"), XLIV("XLIV"), XLV("XLV"), XLVI("XLVI"), XLVII("XLVII"), XLIIX("XLIIX"), XLIX("XLIX"), L("L"),
        LI("LI"), LII("LII"), LIII("LIII"), LIV("LIV"), LV("LV"), LVI("LVI"), LVII("LVII"), LIIX("LIIX"), LIX("LIX"),
        LX("LX"), LXI("LXI"), LXII("LXII"), LXIII("LXIII"), LXIV("LXIV"), LXV("LXV"), LXVI("LXVI"), LXVII("LXVII"),
        LXIIX("LXIIX"), LXIX("LXIX"), LXX("LXX"), LXXI("LXXI"), LXXII("LXXII"), LXXIII("LXXIII"), LXXIV("LXXIV"),
        LXXV("LXXV"), LXXVI("LXXVI"), LXXVII("LXXVII"), LXXIIX("LXXIIX"), LXXIX("LXXIX"), LXXX("LXXX"), LXXXI("LXXXI"),
        LXXXII("LXXXII"), LXXXIII("LXXXIII"), LXXXIV("LXXXIV"), LXXXV("LXXXV"), LXXXVI("LXXXVI"), LXXXVII("LXXXVII"),
        LXXXIIX("LXXXIIX"), LXXXIX("LXXXIX"), XC("XC"), XCI("XCI"), XCII("XCII"), XCIII("XCIII"), XCIV("XCIV"), XCV("XCV"),
        XCVI("XCVI"), XCVII("XCVII"), XCIIX("XCIIX"), XCIX("XCIX"), C("C"),;

        private String value;

        Calculator(String value) {
            // TODO Auto-generated constructor stub
            this.value = value;
        }

        public String getTitle() {
            return value;
        }

        public int toInt() {

            int count = 0;
            for (int i = 0; i < Calculator.values().length; i++) {
                count++;
                if (value.equals(Calculator.values()[i].getTitle())) {
                    return count;

                }
            }

            return 0;

        }
    }
