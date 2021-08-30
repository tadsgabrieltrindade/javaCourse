import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		List<aluno> lista2 = new ArrayList<aluno>();
		
		lista.add("Nilce");
		lista.add("João");
		lista.add("Gabriel");
		lista.add("Thainá");
		lista.add("Aline");
		
		Collections.sort(lista);
		for(String i : lista) {
			System.out.println(i);
		}
		
		System.out.println();
		
		aluno a = new aluno("Pedro", 432);
		aluno b = new aluno("Carlos", 200);
		aluno c = new aluno("Mikael", 120);
		aluno d = new aluno("João", 899);
		
		lista2.add(a);
		lista2.add(b);
		lista2.add(c);
		lista2.add(d);

		Collections.sort(lista2);
		for(aluno ia : lista2) {
			System.out.println(ia);
		}
	}

}
