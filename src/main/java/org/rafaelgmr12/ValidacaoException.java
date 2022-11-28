package org.rafaelgmr12;

import java.io.Serial;

public class ValidacaoException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}
