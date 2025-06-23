package model;

public class Idiomas implements Cloneable {
	
	private String idiomas;
	private String idiomap;
	
	public Idiomas(String idiomas, String idiomap) {
		this.idiomap = idiomap;
		this.idiomas = idiomas;
	}
	
		
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public String getIdiomap() {
		return idiomap;
	}
	public void setIdiomap(String idiomap) {
		this.idiomap = idiomap;
	}
	
    @Override
    public Idiomas clone() {
        try {
            return (Idiomas) super.clone(); // Se llama el método clonar de Cloneable para copiar el idioma.
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }
	
}
