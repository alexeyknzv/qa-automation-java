package com.tcs.edu.decorator;

/**
 * Class defines a string depending on a severity level
 * @author Alexey Knyazev
 */

public class SeverityMap {
    /**
     * Provides string for given severity level
     * @param severityLevel severity level type enum
     * @return the string for severity level
     */
    public static String mapToString(Severity severityLevel){
        String severityString = null;
        switch (severityLevel) {
            case MINOR: severityString = "()"; break;
            case REGULAR: severityString = "(!)"; break;
            case MAJOR: severityString = "(!!!)"; break;
        }
        return severityString;
    }}
