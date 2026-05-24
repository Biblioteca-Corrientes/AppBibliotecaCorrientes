# Requisitos do Sistema

## Requisitos Funcionais

### RF01 — Cadastro de livros
O sistema deve permitir o cadastro de livros contendo:
- título;
- autor;
- ISBN;
- status de disponibilidade.

---

### RF02 — Registro de empréstimos
O sistema deve permitir registrar empréstimos contendo:
- leitor;
- livro;
- data do empréstimo;
- data prevista de devolução.

---

### RF03 — Devolução de livros
O sistema deve permitir registrar a devolução de livros, atualizando automaticamente o status do exemplar.

---

### RF04 — Listagem de livros em atraso
O sistema deve permitir ao bibliotecário visualizar livros com devolução em atraso.

---

## Requisitos Não Funcionais

### RNF01 — Interface Web
O sistema deverá possuir interface acessível via navegador.

---

### RNF02 — Persistência de Dados
Os dados do sistema deverão ser armazenados em banco de dados.

---

### RNF03 — Organização do Sistema
O sistema deverá possuir separação entre frontend, backend e documentação.

---

### RNF04 — Controle de Acesso
O sistema deverá possuir diferenciação entre os perfis:
- bibliotecário;
- leitor.

---

### RNF05 — Versionamento
O desenvolvimento do sistema deverá utilizar controle de versionamento com Git e Github.

---

## 📚 Regras de Negócio

### RN01
Um livro só poderá ser emprestado caso esteja com status "Disponível".

---

### RN02
Ao registrar um empréstimo, o status do livro deverá ser alterado para "Indisponível".

---

### RN03
Ao registrar a devolução, o status do livro deverá retornar para "Disponível".

---

### RN04
Livros com prazo de devolução vencido deverão ser identificados como atrasados.

---

### RN05
Livros em atraso permanecerão indisponíveis até que a devolução seja registrada.

---

### RN06
Um leitor só poed possuir 3 empréstimos ativos simultaneamente.

---

### RN07
Não poderá existir mais de um livro cadastrado com o mesmo ISBN.

---

### RN08
Todo empréstimo deverá possuir prazo máximo de devolução definido pela biblioteca.

---

### RN09
Leitores com empréstimos em atraso não poderão realizar novos empréstimos.

---

### RN10
Livros indisponíveis não deverão aparecer na listagem de empréstimo.
