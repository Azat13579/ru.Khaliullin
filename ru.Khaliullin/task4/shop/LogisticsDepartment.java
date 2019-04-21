package task4.shop;

import task4.shop.Logist;

import java.util.Arrays;

public class LogisticsDepartment {
    private Logist[] logist = new Logist[15];

    public Logist[] getLogist() {
        return logist;
    }

    public void setLogist(Logist[] logist) {
        this.logist = logist;
    }

    @Override
    public String toString() {
        return "LogisticsDepartment{" +
                "logist=" + Arrays.toString(logist) +
                '}';
    }
}
