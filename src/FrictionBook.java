//Create two concrete classes:
//FictionBook, which extends Book.
//        FashionMagazine, which extends Magazine.
//        Each class should define specific resource-related fields and implement any abstract methods.
class FrictionBook extends Book {
    public FictionBook (String title, String author, double rentalFee){
        super(title,author,rentalFee);
    }
}
class FashionMagazine extends Magazine{
    public FashionMagazine(String title, String author, double rentalFee){
        super(title, author, rentalFee);
    }
}