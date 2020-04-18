package com.CMPP.x00202118;

import java.util.ArrayList;

public abstract class Empleado {
    private String nombre;
    private String puesto;
    private ArrayList<Documento> documentos;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        documentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public ArrayList<Documento> getDocumentos() {

        return documentos;
    }

    public void addDocumento(String Documento){
        String nombre = (" nombre: " + getNombre());
        String puesto = (" puesto: " + getPuesto());
        double salario = Double.parseDouble(("salario:  " + getSalario()));




    }
    public  void removeDocuemento(String Docuemnto){
        return;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", documentos=" + documentos +
                ", salario=" + salario +
                '}';
    }
}
