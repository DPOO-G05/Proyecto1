package procesamientoInventario;

import java.util.ArrayList;

public class LectorGondola {
	
	private LectorArchivo lector;

	public LectorArchivo getLector() {
		return lector;
	}

	public void setLector(LectorArchivo lector) {
		this.lector = lector;
	}
	
	public ArrayList<String[]> getGondolas()
	{
		ArrayList<String[]> gondolas = new ArrayList<>();

		ArrayList<ArrayList<String>> data = lector.getDatos();
		
		for(ArrayList<String> fila :data)
		{
			String celda = fila.get(5);
		
			if (celda.equals(""))
			{
				continue;
			}
			else
			{
				String categoria = fila.get(4);
				String[] relacion = {categoria,celda};
				gondolas.add(relacion);
			}
			
		}
		
		return gondolas;
		
	}
}
