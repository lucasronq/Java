package compose;

public class Main {
	
	public static void main(String[] args) {
		
		Botao botao1 = new Botao();
		ComboBox combo1 = new ComboBox();
		CheckBox checkb1 = new CheckBox();
		
		LinearContainer linear = new LinearContainer();
		
		linear.add(checkb1);
		linear.add(botao1);
		linear.add(combo1);
		linear.desenhar();
	}
}
