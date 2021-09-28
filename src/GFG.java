class GFG{

    // function to count the
// ordered triplets (H, S, L)  
    static int countTriplets(String color)
    {
        int result = 0, Light_Count = 0;
        int Hue_Count = 0;
        int len = color.length();
        int i;

        // count the L(Lightness)
        for (i = 0; i < len ; i++)
        {
            if (color.charAt(i) == 'L')
                Light_Count++;
        }

        for (i = 0; i < len ; i++)
        {
            if (color.charAt(i) == 'L')
                Light_Count--;
            if (color.charAt(i) == 'H')
                Hue_Count++;
            if (color.charAt(i) == 'S')
                result += Hue_Count * Light_Count;
        }
        return result;
    }

    // Driver Code
    public static void main (String[] args)
    {
        String color = "HHSSLLHSSLL";
        System.out.println(countTriplets(color));
    }

}