package org.dalol.librarytwo;


import org.dalol.librarycommon.BaseCalculator;
import org.dalol.librarycommon.MsgLogger;

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 14/10/2018 at 18:54.
 */
public class SubtractionCalculator extends BaseCalculator {

    @Override
    public String getName() {
        return "[ identity -> Subtraction ]";
    }

    @Override
    public Double getAnswer(double firstValue, double secondValue) {
        double subtraction = firstValue - secondValue;
        MsgLogger.dLog(getName(), "Subtracting " + firstValue + " - " + secondValue + " = " + subtraction);
        return subtraction;
    }
}
