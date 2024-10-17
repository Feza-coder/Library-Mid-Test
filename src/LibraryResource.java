import java.util.List;

//LibraryResource Interface:
//
//Define a LibraryResource interface with the following methods:
//String getTitle()
//String getAuthor()
//double getRentalFee()
//void printResourceDetails()
//void printBorrowedBy()
//void borrowResource(Member member)
//void returnResource(Member member)
public interface LibraryResource {
    String getTitle();
    String getAuthor();
    double getRentalFee();
    void printResourceDetails();
    void printBorrowedBy();
    void borrowResources (Member member);
    void returnResource(Member member);

}
