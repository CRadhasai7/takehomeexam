package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BookLibrarian bookLibrarian = new BookLibrarian();

        BookInformation bookInformation;
        List<BookInformation> bookInformationList = new ArrayList<BookInformation>();

        bookInformation = new BookInformation("Harry Potter and the Deathly Hallows", "J. K. Rowling", 1992, "Harry Potter cannot escape his fate.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Hobbit",
        "J. R. R. Tolkien",
        1998,
        "The story of hobbit Bilbo Baggins as he travels across middle earth with a group of dwarfs and a wizard.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("1984",
        "George Orwell",
        1984,
        "Arguably the 20th-century's most famous novel, 1984 is a dystopian study of political tyranny, mind control, paranoia and secret mass surveillance.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Pride and Prejudice",
        "Jane Austen",
        2000,
        "Austen’s most celebrated novel tells the story of Elizabeth Bennet, a bright, lively young woman with four sisters, and a mother determined to marry them to wealthy men.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("To Kill a Mockingbird",
        "Harper Lee",
        2008,
        "To Kill a Mockingbird was my absolute favorite books to read in school.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Da Vinci Code",
        "Dan Brown",
        1980,
        "A murder in the silent after-hours halls of the Louvre museum reveals a sinister plot to uncover a secret that has been protected by a clandestine society since the days of Christ.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Catcher in the Rye",
        "J. D. Salinger",
        1980,
        "The hero-narrator of The Catcher in the Rye is an ancient child of sixteen, a native New Yorker named Holden Caulfield.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Great Gatsby",
        "F. Scott Fitzgerald",
        1840,
        "Set in the 1920s, this is the tragic love story of Jay Gatsby, a dashing, enigmatic millionaire, obsessed with an elusive, spoiled young woman, Daisy Buchanan.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Twilight",
        "Stephenie Meyer",
        1730,
        "I'd never given much thought to how I would die—I'd had reason enough in the last few months—but even if I had, I would not have imagined it like this.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Hunger Games",
        "Suzanne Collins",
        2003,
        "In the ruins of a place once known as North America lies the nation of Panem, a shining Capitol surrounded by twelve outlying districts.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Jane Eyre",
        "Charlotte Bronte",
        1995,
        "Jane Eyre is the story of a love-deprived girl who becomes the governess of a young french girl at a the Rochester estate.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Kite Runner",
        "Khaled Hosseini",
        2015,
        "This novel presents life in Afghanistan before the revolution and the Russian invasion.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Animal Farm",
        "George Orwell",
        2019,
        "Orwell's allegory of the Soviet revolution remains as lucid and compelling as ever.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Brave New World",
        "Aldous Huxley",
        2009,
        "Huxley's bleak future prophesized, in Brave New World was a capitalist civilization, which had been reconstituted through scientific and psychological engineering, a world in which people are genetically designed to be passive and useful to the ruling class.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Lord of the Rings",
        "J. R. R. Tolkien",
        1996,
        "Sauron, the Dark Lord, has gathered to him all the Rings of Power");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("The Fellowship of the Ring",
        "J. R. R. Tolkien",
        1973,
        "In a sleepy village in the Shire, young Frodo Baggins finds himself faced with an immense task, as his elderly cousin Bilbo entrusts the Ring to his care.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Fahrenheit 451",
        "Ray Bradbury",
        1650,
        "The system was simple. Everyone understood it.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Angels & Demons",
        "Dan Brown",
        1985,
        "World-renowned Harvard University symbologist Robert Langdon recieved a summons to the Swiss CERN research facility to investigate the murder of one of their physicist.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("New Moon",
        "Stephenie Meyer",
        1999,
        "I knew we were both in mortal danger. Still, in that instant, I felt well.");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Wuthering Heights",
        "Emily Bronte",
        2010,
        "The passionate love of Catherine Earnshaw and Heathcliff mirrors the powerful moods of the Yorkshire moors");
        bookInformationList.add(bookInformation);
        bookInformation = new BookInformation("Lord of the Flies",
        "William Golding",
        2013,
        "When Lord of the Flies appeared in 1954 it received unprecedented reviews for a first novel.");
        bookInformationList.add(bookInformation);

        bookLibrarian.bookInformationList = bookInformationList;

        System.out.println("----- Sort by Author -----");
        bookLibrarian.setSortMethod(new SortByAuthorStrategy());
        bookLibrarian.printList();

        System.out.println("\n" + "----- Sort by Year Published -----");
        bookLibrarian.setSortMethod(new SortByYearPublishedStrategy());
        bookLibrarian.printList();

        System.out.println("\n" +"----- Sort by Title -----");
        bookLibrarian.setSortMethod(new SortByTitleStrategy());
        bookLibrarian.printList();
    }
}
