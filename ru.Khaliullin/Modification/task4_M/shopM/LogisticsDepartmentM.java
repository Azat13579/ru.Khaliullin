package Modification.task4_M.shopM;

import java.util.Arrays;

public class LogisticsDepartmentM extends Department {
    private LogistM [] logist;

    public LogisticsDepartmentM(String title, LogistM[] logist) {
        super(title);
        this.logist = logist;
    }

      public LogistM[] getLogist() {
        return logist;
    }

    public void setLogist(LogistM[] logast) {
        this.logist = logist;
    }

    @Override
    public String toString() {
        return super.toString() +"LogisticsDepartmentM{" +
                "logists= \n" + Arrays.toString(logist) +
                "} \n" ;
    }
}
