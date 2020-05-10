import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TicketEditado extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String numinfo=request.getParameter("num");
		int num=Integer.parseInt(numinfo);
		String nombre = request.getParameter("evento");
		String precio = request.getParameter("precio");
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
        Double price= Double.parseDouble(precio);
		
		out.println("<html>");
		out.println("<body background = Cortinas.jpg>");
		
		out.println("<p align=center>");
		out.println("<B><font color=WHITE size=10> Evento Editado: </font></B>");
		out.println("</p>");
		
		out.println("<p style= text-align:center>");
		out.println("<font color=WHITE size=8> Nuevo Evento: <font color=YELLOW> " +nombre+ " </font></font><br>");
		out.println("<font color=WHITE size=8> Nuevo Precio: <font color=YELLOW> " +price+ "</font></font><br>");
		out.println("<font color=WHITE size=8> Nueva Fecha: <font color=YELLOW> " +fecha+ "</font></font><br>");
		out.println("<font color=WHITE size=8> Nuevo Hora: <font color=YELLOW>" +hora+ "</font></font><br><br>");
		SalaInfo.v.elementAt(num).evento=nombre;
        SalaInfo.v.elementAt(num).precio=price;
        SalaInfo.v.elementAt(num).fecha=fecha;
        SalaInfo.v.elementAt(num).hora=hora;
		out.println("<A href='index.html'><font color=WHITE size=8>Pantalla Incial</font></A>");
		out.println("</body>");
		out.println("</html>");
	}
}
		
		
		
		
		