package br.com.beltsistemas.exerciciosSB.model.repository;

import br.com.beltsistemas.exerciciosSB.model.entities.Produto;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//CrudRepository<[Classe_Base], [Tipo_Identificador]>
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
//  repository tem foco em abstrair dados, igual acontece em um DAO

//  CrudRepository -> CRUD
//  PagingAndSortingRepository -> paginação para consulta no banco de dados

//  'findBy'_AtributoExplicito_'Containing''IgnoreCase'
    public Iterable<Produto> findByNomeContainingIgnoreCase(@NotBlank String nome);
//  Procurará pelo nome que contenha o que foi passado. Parâmetro: Can, Resultado: Caneta Preta, Caneta Vermelha
//  Isso somente será possivel graças a convenção do Spring Boot, logo, se não seguirmos a convenção ocorrerá ERRO
//  'findBy' -> Encontrar/Procurar/GEt/Select
//  'Containing' -> Contenha/Pertence
//  'IgnoreCase' -> Ignorar caixa alta

//   OUTRAS CONVENÇÕES PARA PESQUISA DE STRING:
//   findByNomeContaining
//   findByNomeIsContaining
//   findByNomeContains

//   findByNomeStartsWith
//   findByNomeEndsWith

//   findByNomeNotContaining

//  UTILIZANDO UMA QUERY:
    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
