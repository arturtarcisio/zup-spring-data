package br.com.arturtcs.zup.demo.services;

import br.com.arturtcs.zup.demo.entities.Pessoa;
import br.com.arturtcs.zup.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa){
        return repository.save(pessoa);
    }

    public Pessoa findById(Long id){
        var obj = repository.findById(id);
        return  obj.get();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Pessoa update(Long id, Pessoa obj){
        Pessoa entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Pessoa entity, Pessoa obj) {
        entity.setNome(obj.getNome());
        entity.setIdade(obj.getIdade());
    }
}
