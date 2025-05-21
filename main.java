public class main {
    public static void main(String[] args)
    {
        Medico luiz = new Medico("Luiz", "Pediatra");
        Medico diego = new Medico("Diego", "Oftalmologista");

        Paciente p1 = new Paciente("Pedro", "000",50 ,"0000");
        Paciente p2 = new Paciente("joao", "111",20 ,"111");
        Paciente p3 = new Paciente("ze", "222",30 ,"222");
        Paciente p4 = new Paciente("natan", "333",40 ,"333");

        Agenda agenda1 = new Agenda(diego);
        agenda1.setData("22/10/2024");
        agenda1.adicionar(p4);
        agenda1.adicionar(p3);
        agenda1.apresentarListaDePacientes();


        Agenda agenda2 = new Agenda(luiz);
        agenda2.setData("22/10/2024");
        agenda2.adicionar(p1);
        agenda2.adicionar(p2);
        
        agenda2.remover("111");
        agenda2.apresentarListaDePacientes();


        





    }
}
