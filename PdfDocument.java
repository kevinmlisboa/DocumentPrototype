public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument (String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }
    public void open(){
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }
    public String getType(){
        return "PDF";
    }
    public Document clone(){
        return new PdfDocument(this.fileName, this.author, this.pageCount);
    }
    public String toString(){
        return "Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }
}
