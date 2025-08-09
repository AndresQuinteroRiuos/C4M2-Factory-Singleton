import Singleton.Logger;
import Factory.Forma;
import Factory.FormaFactory;
import Factory.TipoForma;

public class App {
    public static void main(String[] args) throws Exception {
        // Intentar forzar UTF-8 en la salida estándar (puede requerir 'chcp 65001' en Windows)
        try {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        } catch (Exception ignored) {}

        /// Singleton
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Se imprimio el pasaporte");
        logger2.log("Se imprimio la historia clinica");

        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger1 == logger2);

        // Factory
        Forma forma1 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma1.Dibujar();
        Forma forma2 = FormaFactory.getForma(TipoForma.RECTANGULO);
        forma2.Dibujar();
        Forma forma3 = FormaFactory.getForma(TipoForma.TRIANGULO);
        forma3.Dibujar();
        Forma forma4 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma4.Dibujar();

        System.out.println(forma1 == forma4);
    }
}
