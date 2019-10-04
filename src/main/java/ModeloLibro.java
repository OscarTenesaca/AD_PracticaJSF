
public class ModeloLibro {
	

	private String titulo;
	private String fecha;
	private String editor;
	private String autor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	@Override
	public String toString() {
		return "ModeloLibro [titulo=" + titulo + ", fecha=" + fecha + ", editor=" + editor + ", autor=" + autor + "]";
	}
	
	
	

}
