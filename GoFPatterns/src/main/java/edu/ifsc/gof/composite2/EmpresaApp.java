package edu.ifsc.gof.composite2;

import edu.ifsc.gof.composite2.model.Funcionario;
import edu.ifsc.gof.composite2.model.Setor;

public class EmpresaApp {
    public static void main(String[] args) {
        Setor empresa = new Setor("Digital SA");
        Funcionario ceo = new Funcionario("Steve", "CEO", 50000.0);
        empresa.add(ceo);
        Setor marketing = new Setor("Marketing");
        Funcionario germark = new Funcionario("Joao", "Gerente de Marketing", 5000);
        Funcionario funcmark = new Funcionario("Pedro", "Marketing", 1000);
        marketing.add(germark);
        marketing.add(funcmark);
        empresa.add(marketing);
        
        Setor vendas = new Setor("Vendas");
        Funcionario gervend = new Funcionario("Maria", "Gerente de Vendas", 5000);
        vendas.add(gervend);
        Funcionario funcvend1 = new Funcionario("Julia", "Vendedora", 1000);
        vendas.add(funcvend1);
        Funcionario funcvend2 = new Funcionario("Camila", "Vendedora", 1000);
        vendas.add(funcvend2);
        empresa.add(vendas);

        Setor rh = new Setor("RH");
        Funcionario gerrh = new Funcionario("Paula", "Gerente RH", 5000);
        rh.add(gerrh);
        empresa.add(rh);
        
        System.out.println("Organograma:");
        System.out.println(empresa.identificacao());
        
        System.out.println("Custo:");
        System.out.println(empresa.calculaCusto() + "");
                
    }
}
