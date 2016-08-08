package Functions;

public class executable 
{
	
	int ch=2;//for text & command differentiation
    String uresponse[]=new String[100];
    String mresponse[]=new String[100];
    public executable()
    {
        uresponse[0]="hi";  mresponse[0]="hi";
        uresponse[1]="hii";     mresponse[1]="hey";
        uresponse[2]="hi..";     mresponse[2]="hello";
        uresponse[3]="hi...";     mresponse[3]="hi..";
        uresponse[4]="hello";     mresponse[4]="hello !";
        uresponse[5]="hey";     mresponse[5]="hi !";
        uresponse[6]="hey..";     mresponse[6]="hi !";
        uresponse[7]="helo";     mresponse[7]="hi !";
        uresponse[8]="hy..";     mresponse[8]="hey hi !";
        uresponse[9]="";     mresponse[9]="";
    }
   public void outputprocessor(String result)
    {
         for(int i=0;i<1;i++)
         {
             
             for(int j=0;j<11;j++)
             {
                if(result.equalsIgnoreCase(uresponse[j]))
                { 
                    System.out.println("Mark II:"+mresponse[j]);
                    break;
                }
             }
             ch=1;
             //i've tried to use both the versions of mark in  this code
             
            if(result.equalsIgnoreCase("D drive") || result.equalsIgnoreCase("open 2nd Drive") || result.equalsIgnoreCase("Open D Drive"))
                {   System.out.println("Mark-II :Accessing D Drive Files...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c explorer D:");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                }	
                if(result.equalsIgnoreCase("Downloads") || result.equalsIgnoreCase("my downloads") || result.equalsIgnoreCase("open downloaded files"))
                {   System.out.println("Mark-II :Accessing Downladed files...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c explorer Downloads");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                }	
               if(result.equalsIgnoreCase("this pc") || result.equalsIgnoreCase("explorer") || result.equalsIgnoreCase("open Explorer"))
                {   System.out.println("Mark-II :Loading Windows Explorer...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c explorer.exe");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                }	
               if(result.equalsIgnoreCase("diskpart") || result.equalsIgnoreCase("Disks") || result.equalsIgnoreCase("open Disk Manager"))
                {   System.out.println("Mark-II :Loading Windows Disk Manager...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c diskmgmt.msc");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                }
                if(result.equalsIgnoreCase("Security") || result.equalsIgnoreCase("Windows Security") || result.equalsIgnoreCase("open Security center"))
                {   System.out.println("Mark-II :Loading Windows Security Center...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c wscui.cpl");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                } 
               if(result.equalsIgnoreCase("cmd") || result.equalsIgnoreCase("open cmd") || result.equalsIgnoreCase("open command Prompt"))
                {   System.out.println("Mark-II :Loading Command Prompt ...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c start cmd D: javac");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                } 
               if(result.equalsIgnoreCase("notepad") || result.equalsIgnoreCase("open notepad") 
               || result.equalsIgnoreCase("note pad") || result.equalsIgnoreCase("note"))
                {   System.out.println("Mark-II :Loading Notepad...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c Start notepad");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                } 
            if(result.equalsIgnoreCase("chrome") || result.equalsIgnoreCase("google chrome") || result.equalsIgnoreCase("open chrome"))
                {   System.out.println("Mark-II :Loading Google Chrome...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c Start chrome.exe");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                } 
            else if(result.equalsIgnoreCase("open calc") || result.equalsIgnoreCase("calc")|| result.equalsIgnoreCase("add") 
                    || result.equalsIgnoreCase("sub") || result.equalsIgnoreCase("math")|| result.equalsIgnoreCase("mult")
                    || result.equalsIgnoreCase("div"))
                {   System.out.println("Mark-II :Loading Calulator");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c Start calc");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                 }
            else if(result.equalsIgnoreCase("play music") || result.equalsIgnoreCase("music") || result.equalsIgnoreCase("media player") || result.equalsIgnoreCase("play songs"))
                {   System.out.println("Mark-II :Loading media Player..");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c start Weather.exe");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                 }
            if(result.equalsIgnoreCase("open fb") || result.equalsIgnoreCase("fb") || result.equalsIgnoreCase("my fb") || result.equalsIgnoreCase("facebook"))
                {   System.out.println("Mark-II :Loading Facebook...");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c start chrome www.facebook.com");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                }
            if(result.equalsIgnoreCase("open gmail") || result.equalsIgnoreCase("mail") || result.equalsIgnoreCase("google mail") || result.equalsIgnoreCase("gmail"))
                {   System.out.println("Mark II :Loading gmail....");
                    try
                    {Process pr=Runtime.getRuntime().exec("cmd /c start chrome www.gmail.com");}
                    catch(Exception e){System.out.println("Unable to Execute command");}
                    break;
                } 
            else
            { 
            	String re2=result.replaceAll("\\s+","+");
            	try
                {Process pr=Runtime.getRuntime().exec("cmd /c start chrome www.google.co.in/#q="+re2);}
                catch(Exception e){System.out.println("Unable to Execute command");}
                break;

            }
              
            }
            
      }
} 
