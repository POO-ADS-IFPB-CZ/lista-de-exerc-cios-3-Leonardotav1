# Resposta da atividade📓

## Questão 4

**a) Alocação de memória:**
- Arrays de tipos primitivos (int[], double[]) armazenam os valores diretamente na memória contígua.
- Arrays de objetos (Aluno[], Produto[]) armazenam referências (endereços) para os objetos reais, que estão alocados em outras áreas da memória (heap).

**b) Cuidados ao acessar arrays de objetos:**
- É necessário verificar se o índice acessado não está nulo. Caso contrário, pode ocorrer NullPointerException.
- Exemplo:
  if (alunos[i] != null) {
  System.out.println(alunos[i].nome);
  }
