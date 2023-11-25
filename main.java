import java.util.*;
public class main
{
public static void main (String args[]) 
{
    Scanner in = new Scanner(System.in);
    String Ashok = in.nextLine();
    String Anand = in.nextLine();

    char as[] = Ashok.toCharArray();
    char an[] = Anand.toCharArray();

    int r_as=combination(as,as.length);
    int p_an=combination(an,an.length);

    if(r_as==0 && p_an==0)
    {
        System.out.print("Invalid input");
    }
    if(r_as>p_an)
   { 
        System.out.print("Ashok");
   }
    else if(p_an > r_as)
   { 
        System.out.print("Anand");
   }
    else 
   { 
        System.out.print("Draw");
   }
}

static int combination(char arr[],int n)
{
    int c=0;
    String s="";
    for(int i=0;i<n;i++)
    {
        s=""+arr[i];
        for(int j=i+1;j<n;j++)
        {
            s+=arr[j];
            if(s.charAt(0)!=arr[j])
            {
                for(int k=j+1;k<n;k++)
                {
                    if(s.charAt(1)!=arr[k])
                        c++;
                }
            }
            s=""+arr[i];
        }
    }
    return c;
}
}
