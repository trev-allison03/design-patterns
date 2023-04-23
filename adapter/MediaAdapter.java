package adapter;
/**
 * @author Trevor Allison
 * Media adapter class for adapter project, interface to connect little media and media
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class MediaAdapter implements Media{
    private LittleMedia littleMedia;

    /**
     * Constructor for media adapter
     * @param littleMedia
     */
    public MediaAdapter(LittleMedia littleMedia){
        this.littleMedia = littleMedia;
    }
    /**
     * get title method
     * @return Title of media
     */
    public String getTitle(){
        return this.littleMedia.getTitle();
    }
    /**
     * get author method, splits up string username into first and last name to create author object
     * @return author
     */
    public Author getAuthor(){
        String name = this.littleMedia.getAuthor();
        String[] strings = name.split(" ");
        String firstName = strings[0];
        String lastName = strings[1];
        Author author = new Author(firstName, lastName);
        return author;
    }
    /**
     * get description method
     * @return description of media
     */
    public String getDescription(){
        return this.littleMedia.getDescription();
    }
    /**
     * add review method
     * @param firstName
     * @param lastName
     * @param date
     * @param rating
     * @param comment
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment){
        getReviews().add(new Review(firstName, lastName, date, rating, comment));
    }
    /**
     * get reviews method 
     * @return Arraylist of reviews
     */
    public ArrayList<Review> getReviews(){
        ArrayList<Review> reviews = new ArrayList<Review>();
        for(String review : this.littleMedia.getReviews()){
            String[] strings = review.split(". by ");
            String[] firstHalf = strings[0].split(" stars - ");
            String ratingString = firstHalf[0];
            double rating = Double.parseDouble(ratingString);
            String comment = firstHalf[1];
            String[] secondHalf = strings[1].split(" - ");
            String[] names = secondHalf[0].split(" ");
            String firstName = names[0];
            String lastName = strings[1];
            String[] dateString = secondHalf[1].split("/");
            reviews.add(new Review(firstName, lastName, parseDate(dateString[2]+"-"+dateString[0]+"-"+dateString[1]), rating, comment));
        }
        return reviews;
    }
    /**
     * private helper method to parse date
     * @param dateString
     * @return date
     */
    private Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
