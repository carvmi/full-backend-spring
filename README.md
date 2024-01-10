# Sobre o Projeto 
Este projeto tem como objetivo implementar um sistema CRUD de estudantes utilizando as seguintes tecnologias:

    - Java
    - Spring Boot
    - JPA
    - PostgreSQL
    - IntelliJ IDEA Ultimate 
    
## Conceitos
### JPA
JPA (Java Persistence API) é uma API padrão da linguagem Java para acesso a dados em um banco de dados relacional. Ela fornece uma abstração de alto nível para operações de CRUD, permitindo que os desenvolvedores se concentrem na lógica de negócios, sem se preocupar com os detalhes da implementação do banco de dados.
### Java Persistence Query Language (JPQL)
JPQL (Java Persistence Query Language) é uma linguagem de consulta SQL-like que pode ser usada para consultar dados em um banco de dados usando JPA. Ela fornece uma sintaxe semelhante à SQL, mas com alguns recursos adicionais, como o suporte a consultas parametrizadas.
### Requisições
No contexto de um aplicativo web, uma requisição é uma solicitação feita pelo cliente ao servidor. As requisições podem ser feitas utilizando diferentes métodos HTTP, como GET, POST, PUT e DELETE.
### Uso de construtores
Os construtores são métodos especiais que são usados para inicializar um objeto. Eles são chamados quando um objeto é criado.
### Repositório
O repositório é uma interface que fornece acesso a dados em um banco de dados. Ele é responsável por abstrair a lógica de acesso a dados, permitindo que os desenvolvedores escrevam código que seja independente do banco de dados específico que está sendo usado.
### Controller 
um controller é uma classe responsável por receber requisições HTTP do usuário e gerar respostas. Ele é uma das camadas principais da arquitetura MVC (Model-View-Controller), que é um padrão de projeto de software amplamente utilizado em aplicações web.
### Business layer (Service)
A camada de negócio interage com a camada de acesso a dados (repositórios) para persistência de dados e permanece independente de preocupações de apresentação e infraestrutura.
### Relação entre Controller e Service
A relação entre Controller e Service é de dependência. O Controller depende do Service para obter os dados necessários para processar a requisição. Por exemplo, se uma requisição HTTP for recebida para criar um novo usuário, o Controller precisará chamar um método no Service para criar o usuário.
### Cálculo de idade com Period.between
O método Period.between() pode ser usado para calcular a diferença entre duas datas. No contexto deste projeto, o método Period.between() é usado para calcular a idade de um estudante.

## Anotações de Spring Boot
- @Autowired: é uma anotação usada para injetar dependências em um objeto.
- @Transactional: é uma anotação usada para marcar um método como transacional.
- @GetMapping: é uma anotação usada para mapear uma requisição HTTP GET para um método.
- @PostMapping: é uma anotação usada para mapear uma requisição HTTP POST para um método.
- @DeleteMapping: é uma anotação usada para mapear uma requisição HTTP DELETE para um método.
- @PutMapping: é uma anotação usada para mapear uma requisição HTTP PUT para um método.
- @PathVariable: é uma anotação usada para obter um valor de uma variável de caminho em uma requisição HTTP.
- @RequestParam: é uma anotação usada para obter um valor de um parâmetro de requisição em uma requisição HTTP.
- @Bean: é uma anotação usada para registrar um bean no contexto do Spring.
- @Transient: é uma anotação usada para indicar que um campo não deve ser persistido no banco de dados.
- @Id: é uma anotação usada para indicar que um campo é a chave primária de uma entidade.
- @SequenceGenerator: é uma anotação usada para gerar valores de chave primária sequenciais.
- @GeneratedValue: é uma anotação usada para indicar que o valor de uma chave primária deve ser gerado automaticamente.
- @Override: é uma anotação usada para indicar que um método está sobrescrevendo um método de uma superclasse.
