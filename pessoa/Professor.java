package pessoa;

public class Professor extends Pessoa {

    private double salario;

  public double getSalario() {
      return salario;
  }

  public void setSalario(double salario) {
      this.salario = salario;
  }
     
      //Sobrescreveu dados da pessoa
   String imprimirDadosDaPessoa() {
    System.out.println(super.imprimirDadosDaPessoa());
    return "Voce é professor.";
  }
    
    
}
