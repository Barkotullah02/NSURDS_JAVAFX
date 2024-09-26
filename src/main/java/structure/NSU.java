package structure;

public interface NSU {
    public boolean hasAdmitted(String username);
    public boolean isInProbation(double cgpa);
    public boolean payment(int due);
    public void section(String username);
    public void courseDrop(String username);
    public void advising(String username);
    public void isCurrentStudent(String username);
    public String checkDepartment(String username);
}
