import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean (name = "ncaracteres")
@ViewScoped

public class NumCaracteres {
	
	private String caracter;
	private int num;

	
	public String getCaracter() {
		return caracter;
	}
	public void setCaracter(String caracter) {
		this.caracter = caracter;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	
	
	public int tamanio() {
		

		setNum(getCaracter().length());
		num= caracter.length();
		System.out.println(num);
		
		return num;
	
	}
	
	

}
