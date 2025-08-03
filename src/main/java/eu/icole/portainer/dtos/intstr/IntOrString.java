package eu.icole.portainer.dtos.intstr;


public class IntOrString {

    private Integer intVal;
    private String strVal;
    private Integer type;

    public IntOrString() {
    }

    public IntOrString(Integer intVal, String strVal, Integer type) {
        this.intVal = intVal;
        this.strVal = strVal;
        this.type = type;
    }

    public Integer getIntVal() {
        return intVal;
    }

    public void setIntVal(Integer intVal) {
        this.intVal = intVal;
    }

    public String getStrVal() {
        return strVal;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}