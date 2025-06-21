package week1.design_principles_and_pattern.exercise2.code;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}