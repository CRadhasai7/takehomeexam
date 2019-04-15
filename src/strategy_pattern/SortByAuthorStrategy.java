package strategy_pattern;

import java.util.Comparator;
import java.util.*;

public class SortByAuthorStrategy implements SortStrategy {

    @Override
    public List<BookInformation> SortBook(List<BookInformation> bookInformationList){
        List<BookInformation> bookInformationListSorted = bookInformationList;
        Collections.sort(bookInformationList, new Comparator<BookInformation>() {
            @Override
            public int compare(BookInformation book1, BookInformation book2) {
                return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
            }
        });
        return bookInformationListSorted;
    }
}