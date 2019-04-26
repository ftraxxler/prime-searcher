package sew4.prime.searcher.ftraxler.tgm.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author Fabian Traxler {@literal <ftraxler@student.tgm.ac.at>}
 * @version 2019-04-26
 * @project sew4-prime-searcher-ftraxler-tgm
 */
@WebServlet(name="Searcher",urlPatterns = "primes/searcher")
public class Searcher extends HttpServlet implements Runnable {


    private static final long serialVersionUID = 3214345415145245L;

    private long prime;
    private Date primeModified;
    private Date start;
    private boolean flag = true;
    private Thread search;

    protected void processRequest(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    public void run() {

    }
}
