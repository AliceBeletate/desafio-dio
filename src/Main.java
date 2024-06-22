import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHannah = new Dev();
        devHannah.setNome("Hannah");
        devHannah.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Hannah: " + devHannah.getConteudosInscritos());

        devHannah.progredir();
        devHannah.progredir();

        System.out.println("Conteudo Inscritos Hannah: " + devHannah.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Hannah: " + devHannah.getConteudosConcluidos());
        System.out.println("XP: " + devHannah.calcularTotalXp());



        Dev devSophia = new Dev();
        devSophia.setNome("Sophia");
        devSophia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Sophia: " + devSophia.getConteudosInscritos());

        devSophia.progredir();

        System.out.println("Conteudo Inscritos Sophia: " + devSophia.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Sophia: " + devSophia.getConteudosConcluidos());
        System.out.println("XP: " + devSophia.calcularTotalXp());

    }
}