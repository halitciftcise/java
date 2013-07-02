import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;


public class ConvertCsvToHtml {

	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try{
		//String fname=("notlar.csv");
		String line = "";
		
		int x=5;
		int y=7;

		String[][] htmlFile = new String [x][y];
		
		File file =new File("notlar.htm");
		
		file.createNewFile();
		
		FileWriter filewrt= new FileWriter(file);
		filewrt.write("<html>\n<body>\n<table border = 1>\n");
		FileReader fileread=new FileReader("notlar.csv");
		LineNumberReader lnread= new LineNumberReader(fileread);
		
		int k=0;
		int l=0;
		while ((line = lnread.readLine()) != null){
			
			for(String retval: line.split(";")){
				htmlFile[l][k]=retval;
				k++;
			}
			l++;
		}
			for(int t=0;t<l;t++){
				filewrt.write("<tr>\n");
				for(int i=0;i<k;i++)
					filewrt.write("<td>"+htmlFile[t][i]+"</td>");
				filewrt.write("</tr>");
			}
		
		filewrt.write("</table>\n</body>\n</html>\n");
		System.out.println("Convertion Successfully ..!");
		filewrt.flush();
		filewrt.close();
		fileread.close();
		}catch(IOException e){
		}
		}
		}
	


