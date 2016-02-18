package com.github.sandokandias.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.sandokandias.exception.BadCredentialException;
import com.github.sandokandias.model.Credential;
import com.github.sandokandias.service.AuthenticationService;
import com.github.sandokandias.service.AuthenticationServiceImpl;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = -808563753638274617L;

    private static final String LOGIN_PARAM = "login";
    private static final String PASSWORD_PARAM = "password";

    private AuthenticationService authenticationService;

    @Override
    public void init() throws ServletException {
        this.authenticationService = new AuthenticationServiceImpl();
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter(LOGIN_PARAM);
        String password = request.getParameter(PASSWORD_PARAM);

        Credential credential = new Credential(login, password);

        try {
            authenticationService.authenticate(credential);

            String success = String.format("/dashboard.jsp?u=%s", credential.getLogin());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(success);
            dispatcher.forward(request, response);
        } catch (BadCredentialException e) {

            System.err.println(e.getMessage());

            String error = String.format("/index.jsp?m=%s", e.getMessage());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(error);
            dispatcher.forward(request, response);
        }

    }
}
