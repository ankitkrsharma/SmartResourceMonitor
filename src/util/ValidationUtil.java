package util;

public final class ValidationUtil {

    private ValidationUtil(){}

    public static void validateUsage(double usage){

        if(usage < 0 || usage > 100){
            throw new IllegalArgumentException("Usage must be between 0-100%");
        }
    }
}
