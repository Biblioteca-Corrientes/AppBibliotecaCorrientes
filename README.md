# AppBibliotecaCorrientes
Sistema web desenvolvido para gerenciamento de empréstimos de livros da Biblioteca Corrientes, uma biblioteca comunitária voltada ao incentivo da leitura e compartilhamento de conhecimento.

Este repositório contém a aplicação principal responsável pelo controle do acervo, cadastro de leitores e gerenciamento de empréstimos.

### Objetivo do Projeto

O sistema foi desenvolvido com foco na organização do fluxo de empréstimos de livros físicos, permitindo que bibliotecários realizem o controle completo do acervo e dos leitores cadastrados.

A aplicação busca automatizar processos como:

Cadastro de livros
Controle de disponibilidade
Registro de empréstimos
Controle de devoluções
Monitoramento de atrasos

### Perfis do Sistema

-> Bibliotecário
Responsável pela administração do sistema.

Funcionalidades:
Cadastrar livros
Editar informações do acervo
Registrar empréstimos
Registrar devoluções
Consultar livros atrasados
Gerenciar leitores cadastrados

-> Leitor
Usuário responsável pelos empréstimos de livros.

Funcionalidades:
Consultar livros disponíveis
Visualizar empréstimos realizados
Acompanhar datas de devolução


### Funcionalidades Principais
-> Gerenciamento de Livros

Cada livro possui:
Título
Autor
ISBN
Status de disponibilidade

O sistema controla automaticamente a disponibilidade do livro durante empréstimos e devoluções.

-> Sistema de Empréstimos

O empréstimo vincula:
Um leitor
Um livro
Data do empréstimo
Data prevista de devolução
Regras de negócio

Apenas livros disponíveis podem ser emprestados
Livros emprestados ficam com status Indisponível
Após devolução, o livro retorna ao status Disponível
Empréstimos atrasados podem ser consultados pelo bibliotecário

-> Controle de Atrasos
O sistema realiza o acompanhamento das datas previstas de devolução para identificar livros em atraso.

Isso permite:
Melhor controle do acervo
Organização dos empréstimos
Facilidade de acompanhamento pela administração

### Tecnologias Utilizadas
As tecnologias serão adicionadas conforme a evolução do projeto.

Exemplo:
HTML
CSS
JavaScript
Java
Spring Boot
MySQL
Git & GitHub

### Estrutura do Projeto
biblioteca-corrientes/
│
├── backend/
├── frontend/
├── database/
├── docs/
└── README.md

### Objetivo Acadêmico
Projeto desenvolvido para a disciplina de Programação para Web, com evolução incremental ao longo do semestre, aplicando conceitos de:

Desenvolvimento web
Modelagem de sistemas
Regras de negócio
Controle de versionamento
Organização de projetos
Integração entre frontend e backend

### Requisitos Funcionais
Cadastro de livros com ISBN e autor
Cadastro de leitores
Registro de empréstimos
Registro de devoluções
Atualização automática de status dos livros
Listagem de livros em atraso


📖 Biblioteca Corrientes

“Uma biblioteca é uma ponte entre pessoas e conhecimento.”

Este sistema busca transformar o gerenciamento da biblioteca em um processo simples, organizado e acessível.
