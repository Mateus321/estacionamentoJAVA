package cma13;

import java.util.ArrayList;

public class ListaVagas {
    ArrayList<VagaFisica> vagas = new ArrayList();
    
    public void cadastravaga(VagaFisica vaga){
        vagas.add(vaga);
    }
    
    public String numerodeveiculos(){
        return vagas.size() + "";
    }
    
}
