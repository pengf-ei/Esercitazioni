/*
 *Esercizio 1
 *Realizzare un programma che sia in grado di valutare il volume di
 *oggetti tridimensionali come cilindri e parallelepipedi basandosi
 *sul valore della loro area e dell'altezza.
 *Delegare i metodi comuni, come il calcolo e la stampa del volume ad una classe astratta.
 */


public class OggettoTridimensionale extends MetodiComuni {
	private double area;
	private double altezza;
	

	public OggettoTridimensionale(double area, double altezza) {
		super();
		this.area = area;
		this.altezza = altezza;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getAltezza() {
		return altezza;
	}



	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}


	@Override
	public String toString() {
		return "OggettiTridimensionali [area=" + area + ", altezza=" + altezza + "]";
	}


	@Override
	public double calVolume() {
		return area * altezza;
	}

	


}
