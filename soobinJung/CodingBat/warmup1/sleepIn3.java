package coding_test_study.soobinJung.CodingBat.warmup1;

public class sleepIn3 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation == false) {
            if (weekday == false) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
