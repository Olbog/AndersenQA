package lesson12;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FunctionTriangle {

    private static final Logger LOGGER = LogManager.getLogger(FunctionTriangle.class);


    public double rez(){

        int width = 7;

        int length = 8;

        int height = 9;

        int halfMeter = (width + length + height)/2; // half - meter of Triangle (p=(a+b+c)÷2)

        double areaTriangular = Math.sqrt(halfMeter*(halfMeter - width)* (halfMeter - length) * (halfMeter - height));
        // the area of the triangle ()

        return areaTriangular;
    }
}
