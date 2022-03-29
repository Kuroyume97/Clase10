/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

public class Colaborador extends Persona { // herencia

    private String puesto;
    private String departamento;
    private int salario;

    public Colaborador() {

    }

    public Colaborador(String puesto, String departamento, int salario, String nombre, int edad, char genero) {
        super(nombre, edad, genero); // super indica que los atributos son heredados
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void MostrarDatos(){
        JOptionPane.showMessageDialog(null, "El nombre es: "+getNombre()
        +"\n La edad es: "+getEdad()
        +"\n El genero es: "+getGenero()
        +"\n El salario es: "+salario
        +"\n El puesto es: "+puesto
        +"\n El departamento es: "+departamento);
    }
}
