package jdbc;

public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = """
            INSERT INTO pessoas (nome, id) VALUES (?, ?);
        """;
        System.out.println(dao.incluir(sql, "João Silva", 101));
        System.out.println(dao.incluir(sql, "Ana Julia", 102));
        System.out.println(dao.incluir(sql, "Ana Maria", 103));
        System.out.println(dao.incluir(sql, "Carlos Pereira", 104));

        dao.close();
    }
}
