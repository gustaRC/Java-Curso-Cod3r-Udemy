package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID do usuário para alteração: ");
        long idUsuario = scanner.nextLong();
        scanner.nextLine();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, idUsuario);
        System.out.print("Digite o novo nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.print("Digite o novo e-mail: ");
        usuario.setEmail(scanner.nextLine());

        em.merge(usuario); // mesmo conceito do merge no git, é realizado o merge no banco de dados

        em.getTransaction().commit();

        System.out.println(
                "ID: " + usuario.getId() +
                ", Nome: " + usuario.getNome() +
                ", E-mail: " + usuario.getEmail()
        );

        em.close();
        emf.close();
    }
}
