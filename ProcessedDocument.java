public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdfDoc = registry.getPdfPrototype();
        pdfDoc.open();
        System.out.println(pdfDoc.toString());
        System.out.println();

        Document textDoc = registry.getTextPrototype();
        textDoc.open();
        System.out.println(textDoc.toString());
        System.out.println();

        Document sheetDoc = registry.getSpreadsheetPrototype();
        sheetDoc.open();
        System.out.println(sheetDoc.toString());
        System.out.println();

        Document summaryPdf = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        summaryPdf.open();
    }

}
