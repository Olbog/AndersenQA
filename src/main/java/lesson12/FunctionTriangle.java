package lesson12;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FunctionTriangle {

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
