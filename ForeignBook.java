class ForeignBook extends Book
{
    private String language;

    public ForeignBook()
    {
        language = "Немецкий";
    }

    public ForeignBook(String language)
    {
        this.language = language;
    }

    //Конструктор с параметром
    public ForeignBook(String title, Author author, int pages_number, String genre, Publishing publishing, int publication_year, String language) : Book(title, author, pages_number, genre, publishing, publication_year)
    {
        this->language = language;
    }

    //Конструктор с параметром
    public ForeignBook(String title, Author author, int pages_number, String genre, Reader reader, Publishing publishing, int publication_year, String language) : Book(title, author, pages_number, genre, reader, publishing, publication_year)
    {
        this->language = language;
    }
}