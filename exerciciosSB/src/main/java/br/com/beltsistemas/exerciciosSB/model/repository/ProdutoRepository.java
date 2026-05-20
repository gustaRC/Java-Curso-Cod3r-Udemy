package br.com.beltsistemas.exerciciosSB.model.repository;

import br.com.beltsistemas.exerciciosSB.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

//CrudRepository<[Classe_Base], [Tipo_Identificador]>
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
//  repository tem foco em abstrair dados, igual acontece em um DAO
}
