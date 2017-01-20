package IOExamples;

import java.io.*;

public class converter1 {
	
	String read = null;
	String write = null;
	
	public void file_converter() throws IOException{
		BufferedReader input = new BufferedReader(new FileReader("names.dat"));
		PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("names.csv",true)));
		
		while((read = input.readLine()) != null){
			write = read.replace("\t", ",");
			output.println(write);
			System.out.println(write);
			
		}
		input.close();
		output.close();
	}
	public static void main(String[] args) throws IOException{
		converter1 cv = new converter1();
		
		cv.file_converter();
	}

}
