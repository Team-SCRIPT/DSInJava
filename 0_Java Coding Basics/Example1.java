import java.io.*;
class Example1
{
        public static void main(String args[]) throws IOException
        {
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               int x,y,z=0;
               x=Integer.parseInt(br.readLine());
               y=Integer.parseInt(br.readLine());
               z=Integer.parseInt(br.readLine());
               
               if(x+y+z>=2)System.out.println("SOUND ALARM");
               else System.out.println("DON'T SOUND ALARM");
        }
}
