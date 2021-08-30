import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> linhas = new ArrayList<String>();
		
		String path = "C:\\Users\\icand\\Documents\\Eclipse\\javaCourse\\Secao 17"
				+ "\\Aula 188 - Exercício proposto\\Arquivo_manipular\\input.csv";
		
		String pathOut = "C:\\Users\\icand\\Documents\\Eclipse\\javaCourse\\Secao 17"
				+ "\\Aula 188 - Exercício proposto\\Arquivo_manipular\\out\\summary.csv";
		
		File file = new File(pathOut);
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)), BufferedWriter bw = 
				new BufferedWriter(new FileWriter(pathOut))){
			
			String line = br.readLine();
			
			while(line != null) {
				linhas.add(line);
				line = br.readLine();
			}
			
			String [] result;
			String [] result2;
			
			for (int i = 0; i<linhas.size(); i++) {
				result = linhas.get(i).split(",");
			}
			for(String str : linhas) {
				result  = str.split(",");
				result2[]
			}
			
			for(String str : result) {
				
			}
				
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
