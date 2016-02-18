package com.github.sandokandias.service;

import java.util.HashMap;
import java.util.Map;

import com.github.sandokandias.exception.BadCredentialException;
import com.github.sandokandias.model.Credential;

public class AuthenticationServiceImpl implements AuthenticationService {

    private static final Map<String, String> USER_DAO = new HashMap<String, String>();

    private static final String MANDATORY_CREDENTIAL_MESSAGE = "O login e a senha devem ser informados.";

    private static final String INVALID_CREDENTIAL_MESSAGE = "Login ou senha inválido(s).";

    static {
        USER_DAO.put("admin", "admin123");
    }

    @Override
    public void authenticate(Credential credential) throws BadCredentialException {

        if (credential == null || !credential.isValid()) {
            throw new BadCredentialException(MANDATORY_CREDENTIAL_MESSAGE);
        }

        String userPassword = USER_DAO.get(credential.getLogin());
        if (!credential.getPassword().equals(userPassword)) {
            throw new BadCredentialException(INVALID_CREDENTIAL_MESSAGE);
        }
    }

}
