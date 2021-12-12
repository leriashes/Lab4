class ForeignBook extends Book
{
    private String language;

    public ForeignBook()
    {
        language = "��������";
    }

    public ForeignBook(String language)
    {
        this.language = language;
    }

    //����������� � ����������
    public ForeignBook(String title, Author author, int pages_number, String genre, Publishing publishing, int publication_year, String language) : Book(title, author, pages_number, genre, publishing, publication_year)
    {
        this->language = language;
    }

    //����������� � ����������
    public ForeignBook(String title, Author author, int pages_number, String genre, Reader reader, Publishing publishing, int publication_year, String language) : Book(title, author, pages_number, genre, reader, publishing, publication_year)
    {
        this->language = language;
    }
}