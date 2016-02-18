package com.github.sandokandias.service;

import com.github.sandokandias.exception.BadCredentialException;
import com.github.sandokandias.model.Credential;

public interface AuthenticationService {

    void authenticate(Credential credential) throws BadCredentialException;
}
