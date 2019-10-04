import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name="controLAS")
@ApplicationScoped

public class ControlLibroAS {
	
	
	private ModeloLibro modeloLibro;
	private ArrayList<ModeloLibro> libro;
	
	
	@PostConstruct
	public void init() {
		
		modeloLibro = new ModeloLibro();
		libro = new ArrayList<ModeloLibro>();
	}
	
	public String guardarLibro() {


		libro.add(modeloLibro);
		modeloLibro = new ModeloLibro();
		return null;

	}
	
	public String listarLibros() {
		for (ModeloLibro modeloLibro : libro) {
			System.out.println(">> " + modeloLibro.toString());
		}
		System.out.println(libro.size());
		return null;
	}

	public ModeloLibro getModeloLibro() {
		return modeloLibro;
	}

	public void setModeloLibro(ModeloLibro modeloLibro) {
		this.modeloLibro = modeloLibro;
	}

	public ArrayList<ModeloLibro> getLibro() {
		return libro;
	}

	public void setLibro(ArrayList<ModeloLibro> libro) {
		this.libro = libro;
	}
	
	
	

	

}
