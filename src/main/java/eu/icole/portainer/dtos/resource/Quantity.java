package eu.icole.portainer.dtos.resource;


public class Quantity {

    private String Format;

    public Quantity() {
    }

    public Quantity(String Format) {
        this.Format = Format;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String Format) {
        this.Format = Format;
    }

}