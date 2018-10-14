package org.dalol.librarymultiplication;


import org.dalol.librarycommon.BaseCalculator;
import org.dalol.librarycommon.MsgLogger;

/**
 * @author Filippo
 * @version 1.0.0
 * @since Sun, 14/10/2018 at 18:54.
 */
public class MultiplicationCalculator extends BaseCalculator {

    @Override
    public String getName() {
        return "[ identity -> Multiplication ]";
    }

    @Override
    public Double getAnswer(double firstValue, double secondValue) {
        double multiplication = firstValue * secondValue;
        MsgLogger.dLog(getName(), "Multiplying " + firstValue + " * " + secondValue + " = " + multiplication);
        return multiplication;
    }
}
