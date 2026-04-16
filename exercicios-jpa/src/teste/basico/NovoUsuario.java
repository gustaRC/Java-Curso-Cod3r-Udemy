package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa" /*banco de dados/ name presente no persistence-unit*/);
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Gustavo", "gustavo@lanche.com.br");

        em.getTransaction().begin(); // inicia transações/manipulações (sistema similar a alterações com commit)
        em.persist(novoUsuario); // inserir um novo elemento
        em.getTransaction().commit(); // encerra transações/manipulações (sistema similar a alterações com commit)

        System.out.println("O ID gerado foi: " +  novoUsuario.getId());

        em.close();
        emf.close();
    }
}
