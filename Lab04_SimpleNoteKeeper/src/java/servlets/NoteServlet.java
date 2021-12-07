package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = "";
        String contents = "";
        title = request.getParameter("title");
        contents = request.getParameter("contents");
        
        Note editNote = new Note(title, contents);
        
        request.setAttribute("note", editNote);
        
        if ( title == null || title.equals("") || contents == null || contents.equals("") ) {
            request.setAttribute("invalidEntry", true);
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request,response);
            return;
        }
        
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request,response);
            return;
    }

}
