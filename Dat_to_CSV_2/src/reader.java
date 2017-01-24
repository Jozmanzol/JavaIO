import java.io.*;


public class reader implements File_Reader{
	
	public reader() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void readLine() {
		
		
		try {
			String read = null;
			String csv = null;
			BufferedReader input = new BufferedReader(new FileReader("names.dat"));
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("names.csv")));
			while((read = input.readLine()) != null){
				csv = read.replace(" " , ",");
				out.println(csv);
				System.out.println(csv);
			}
			input.close();
			out.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}

		
	}

	@Override
	public void writte_file() {
		
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("names.csv")));
		//readLine();
		//System.out.println(csv);
		//out.println(csv);
		//out.close();
		
	}

	public static void main(String[] args){
		
		reader r2 = new reader();
		r2.readLine();
		//r2.writte_file();
		System.out.println();
	}

}
