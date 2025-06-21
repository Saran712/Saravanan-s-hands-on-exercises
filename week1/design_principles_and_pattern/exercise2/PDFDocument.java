package week1.design_principles_and_pattern.exercise2;

public class PDFDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}