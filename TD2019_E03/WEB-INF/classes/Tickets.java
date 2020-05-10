
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Tickets extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
		String numinfo=request.getParameter("num");
		int num=Integer.parseInt(numinfo);
		int filas=SalaInfo.v.elementAt(num).filas;
		int columnas=SalaInfo.v.elementAt(num).columnas;
        String Asiento;
        for (int i=0;i<filas;i++){
			for (int j=0;j<columnas;j++){
				
				if(request.getParameter("Asiento"+i+"-"+j)==null){
					Asiento ="off";
				} else{
					Asiento =request.getParameter("Asiento"+i+"-"+j);
				}
				if (Asiento.equals("on")){
					SalaInfo.v.elementAt(num).Ocup[i][j]=1;
				}
			}
		}
        
        
        Auditorio General=SalaInfo.v.elementAt(num);
        out.println("<html>");
		out.println("<body background= Cortinas.jpg>");
		out.println("<p align=center>");
		out.println("<font color=WHITE size=8><b>Reserva Exitosa<br><br> Recoja su ticket</b></font></p>");
		out.println("<p align=center>"+SalaInfo.MostrarSala(General)+"<br></p>");
		out.println("<p align=center><a href=index.html><font color=WHITE size=8> Pantalla Inicial</a></p>");
		out.println("</body>");
		out.println("</html>");
    }
}