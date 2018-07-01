package pizzaria;

public class PizzaDTO {

    private String massa;

    private String queijo;

    private String molho;

    private String sabor;

    private int tempoDePreparo;

    public PizzaDTO(){

    }

    public PizzaDTO(String massa, String queijo, String molho, String sabor, int tempoDePreparo)
    {
        this.massa = massa;

        this.queijo = queijo;

        this.molho = molho;

        this.sabor = sabor;

        this.tempoDePreparo = tempoDePreparo;
    }

    public String getMassa() {
        return massa;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getMolho() {
        return molho;
    }

    public String getSabor() {
        return sabor;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }
}