package org.rafaelgmr12.service.reajuste;

import org.rafaelgmr12.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);

}
