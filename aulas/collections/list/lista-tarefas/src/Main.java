public class Main {
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa repetida");
        listaTarefa.adicionarTarefa("Tarefa repetida");

        listaTarefa.obterDescricoesTarefas();

        System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.removerTarefa("Tarefa repetida");
        System.out.println("Total de tarefas após remoção: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
