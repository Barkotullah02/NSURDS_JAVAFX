package structure;

public abstract class Controller {
    private String fileName;
    public Controller(){}
    public Controller(String fileName){
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public abstract String className();


    @Override
    public String toString() {
        return "Currently running: " + this.fileName;
    }
}
