import Functions.executable;
import java.io.*;

public class markbeta 
{
	public static void main(String a[])throws IOException
    {   
        executable mark=new executable();
        String result;
        int flag=0;
         System.out.println("---------------Hi, I'm Mark II And Now I can execute system programs too-----------");
        BufferedReader Vr=new  BufferedReader(new InputStreamReader(System.in));
        while(flag==0)
        {
            System.out.print("You:");
            result=Vr.readLine();
            if(result.equalsIgnoreCase("close"))
                {
                    flag=1;
                    break;
                }
                else
                {
                      mark.outputprocessor(result);
                }
        }
    }

}
