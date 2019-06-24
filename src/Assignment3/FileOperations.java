package Assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	//Write to file using filewriter
	public void fileOperationUsingFileWriter() throws IOException  {
		File file= new File("C:\\Users\\konda\\OneDrive\\Documents\\TestFile2.txt");
		FileWriter writer= new FileWriter(file);
		writer.write("This is sample data");
		writer.close();
	}
	
	//write to file using buffered writer
	public void fileOperationUsingBufferedWriter() throws IOException {
		FileWriter w= new FileWriter("C:\\Users\\konda\\OneDrive\\Documents\\TestFile3.txt");
		BufferedWriter bw=new BufferedWriter(w);
		bw.write("This is buffered writer text");
		bw.newLine();
		bw.write("This is buffered writers new text");
		bw.newLine();
		bw.write("This is buffered writers newer text");
		bw.close();
		
	}
	//write to file using buffered writer with Append mode 
	public void fileOperationUsingBufferedWriterWithAppendMode() throws IOException {
		FileWriter w= new FileWriter("C:\\Users\\konda\\OneDrive\\Documents\\TestFile3.txt",true);
		BufferedWriter bw=new BufferedWriter(w);
		bw.write("This is buffered writer append text");
		bw.newLine();
		bw.write("This is buffered writers new append text");
		bw.newLine();
		bw.write("This is buffered writers newer append text");
		bw.close();
		
	}
	
	
	//Read file using file reader
	
	public void readFileUsingFileReader() throws IOException {
		FileReader fr=new FileReader("C:\\Users\\konda\\OneDrive\\Documents\\TestFile3.txt");
		while (fr.read()!=-1) {
			System.out.println((char) fr.read());
		}
	}
	
	// Read file using Buffered reader
	public void readFileUsingBufferedReader() throws IOException {
		FileReader fr= new FileReader("C:\\Users\\konda\\OneDrive\\Documents\\TestFile3.txt");
		BufferedReader br=new BufferedReader(fr);
		String data=br.readLine();
		while(data!=null) {
			System.out.println(data);
			data=br.readLine();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOperations fo=new FileOperations();
		fo.fileOperationUsingBufferedWriter();
		//fo.fileOperationUsingFileWriter();
		//fo.fileOperationUsingBufferedWriterWithAppendMode();
		//fo.readFileUsingBufferedReader();
		//fo.readFileUsingFileReader();
	}

}
