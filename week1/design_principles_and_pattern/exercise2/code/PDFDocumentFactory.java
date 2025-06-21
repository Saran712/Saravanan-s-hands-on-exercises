package week1.design_principles_and_pattern.exercise2.code;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}