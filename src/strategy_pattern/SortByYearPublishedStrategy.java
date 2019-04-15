package strategy_pattern;

import java.util.Comparator;
import java.util.List;
import java.util.*;

public class SortByYearPublishedStrategy implements SortStrategy {

    @Override
    public List<BookInformation> SortBook(List<BookInformation> bookInformationList){
        List<BookInformation> bookInformationListSorted = bookInformationList;
        Collections.sort(bookInformationListSorted, new Comparator<BookInformation>() {
            @Override
            public int compare(BookInformation book1, BookInformation book2) {
                return book1.getYearPublished() - book2.getYearPublished();
            }
        });
        return bookInformationListSorted;
    }
}
