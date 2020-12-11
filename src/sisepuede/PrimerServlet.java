package sisepuede;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/* Un servlet es una clase java especialmente preparada para soportar el paradigma request - response
 * Es decir, recibe requerimiento, cumple con el servicio y envia la respuesta al cliente
 * */
public class PrimerServlet extends HttpServlet {

	static int contador = 0;

	// El método init se ejecuta solo la primera vez que invocamos al servlet
	@Override
	public void init() throws ServletException {
		System.out.println("Estamos dentro del init :)");
	}

	// El metodo doPost solo se ejecuta si el request que llega al servlet, ha nacido con método POST
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Estamos dentro del doPost :)");
	}

	// El método doGet solo se ejecuta si el request que llega al servlet, ha nacido con método GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Estamos dentro del doGet :)");
		
		// Este método generará una respuesta hacia quien lo invocó. (Por ahora, el browser)
		// Por defecto la respuesta es en formato HTML, sin embargo, un servlet es capaz de
		// retornar cualquier cosa (una imagen, un flujo de bytes puros, etc, etc).

		PrintWriter salida = resp.getWriter();
		salida.println("<font color=blue size=9>");
		salida.println("Inicia la venta de entradas para el concierto: " + (++contador));
		salida.println("</font>");
		salida.close();
	}

}