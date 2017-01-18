public interface Radio {
// Constantes de la radio
   /**
    * Cambio en estaciones AM
    */
   final int AM_CAMBIO = 10;
   
   /**
    * Cambio en estaciones FM
    */
   final double FM_CAMBIO = 0.20;
   
   /**
    * Estacion inicial AM
    */
   final int AM_INI = 530;
   
   /**
    * Estacion final AM
    */
   final int AM_FIN = 1610;
   
   /**
    * Estacion inicial FM
    */
   final double FM_INI = 87.90;
   
   /**
    * Estacion final FM
    */
   final double FM_FIN = 107.90;
   
   // Métodos de la radio
   /**
    * Apaga o enciende la radio
    */
   public void ON_OFF();
   
   /**
    * Selecciona entre AM y FM
    */
   public void AM_FM();
   /**
    * 
    * @param avance True: Avanza hacia adelante
    */
   public void Cambio_de_Emisora(boolean avance);
   
   /**
    * 
    * @param index Posicion de la estacion a guardar
    */
   public void Seleccionar_emisora_guardada(int index);
   
   /**
    * 
    * @param index Posicion de la estacion guardada
    */
   public void Guardar_Emisora(int index);
   
   /**
    * 
    */
   public void Guardar_seleccion();
   
   /**
    * 
    * @return La frecuencia seleccionada (FM o AM)
    */
   public double getEmisora();
  }