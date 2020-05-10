import java.util.*;
public class SalaInfo{
    public static Vector<Auditorio> v =new Vector<Auditorio>();
    public static String MostrarSala(Auditorio General){
        String InfoSala="<table border=1";
        for (int i=0;i<General.filas;i++){
            InfoSala+="<tr>";
            for (int j=0;j<General.columnas;j++){
                if (General.Ocup[i][j]==1){
                    InfoSala+="<td bgcolor=#FF0000>Ocupado</td>";
                } else {
                    InfoSala+="<td bgcolor=#00FF00>Libre</td>";
                }
            }
        }
        InfoSala+="</table>";
        return InfoSala;
    }
}
