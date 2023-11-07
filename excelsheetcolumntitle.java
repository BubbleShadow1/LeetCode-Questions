public class excelsheetcolumntitle {
    public static String converttotitle(int columnNumber)
    {
String str="";
while(columnNumber>0)
{
    columnNumber--;
    str=(char)('A'+columnNumber%26)+str;
    columnNumber=columnNumber/26;

}
return str;
    }
    public static void main(String args[])
    {
int num=10;
String st=converttotitle(num);
System.out.println(st);

    }
    
}
