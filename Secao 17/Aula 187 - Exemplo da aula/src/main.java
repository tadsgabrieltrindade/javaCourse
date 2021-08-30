import java.io.File;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho de uma pasta: ");
		String srtPath = sc.nextLine();
		
		System.out.println("Segue a lista de diretórios do caminho informado: ");
		File path = new File(srtPath);
		File[] folders = path.listFiles(File::isDirectory);
		for(File folder : folders)
			System.out.println(folder);
		
		System.out.println("Segue a lista de arquivos do caminho informado: ");
		File[] files = path.listFiles(File::isFile);
		for(File file : files)
			System.out.println(file);
		
		
		//Criar uma subpasta de acordo com o diretório informado
		new File(srtPath + "/Zurick").mkdir();
		sc.close();
	}

}
