package com.example.apiintegrador.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.apiintegrador.repository.ComprasRepository;
import java.util.List;
import javax.transaction.Transactional;

@Service
@Transactional
public class ComprasService {
    @Autowired
    private ComprasRepository comprasRepository;
    public List<Compras> listAllCompras() {
        return comprasRepository.findAll();
    }

    public void saveCompra(Compras compras) {
        comprasRepository.save(compras);
    }

    public Compras getCompra(Integer id) {
        return comprasRepository.findById(id).get();
    }

    public void deleteCompra(Integer id) {
        comprasRepository.deleteById(id);
    }
}