public class TextDocument implements Document{
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    public String getType() {
        return "Text";
    }

    public Document clone() {
        return new TextDocument(this.filePath, this.encoding, this.wordCount);
    }

    public String toString() {
        return "Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount;
    }
}
