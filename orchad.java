import java.util.*;
public class orchad
{
public static void main(String args[]) 
{
    Scanner in = new Scanner(System.in);
    String ashok = in.nextLine();
    String anand = in.nextLine();
    
    char ash[] = ashok.toCharArray();
    char ann[] = anand.toCharArray();
    
    int p_ash=combination(ash,ash.length);
    int p_ann=combination(ann,ann.length);
    
    
    if(p_ash==0 && p_ann==0)
        System.out.print("Invalid input");
    if(p_ash>p_ann)
        System.out.print("Ashok");
    else if(p_ann > p_ash)
        System.out.print("Anand");
    else 
        System.out.print("Draw");
}

static int combination(char arr[],int n)
{
    int count=0;
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
                        count++;
                }
            }
            s=""+arr[i];
        }
    }
    return count;
}
}
