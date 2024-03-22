package pessoa;

public class testeDePessoa {

    public static void main(String[] args) {
        Professor professor = new Professor(); 
        professor.setCpf("333222111");
        professor.setNome("Fernando");
        professor.setIdade(18);
        professor.setSalario(4000.00);

        System.out.println(professor.imprimirDadosDaPessoa());


        Aluno aluno = new Aluno();
        aluno.setCpf("111222333");
        aluno.setIdade(13);
        aluno.setNome("Joaozinho");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
    
}
