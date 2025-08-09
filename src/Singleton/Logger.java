public class Logger {

    private static Logger Instancia;

    private Logger (    ){}

    public static Logger getInstancia() {
       if ( Instancia == null){
        Instancia=new Logger();
         }
        return Instancia;
    }

    Public void Log(String Mensaje){

 
    System.out.println("[LOG]: " + Mensaje);

}
    
}


