package Exceptions;

public class CourseLimitException extends Exception{
    private String error;
    public CourseLimitException(String error){
        super(error);
    }

    @Override
    public String toString() {
        return "Course limit has been reached";
    }
}
