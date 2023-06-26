package org.malibu.inventario.ValidacionEntradas;

public class BloquearAgregarRol {
    private boolean botonBloqueado;
    BloquearAgregarRol bloqueador;
    public BloquearAgregarRol() {
        botonBloqueado = false;
    }

    public void bloquearBoton() {
        botonBloqueado = true;
    }

    public void desbloquearBoton() {
        botonBloqueado = false;
    }

    public boolean isBotonBloqueado() {
        return botonBloqueado;
    }
    public void agregarRol() {

        if (bloqueador.isBotonBloqueado()) {
            System.out.println("El bot�n ROL est� bloqueado. No se pueden agregar m�s roles.");
        } else {
            // L�gica para agregar un nuevo rol
            System.out.println("Se agreg� un nuevo rol correctamente.");
        }
    }

    public void bloquearBotonRol() {
        bloqueador.bloquearBoton();
        System.out.println("El bot�n ROL ha sido bloqueado.");
    }

    public void desbloquearBotonRol() {
        bloqueador.desbloquearBoton();
        System.out.println("El bot�n ROL ha sido desbloqueado.");
    }

}
