import java.util.Stack;
import javax.swing.JOptionPane;

public class metodos {
    public void LlenarPila() {
        Stack<Vehiculo> pila = new Stack<>();
        boolean continuar = true;
        String agregar = "";
        while (continuar) {
            Vehiculo o = new Vehiculo();
            o.setMarca(JOptionPane.showInputDialog("Ingrese La marca"));
            o.setColor(JOptionPane.showInputDialog("Ingrese La Color"));
            o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio")));
            pila.push(o);
            agregar = JOptionPane.showInputDialog("Desea agregar mas Registros S/N");
            if (agregar.equalsIgnoreCase("N")) {
                continuar = false;
            }

        }
        MostrarPila(pila);
        pila = Eliminar(pila);
        MostrarPila(pila);
    }

    public void MostrarPila(Stack<Vehiculo> pila) {
        for (Vehiculo o : pila) {
            System.out.println("Marca: " + o.getMarca());
            System.out.println("Color: " + o.getColor());
            System.out.println("Precio " + o.getPrecio());
            System.out.println();
        }
    }

    public Stack<Vehiculo> Eliminar(Stack<Vehiculo> pila) {

        String dato = JOptionPane.showInputDialog("Ingrese el registro que desea eliminar");
        for (Vehiculo o : pila) {
            if (o.getMarca().equalsIgnoreCase(dato)) {
                pila.pop();

            }

        }
        return pila;

    }
}
