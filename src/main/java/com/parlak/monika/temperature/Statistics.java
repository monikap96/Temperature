package com.parlak.monika.temperature;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Statistics {
    public static void main(String[] args) {

        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        int[] values = {4, 5, 2, 7, 3, 4, 4, 7};

        descriptiveStatistics.clear();
        for(int i=0;i<values.length;i++){
            descriptiveStatistics.addValue(values[i]);

        }
        System.out.println(descriptiveStatistics.getStandardDeviation());
    }

}
