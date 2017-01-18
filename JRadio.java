import static java.lang.System.out;
public class JRadio implements Radio{
private double frecuencia;
private boolean estado ;
private double[] seleccionar;
private double[] cambiar;
private double emisora;
private boolean encendido;
private boolean modulacion;
private double[] seleccionaram;
private double[] seleccionarfm;
private double avanzar;

/**
 * @return the modulacion
 */
public double getFrecuencia() {
 return frecuencia;
}
/**
 * @param modulacion the modulacion to set
 */
public void setFrecuencia(double seleccionar2) {
 this.frecuencia = seleccionar2;
}
/**
 * @return the oNOFF
 */
public boolean isONOFF() {
 return estado;
}
/**
 * @param oNOFF the oNOFF to set
 */
public void setONOFF(boolean oNOFF) {
 estado = oNOFF;
}
/**
 * @return the seleccionaram
 */
public double[] getSeleccionaram() {
 return getSeleccionaram();
}
/**
 * @param seleccionaram the seleccionaram to set
 */
public void setSeleccionaram(double[] seleccionaram) {
 this.seleccionaram = seleccionaram;
}
/**
 * @return the seleccionarpm
 */
public double[] getSeleccionarpm() {
 return getSeleccionarpm();
}
/**
 * @param seleccionarpm the seleccionarpm to set
 */
public void setSeleccionarpm(double[] seleccionarfm) {
 this.seleccionarfm = seleccionarfm;
}
/**
 * @return the cambiar
 */
public double[] getCambiar() {
 return cambiar;
}
/**
 * @param cambiar the cambiar to set
 */
public void setCambiar(double[] cambiar) {
 this.cambiar = cambiar;
}
/**
 * @return the estado
 */
public boolean isEstado() {
 return estado;
}
/**
 * @param estado the estado to set
 */
public void setEstado(boolean estado) {
 this.estado = estado;
}
/**
 * @return the emisora
 */
public double getEmisora1() {
 return emisora;
}
/**
 * @param emisora the emisora to set
 */
public void setEmisora(double emisora) {
 this.emisora = emisora;
}
public boolean isEncendido() {
 return isEncendido();
}
public void estado() {
 encendido = !encendido;
 out.println(encendido ? "Radio Encendida" : "Radio Apagada");
 out.println(encendido ? "Frecuencia seleccionada: " + getEmisora1() : "");
}
public void frecuencia() {
 modulacion = !modulacion;
 if (modulacion) {
  seleccionar[1] = getFrecuencia();
  setFrecuencia(seleccionar[0]);
  out.println("FM");
 } else {
  seleccionar[0] = getFrecuencia();
  setFrecuencia(seleccionar[1]);
  out.println("AM");
 };
}
public void cambiar(boolean avanzar) {
 if (!encendido) {
  out.println("El radio se encuentra apagado...");
  return;
 }
 if (avanzar) {
  if (modulacion) {
   if (getFrecuencia() == FM_FIN) {
    setFrecuencia(FM_INI);
   } else {
    setFrecuencia(getFrecuencia() + FM_CAMBIO);
   }
  } else {
   if (getFrecuencia() == AM_FIN) {
    setFrecuencia(AM_INI);
   } else {
    setFrecuencia(getFrecuencia() + AM_CAMBIO);
   }
  }
 } else {
  if (modulacion) {
   if (getFrecuencia() == FM_INI) {
    setFrecuencia(FM_FIN);
   } else {
    setFrecuencia(getFrecuencia() - FM_CAMBIO);
   }
  } else {
   if (getFrecuencia() == AM_INI) {
    setFrecuencia(AM_FIN);
   } else {
    setFrecuencia(getFrecuencia() - AM_CAMBIO);
   }
  }
 }
 out.println(encendido ? "Radio Encendida" : "Radio Apagada");
 out.println(modulacion ? "Modulacion FM" : "Modulacion AM");
 out.println("Frecuencia seleccionada: " + getEmisora1());
}
public void seleccionar(int index) {
 if (!encendido) {
  out.println("El radio se encuentra apagado...");
  return;
 }
 if (modulacion) {
  setFrecuencia(seleccionarfm[index]);
 } else {
  setFrecuencia(seleccionaram[index]);
 }
}
public void guardar(int index) {
 if (!encendido) {
  out.println("El radio se encuentra apagado...");
  return;
 }
 if (modulacion) {
  seleccionarfm[index] = getFrecuencia();
 } else {
  seleccionaram[index] = getFrecuencia();
 }
}
@Override
public void Guardar_seleccion() {
 if (!encendido) {
  out.println("El radio se encuentra apagado...");
  return;
 }
}
@Override
public double getEmisora() {
 return getFrecuencia();
}
@Override
public void ON_OFF() {
	// TODO Auto-generated method stub
	
}
@Override
public void AM_FM() {
	// TODO Auto-generated method stub
	
}
@Override
public void Cambio_de_Emisora(boolean avance) {
	// TODO Auto-generated method stub
	
}
@Override
public void Seleccionar_emisora_guardada(int index) {
	// TODO Auto-generated method stub
	
}
@Override
public void Guardar_Emisora(int index) {
	// TODO Auto-generated method stub
	
}
}


