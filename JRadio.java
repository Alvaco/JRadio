import static java.lang.System.out;

public class jRadio implements iRadio{
	
	private boolean estado;
	private int frecuenciaAM;
	private float frecuenciaFM;
	private boolean frecuencia;
	private float[] favoritasFM;
	private int[] favoritasAM;
	
	public jRadio (){
		estado = false;
		frecuenciaAM = 530;
		frecuenciaFM = (float) 87.9;
		frecuencia = false;
		favoritasFM = new float[12];
		favoritasAM = new int[12];
		for (int i = 0; i < 12; i++){
			favoritasFM[i] = 0;
			favoritasAM[i] = 0;
		}
		
	}

	@Override
	public void estado() {
		estado = !estado;
		out.println(estado ? "Radio Encendida" : "Radio Apagada");
		out.println(estado ? "Frecuencia seleccionada: " + getEmisora() : "");
	}

	@Override
	public void frecuencia() {
		if (estado == false) {
			out.println("El radio se encuentra apagado");
			return;
		}
		frecuencia = !frecuencia;
		if (frecuencia == false){
			out.println("AM " + getEmisora()); 
		}
		else{
			out.println("FM " + getEmisora());
		}
	}

	@Override
	public void cambiar(boolean direccion) {
		if (estado == false) {
			out.println("El radio se encuentra apagado");
			return;
		}
		if (direccion == false){
			if (frecuencia == false){
				if (frecuenciaAM <= 530){
					frecuenciaAM = 1610;
				}
				else{
					frecuenciaAM -= 10;
				}
			}
			else{
				if (frecuenciaFM <= 87.9){
					frecuenciaFM = (float) 107.9;
				}
				else{
					frecuenciaFM -= 0.2;
				}
			}
		}
		else{
			if (frecuencia == false){
				if (frecuenciaAM >= 1610){
					frecuenciaAM = 530;
				}
				else{
					frecuenciaAM += 10;
				}
			}
			else{
				if (frecuenciaFM >= 107.9){
					frecuenciaFM = (float) 87.9;
				}
				else{
					frecuenciaFM += 0.2;
				}
			}
		}
		out.println(getEmisora());
	}

	@Override
	public void guardar(int indice) {
		if (estado == false) {
			out.println("El radio se encuentra apagado");
			return;
		}
		if(frecuencia == false){
			favoritasAM[indice] = frecuenciaAM;
		}
		else{
			favoritasFM[indice] = frecuenciaFM;
		}
		out.println("Se ha guardado la estacion " + getEmisora() + " en la posicion " + (indice+1));
	}

	@Override
	public void seleccionar(int indice) {
		if (estado == false) {
			out.println("El radio se encuentra apagado");
			return;
		}
		if (frecuencia == false){
			if (favoritasAM[indice]== 0){
				out.println("Aun no ha guardado una emisora en este espacio");
			}
			else{
				frecuenciaAM = favoritasAM[indice];
				out.println("AM" + getEmisora());
			}			
		}
		else{
			if (favoritasFM[indice] == 0){
				out.println("Aun no ha guardado una emisora en este espacio");
			}
			else{
				frecuenciaFM = favoritasFM[indice];
				out.println("FM" + getEmisora());
			}
		}
		
		
	}

	@Override
	public boolean getEstado() {
		return estado;
	}

	@Override
	public boolean getFrecuencia() {
		return frecuencia;
	}

	@Override
	public float getEmisora() {
		if (frecuencia == false){
			return frecuenciaAM;
		}
		else{
			return frecuenciaFM;
		}
	}
	

}
