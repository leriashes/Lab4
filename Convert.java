public class Convert
{
    public static int StringToInt(String str)
    {
        int num;
        try 
        {
            num = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            num = 0;
        }

        return num;
    }
}