import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EditarEvento extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
		
		String numInfo = request.getParameter("num");
		int num = Integer.parseInt(numInfo);
		
		out.println("<html>"); 
		
		out.println("<p align=center>");
		out.println("<B><font color=WHITE size=10>Edite su Evento: </font></B>");
		out.println("</p>");
		out.println("<body background = Cortinas.jpg>");
		
		out.println("<form method=GET action = TicketEditado >");
		out.println("<p align=center>");
		
		String evento = SalaInfo.v.elementAt(num).evento;
		String fecha = SalaInfo.v.elementAt(num).fecha;
		String hora = SalaInfo.v.elementAt(num).hora;
		double precio = SalaInfo.v.elementAt(num).precio;
		
		out.println("<font  color=WHITE size=7> Nombre actual: <font color=YELLOW>" +evento+ "</font> Fecha actual: <font color=YELLOW>"+fecha+"</font> </font><br>");
		out.println("<font  color=WHITE size=7> Hora actual: <font color=YELLOW>" +hora+ "</font> Precio actual: <font color=YELLOW>" +precio+ "</font></font><br><br>");
		
				out.println("<font style=text-align:center;color:WHITE; size=7 > Nuevo nombre del evento: </font>");
				out.println("<input type=text name=evento align=middle><br><br>");
				
				out.println("<font style=text-align:center;color:WHITE; size=7 > Nuevo Precio: </font>");
				out.println("<input type=text name=precio align=middle><br><br>");
				
				out.println("<font style=text-align:center;color:WHITE; size=7> Nueva Fecha: </font>");
				out.println("<input type=text name=fecha align=middle><br><br>");
				
				out.println("<font style=text-align:center;color:WHITE; size=7> Nueva Hora: </font>");
				out.println("<input type=text name=hora align=middle><br><br>");
			
			out.println("<input type= submit value= Alterar></input><br><br>");
            out.println("<input type=hidden name=num value="+num+">");
			out.println("<p style= text-align:center><A href ='index.html'><font color=WHITE size=6> Pantalla Inicial</font></A></p>");

			out.println("</form>");
			out.println("</p>");
			out.println("</body>");
			out.println("</html>");
			
	}
}
		
		