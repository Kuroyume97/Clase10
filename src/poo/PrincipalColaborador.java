/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

public class PrincipalColaborador {

    public static void main(String[] args) {
        Colaborador datos = new Colaborador();
        datos.setNombre(JOptionPane.showInputDialog("Digite el nombre del colaborador"));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del colaborador")));
        datos.setGenero(JOptionPane.showInputDialog("Digite el genero del colaborador").charAt(0));
        datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite el salario del colaborador")));
        datos.setPuesto(JOptionPane.showInputDialog("Digite el puesto del colaborador"));
        datos.setDepartamento(JOptionPane.showInputDialog("Digite el departamento del colaborador"));
        datos.MostrarDatos();
    }
}
