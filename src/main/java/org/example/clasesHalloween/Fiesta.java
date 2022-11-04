package org.example.clasesHalloween;

public class Fiesta {
    //ATRIBUTOS
    private String fecha;

    private   double costoAlimentos;

     private double costoBebidas;

    private double costoLugar;

    private double costoEquipo;


    private final double VALOR_ENTRADA=5000;

    // CONSTRUCTOR



    public Fiesta() {

    }

    public Fiesta(String fecha, double costosTotal, double gastosTotal, float ganancias, int numeroEntradas, double valorEntrada) {
        this.fecha = fecha;
        this.costoAlimentos =
    }


    //metodos de encapsulado

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public double getCostoAlimentos() {
        return costoAlimentos;
    }

    public void setCostoAlimentos(double costoAlimentos) {
        if (costoAlimentos>0){
            this.costoAlimentos = costoAlimentos;

        }else {
            this.costoAlimentos =0;
            System.out.println("No aceptamos valores negativos.");
        }


    }

    public double getCostoBebidas() {
        return costoBebidas;
    }

    public void setCostoBebidas(double costoBebidas) {
        this.costoBebidas = costoBebidas;

        if (costoBebidas>0){
            this.costoBebidas = costoAlimentos;

        }else {
            this.costoBebidas =0;
            System.out.println("No aceptamos valores negativos.");
        }
    }

    public double getCostoLugar() {
        return costoLugar;
    }

    public void setCostoLugar(double costoLugar) {
        this.costoLugar = costoLugar;

        if (costoLugar>0){
            this.costoLugar = costoAlimentos;

        }else {
            this.costoLugar =0;
            System.out.println("No aceptamos valores negativos.");
        }
    }

    public double getCostoEquipo() {
        return costoEquipo;
    }

    public void setCostoEquipo(double costoEquipo) {
        this.costoEquipo = costoEquipo;

        if (costoEquipo>0){
            this.costoEquipo = costoAlimentos;

        }else {
            this.costoEquipo =0;
            System.out.println("No aceptamos valores negativos.");
        }
    }






    //METODOS ordinarios

    public double calcularCostos(){
        return(this.costoAlimentos + this.costoBebidas+this.costoLugar+this.costoEquipo);

    }


}
