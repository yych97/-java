import java.io.*;
public class p134
{
public static void main(String args[])
{
	File f1=new File("g:\\test");
	File f2=new File(f1,"hello.txt");
	System.out.println();
	System.out.println(f2);
	System.out.println("cunzai? "+f2.exists());
	System.out.println("filename: "+f2.getName());
	System.out.println("length: "+f2.length());
	System.out.println("path: "+f2.getPath());
	System.out.println("shangjilujing"+f2.getParent());
	System.out.println("isflie? "+f2.isFile());
	System.out.println("isdirectory? "+f2.isDirectory());
	System.out.println("Read? "+f2.canRead());
	System.out.println("Write?"+f2.canWrite());
	System.out.println("last: "+f2.lastModified());
	System.out.println("Ap: "+f2.getAbsolutePath());
	f2.delete();
	System.out.println("cunzai? "+f2.exists());
}
}