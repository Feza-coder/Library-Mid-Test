import java.util.ArrayList;
import java.util.List;

//Book and Magazine Classes:
//
//Create two abstract classes, Book and Magazine, that implement the LibraryResource interface. These classes should:
//Implement the necessary methods from the LibraryResource interface.
//Store basic resource-related information such as title, author, rental fee, and type (book or magazine).
//Maintain a list of members who have borrowed these resources using an array or ArrayList.
abstract class Book implements LibraryResource {
    protected String title;
    protected String author;
    protected double rentalFee;
    protected String type = "Book";
    protected List <Member> borrowedBy;
    public Book (String title, String author, double rentalFee){
        this.title = title;
        this.author= author;
        this.rentalFee= rentalFee;;
        this.borrowedBy = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public double getRentalFee() {
        return rentalFee;
    }

    @Override
    public void printResourceDetails() {
        System.out.println("The Type of the book is: \n"+type +"The author is \n"+author+"The Title is \n"+title +"The Rental fee is\n "+rentalFee);
    }

    @Override
    public void printBorrowedBy() {
        if (borrowedBy.isEmpty()) {
            System.out.println("The Book was borrowed by: ");
            for (Member member: borrowedBy){
                System.out.println(member.getName() +"Have borrowed: "+title); //come back here when i have the member class
            }
        } else {
            System.out.println("The members did not borrow any book");
        }
    }
    @Override
    public void borrowResources(Member member){
        borrowedBy.add(member);
        System.out.println(member.getName()+ "Borrowed "+type+ "Which is "+title)
    }
    @Override
    public void returnResource(Member member) {
        if (borrowedBy.remove(member)) {
            System.out.println(member.getName() + "Have returned the book of type" + type + " which was written by " + author + "With it's title: " + title);
        }
        else {
            System.out.println(member.getName() + " Have not yet borrowed this: " + title + "!");
        }
    }
}
abstract class Magazine implements LibraryResource{
    protected String title;
    protected String author;
    protected double rentalFee;
    protected String type = "Magazine";
    protected List <Member> borrowedBy;
    public Magazine (String title, String author, double rentalFee){
        this.title = title;
        this.author= author;
        this.rentalFee= rentalFee;;
        this.borrowedBy = new ArrayList<>();
    }
    @Override
    public String getType(){
        return type;
    }
    @Override
    public String getAuthor(){
        return author;
    }

    @Override
    public double getRentalFee() {
        return rentalFee;
    }

    @Override
    public void printResourceDetails() {
        System.out.println("The Type of the magazine is: \n"+type +"The author is \n"+author+"The Title is \n"+title +"The Rental fee is\n "+rentalFee);
    }

    @Override
    public void printBorrowedBy() {
        if (borrowedBy.isEmpty()){
            System.out.println("No members that borrowed this" +type);
        }else{
            System.out.println("Borrowed By: ");
            for (Member member: borrowedBy){
                System.out.println(member.getName()+ "with the Id" +member.getMemberId()+ "Borrowed "+type);
            }
        }
    }
    @Override
    public void borrowResources(Member member){
        borrowedBy.add(member);
        System.out.println(member.getName()+ "Borrowed "+type+ "Which is "+title)
    }
    @Override
    public void returnResource(Member member) {
        if (borrowedBy.remove(member)) {
            System.out.println(member.getName() + "Have returned the book of type" + type + " which was written by " + author + "With it's title: " + title);
        }
        else {
            System.out.println(member.getName() + " Have not yet borrowed this: " + title + "!");
        }
    }

}
