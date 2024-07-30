/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Christian
 */
public class Cliente extends Persona {
    private String nit;
    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
        System.out.println("Nit: "+ getNit());
        System.out.println("Nombres: " + this.getNombres());
        System.out.println("apellidos: " + this.getApellidos());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
        System.out.println("Fecha de nacimiento: " + this.getFecha_nacimiento());
        
    }
    
    
}
