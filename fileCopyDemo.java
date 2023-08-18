import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileCopyDemo{
	public static void main(String args[]){
		String sourceF = "C:\\Users\\user\\Desktop\\ams.txt";
		String destF = "C:\\Users\\user\\Desktop\\hello.txt";
		try{
			FileInputStream fis = new FileInputStream(sourceF);
			FileOutputStream fos = new FileOutputStream(destF);
			
			byte[] buffer = new byte[1024];
			int length;
			while((length=fis.read(buffer))>0){
				fos.write(buffer,0,length);
			}
			fis.close();
			fos.close();
			System.out.println("File copied sucessfully");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}