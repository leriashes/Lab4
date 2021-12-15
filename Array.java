public class Array<T extends Book>
{
    public T[] data;
	public int size;

    public Array(T[]m)
    {
        data = m;
        size = m.length;
    }

    public void Read()
    {
        for (int i = 0; i < size; i++)
        {
            data[i].Read();
            System.out.print("\n\n");
        }
    }

    public boolean AllInLib()
    {
        boolean result = false;
        int k = 0;

        for (int i = 0; i < size; i++)
        {
            if (data[i].InLib())
            {
                k += 1;
            }
        }

        if (k == size)
        {
            result = true;
        }

        return result;
    }
}
