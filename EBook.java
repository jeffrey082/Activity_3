
public class EBook extends Book {

    private String fileFormat;

    public EBook(String title, String author, String isbn,
                 double price, String fileFormat) {

        super(title, author, isbn, price);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + fileFormat);
    }
}
