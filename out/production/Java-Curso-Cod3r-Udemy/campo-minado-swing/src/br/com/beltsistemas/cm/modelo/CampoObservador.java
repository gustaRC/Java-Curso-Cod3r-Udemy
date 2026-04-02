package br.com.beltsistemas.cm.modelo;

@FunctionalInterface
public interface CampoObservador {
	
	public void eventoOcorreu(Campo c, CampoEvento evento);
}
