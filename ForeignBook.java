public class ForeignBook extends Book
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
    public ForeignBook(String title, Author author, int pages_number, String genre, Publishing publishing, int publication_year, String language)    
    {
        super(title, author, pages_number, genre, publishing, publication_year);
        this.language = language;
    }

    //����������� � ����������
    public ForeignBook(String title, Author author, int pages_number, String genre, Reader reader, Publishing publishing, int publication_year, String language)
    {
        super(title, author, pages_number, genre, reader, publishing, publication_year);
        this.language = language;
    }

    public void Init(String title, Author author, int pages_number, String genre, Publishing publishing, int publication_year, String language)
    {
        this.title = title;
        this.author = author;
        this.pages_number = Math.abs(pages_number);
        this.genre = genre;
        this.publishing = publishing;
        this.publ_year = Math.abs(publication_year);
        this.language = language;

        return;
    }

    public void Init(String title, Author author, int pages_number, String genre, Reader reader, Publishing publishing, int publication_year, String language)
    {
        this.Init(title, author, pages_number, genre, reader, publishing, publication_year);
        this.language = language;

        return;
    }

    public String toString()
    {
        String result;
        result = "ID " + id + "\n��������: \"" + title + "\"" + "\n����: " + genre + "\n���������� �������: " + pages_number + "\n��� ����������: " + publ_year + "\n�����: " + author + "\n������������: " + publishing + "\n����: " + language;

        if (reader != null) 
        {
            result += "\n��������: " + reader + "\n���� ������ �����: " + borrow_date + "\n���� ����� �����: ";
		    Date plus = new Date(time, 0, 0);
            result += plus.Add(borrow_date);
        }

        return result;
    }

}