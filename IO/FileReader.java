package IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("demo.txt");
		
		File outFile = new File("output.txt");
		outFile.createNewFile();// if file already exists will do nothing
		FileOutputStream out =new FileOutputStream(outFile,false);
		String OutMsg = "Output Writing specific "; 
		
		byte [] OutMsgBytes = OutMsg.getBytes();
		out.write(OutMsgBytes);
		try {
			
			int i = in.read();
			
			while (i != -1)
			{
				out.write(i);
				System.out.print((char)i);
				
				i = in.read();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
