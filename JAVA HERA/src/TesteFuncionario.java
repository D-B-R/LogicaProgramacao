
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("nico rocha");
		nico.setCpf("222222-90");
		nico.setSalario(2600.00);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
//		nico.salario = 300;
		
		

	}

}
