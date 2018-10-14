package org.dalol.libraryone;

import org.dalol.librarycommon.BaseCalculator;
import org.dalol.librarycommon.MsgLogger;

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 14/10/2018 at 18:54.
 */
public class AdditionCalculator extends BaseCalculator {

    @Override
    public String getName() {
        return "[ identity -> Addition ]";
    }

    @Override
    public Double getAnswer(double firstValue, double secondValue) {
        double sum = firstValue + secondValue;
        MsgLogger.dLog(getName(), "Adding " + firstValue + " + " + secondValue + " = " + sum);
        return sum;
    }
}
