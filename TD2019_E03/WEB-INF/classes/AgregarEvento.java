import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AgregarEvento extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
			
				out.println("<html>");
				
				out.println("<body background = Cortinas.jpg>");
				out.println("<p align=center>");
				out.println("<B><font color=WHITE size=16>Introduzca su Evento: </font></B>");
				out.println("</p>");
				
				
				out.println("<form action=EventoInformacion method=Get>");
				
				out.println("<p align=center>");
				out.println("<font style=text-align:center;color:WHITE; size=14 > Nombre del evento: </font>");
				out.println("<input type=text name=evento align=middle><br><br>");
				
				out.println("<font style=text-align:center;color:WHITE; size=14 > Precio: </font>");
				out.println("<input type=text name=precio align=middle><br><br>");
				
				out.println("<font style=text-align:center;color:WHITE; size=14> Fecha: </font>");
				out.println("<input type=text name=fecha align=middle><br><br>");
				
				out.println("<font style=text-align:center;color:WHITE; size=14> Hora: </font>");
				out.println("<input type=text name=hora align=middle><br><br>");
				
					out.println("<input type=Submit value=Crear>"); 
					out.println("<input type=reset value=Borrar>");
				
				out.println("<p style= text-align:center><A href ='index.html'><font color=WHITE size=14>Pantalla Inicial</font></A></p>");
				out.println("</p>");
				out.println("</form>");
				out.println("</body>");
				out.println("</html>");
	}
}		
				
				
				
				
				
		
		