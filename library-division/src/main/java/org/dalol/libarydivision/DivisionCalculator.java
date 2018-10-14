package org.dalol.libarydivision;


import org.dalol.librarycommon.BaseCalculator;
import org.dalol.librarycommon.MsgLogger;

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 14/10/2018 at 18:54.
 */
public class DivisionCalculator extends BaseCalculator {

    @Override
    public String getName() {
        return "[ identity -> Division ]";
    }

    @Override
    public Double getAnswer(double firstValue, double secondValue) {
        double division = firstValue / secondValue;
        MsgLogger.dLog(getName(), "Dividing " + firstValue + " / " + secondValue + " = " + division);
        return division;
    }
}
