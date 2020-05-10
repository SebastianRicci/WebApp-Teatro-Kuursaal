import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EventoInformacion extends HttpServlet {
  public void doGet (HttpServletRequest req, HttpServletResponse resp) 
  throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		
		String evento = req.getParameter("evento");
		String precio = req.getParameter("precio");
		String fecha = req.getParameter("fecha");
		String hora = req.getParameter("hora");
      
        Double price= Double.parseDouble(precio);
		
		
		
		Auditorio General = new Auditorio(evento, price, fecha, hora);
	
		for (int i=0; i<General.filas ; i++){
			for(int j=0; j<General.columnas; j++){
				
				General.Ocup[i][j]=0;
			}
		}
		
		SalaInfo.v.addElement(General);
		
			out.println("<html>");
			out.println("<body background = Cortinas.jpg>");
			out.println("<p align=center>");
			out.println("<B><font color=WHITE size=16>Gracias por programar su evento en El Kursaal</font></B>");
			out.println("</p>");
			
			out.println("<p style = text-align:center>");
			out.println("<font color=WHITE size=14> Se he registrado el evento: " +evento+ "</font><br>");
			out.println("<font color=WHITE size=14> El dia: " + fecha + "</font><br>");
			out.println("<font color=WHITE size=14> Hora: " + hora + "</font><br>");
			out.println("<font color=WHITE size=14> Precio: " + price + "</font><br><br>");
			out.println("<A href = 'index.html'><font color=WHITE size=12>Pantalla Inicial</font></A><br>");
			out.println("</p>");
			
			out.println("</body>");
			out.println("</html>");
			
  }
}