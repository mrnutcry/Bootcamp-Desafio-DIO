import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        models.Curso curso1 = new models.Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        models.Curso curso2 = new models.Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(4);

        models.Mentoria mentoria1 = new models.Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        models.Bootcamp bootcamp = new models.Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Data de Início: " + bootcamp.getDataInicio());
        System.out.println("Data Final: " + bootcamp.getDataFinal());

        models.Dev dev1 = new models.Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-------");

        models.Dev dev2 = new models.Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
