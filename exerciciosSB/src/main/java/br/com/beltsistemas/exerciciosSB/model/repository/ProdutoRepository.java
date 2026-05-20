package br.com.beltsistemas.exerciciosSB.model.repository;

import br.com.beltsistemas.exerciciosSB.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//CrudRepository<[Classe_Base], [Tipo_Identificador]>
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
//  repository tem foco em abstrair dados, igual acontece em um DAO

//  CrudRepository -> CRUD
//  PagingAndSortingRepository -> paginação para consulta no banco de dados
}
