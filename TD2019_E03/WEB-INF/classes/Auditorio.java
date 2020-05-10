public class Auditorio{
    String nombre;
    int filas;
    int columnas;
    String evento;
    Double precio;
    String fecha;
    String hora;
    int [][] Ocup;
    
    public Auditorio(String evento, Double precio, String fecha , String hora){
    this.nombre="Auditorio";
    this.filas=20;
    this.columnas=10;
    this.evento=evento;
    this.precio=precio;
    this.fecha=fecha;
    this.hora=hora;
    Ocup=new int[filas][columnas];
    }
} 