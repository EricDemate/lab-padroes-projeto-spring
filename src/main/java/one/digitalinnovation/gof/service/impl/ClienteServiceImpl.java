package one.digitalinnovation.gof.service.impl;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

// imports omitidos para brevidade

@Service
public class ClienteServiceImpl implements ClienteService {

    // outros métodos omitidos para brevidade

    @Override
    public void inserir(Cliente cliente) {
        try {
            salvarClienteComCep(cliente);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Erro ao inserir cliente: " + e.getMessage());
        } catch (FeignException e) {
            throw new RuntimeException("Erro ao consultar CEP via ViaCEP: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            try {
                salvarClienteComCep(cliente);
            } catch (DataIntegrityViolationException e) {
                throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage());
            } catch (FeignException e) {
                throw new RuntimeException("Erro ao consultar CEP via ViaCEP: " + e.getMessage());
            }
        }
    }

    // método salvarClienteComCep() e outros métodos omitidos para brevidade
}
