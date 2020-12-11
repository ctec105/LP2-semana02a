package sisepuede;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogueoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Recuperamos los datos que llegán en el request
		String vusuario = request.getParameter("usuario");
		String vclave = request.getParameter("clave");
		System.out.println(vusuario);
		System.out.println(vclave);
				
		// 2. "validamos" (creamos un poco de lógica)
		boolean ok = false;
		if (vusuario.equals("jose") && vclave.equals("toro")) {
			ok = true;
		}
		
		// 3. Dependiendo del resultado de la validación invocamos a bienvenida.jsp o rebotamos a logueo.jsp
		// para que un servlet pueda invocar a otro componente, usamos el famoso objeto RequestDispatcher (Despachador del request)
		if (ok == true) {
			System.out.println("Caso de éxito");
			RequestDispatcher rd = request.getRequestDispatcher("/bienvenida.jsp");
			// Despachamos
			rd.forward(request, response);
		} else {
			System.out.println("Caso de error");
			RequestDispatcher rd = request.getRequestDispatcher("/logueo.jsp");
			rd.forward(request, response);
		}
	}

}