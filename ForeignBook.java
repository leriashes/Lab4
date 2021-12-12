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
}