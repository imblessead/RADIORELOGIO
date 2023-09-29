package ecapsulamento;

public class RadioRelogio implements InterRadio , InterRelogio {
  private int hora;
  private int minuto;
  private int horaAlarme;
  private int minutoAlarme;
  private int volume;
  private boolean ligado;
	@Override
	public void ajustarHora(int h) {
		this.hora=h;
		
	}

	@Override
	public void ajustarMinuto(int m) {
		this.minuto=m;
		
	}

	@Override
	public void mostrarHora() {
		System.out.println("São " + this.hora + " : " + this.minuto );
		
	}

	@Override
	public void ligarAlarme(int h, int m) {
		this.horaAlarme=h;
		this.minutoAlarme=m;
		
	}

	@Override
	public void desligarAlarme() {
		System.out.println("Alarme desligado ");
		
	}

	@Override
	public void ligar() {
		if(this.ligado==true)
			System.out.println("O radio ja esta ligado ");
			else
			{
				this.ligado=true;
				this.volume=5;
			}
	}

	@Override
	public void desligar() {
			 if(this.ligado==false)
				 System.out.println("O radio ja esta desligado");
			 else
			 {
				 this.ligado=false;
						 
			 }
		
	}

	@Override
	public void mudarEstacao() {
		if(this.ligado==true)
			System.out.println("Trocando de estação...");
		else
		{
			System.out.println("Nao e possivel . O radio está desligado");
		}
		
	}

	@Override
	public void aumentarVolume() {
		this.volume++;
		
	}

	@Override
	public void abaixarVolume() {
		this.volume--;
		
	}

	@Override
	public void mudo() {
		this.volume=0;
		
	}

	public int getHora() {
		return hora;
	}

	public int getMinutoAlarme() {
		return minutoAlarme;
	}

	public int getVolume() {
		return volume;
	}

}
