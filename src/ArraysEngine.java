public class ArraysEngine {


    // TODO: метод должен вывести все книги массива, проигнорировать пустые места
    // Книги
    // - <название_книги>: <автор> <кол-во страниц> стр
    public void printAllBooks(Book[] books) {
        for (Book book : books) {
            if (book != null) {
                System.out.println("Название книги: " + book.title + " | Автор книги: " + book.author + " | Количество страниц: " + book.pages);
            }
        }
    }


    // TODO: метод должен посчитать фактическое кол-во книг, не учитывать null
    public int getActualSize(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }


    // TODO: метод должен посчитать общее количество страниц всех книг массива
    public int countTotalPages(Book[] books) {
        int pagesCount = 0;
        for (Book book : books) {
            if (book != null) {
                pagesCount += book.pages;
            }
        }
        return pagesCount;
    }


    // TODO: метод должен возвращать объект книги из массива по переданному название
    public Book findBookByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book != null && book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }


    // TODO: метод должен возвращать массив строк, которая состоит только из названия книг
    public String[] getBookTitles(Book[] books) {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }

        String[] titles = new String[count];
        int index = 0;

        for (Book book : books) {
            if (book != null) {
                titles[index++] = book.title;
            }
        }

        return titles;
    }


    // TODO: метод должен находить книгу с самой наибольшей страницей
    public Book findLargestBook(Book[] books) {
        Book largestBook = null;

        for (Book book : books) {
            if (book != null) {
                if (largestBook == null || book.pages > largestBook.pages) {
                    largestBook = book;
                }
            }
        }
        return largestBook;
    }
}
