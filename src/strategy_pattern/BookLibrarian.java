package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookLibrarian {

    public List<BookInformation> bookInformationList;

    private SortStrategy sortBook;

    public BookLibrarian() {
    }

    public void setSortMethod(SortStrategy sortStrategy){
        this.sortBook = sortStrategy;
    }

    public void printList(){
        List<BookInformation> sortedList;
        if(sortBook == null)
        {
            sortedList = bookInformationList;
        }
        else{
            sortedList = sortBook.SortBook(bookInformationList);
        }

        for (BookInformation bookInformation: sortedList){
            System.out.println("Title: " + bookInformation.getTitle() + " " + "Author: " + bookInformation.getAuthor() + " " + "Year Published: " + bookInformation.getYearPublished() + " " + "Summary: " + bookInformation.getSummary());
        }
    }

}