package structure;

public class StudentPortal implements NSU{
    @Override
    public boolean hasAdmitted(String username) {
        if (username.length() == 10){
            return true;
        }
        else return false;
    }

    @Override
    public boolean isInProbation(double cgpa) {
        if (cgpa < 2.00){
            return true;
        }
        else return false;
    }

    @Override
    public boolean payment(int due) {
        if (due == 0){

        }
        return false;
    }

    @Override
    public void section(String username) {}

    @Override
    public void courseDrop(String username) {}

    @Override
    public void advising(String username) {}

    @Override
    public void isCurrentStudent(String username) {}

    @Override
    public String checkDepartment(String username) {
        if (username.indexOf("2") == (username.length()-1) && username.indexOf("4") == (username.length()-2) && username.indexOf("0") == (username.length()-3)){
            return "ECE";
        }
        return " ";
    }
}
