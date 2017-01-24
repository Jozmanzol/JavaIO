package interfaces_io;
import java.io.*;


public class reader implements File_Reader, File_Writer{
	
	String read = null;
	String csv = null;
	
	public reader() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void readLine() {
		
		
		try {
		
			BufferedReader input = new BufferedReader(new FileReader("names.dat"));
			//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("names.csv")));
			while((read = input.readLine()) != null){
				csv = read.replace(" " , ",");
				//out.println(csv);
				writte_file();
				System.out.println(csv);
			}
			input.close();
			//out.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		
	}

	@Override
	public void writte_file() {
		
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("names.csv", true)));
			out.println(csv);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	public static void main(String[] args){
		
		reader r2 = new reader();
		r2.readLine();
	}

}
