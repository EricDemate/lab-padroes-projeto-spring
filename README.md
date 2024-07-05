# Explorando Padrões de Projetos na Prática com Java

Bem-vindo ao repositório dedicado ao Lab "Explorando Padrões de Projetos na Prática com Java". Aqui você encontrará implementações dos padrões de projeto usando o Spring Framework, focando em promover boas práticas de design e reutilização de código.

## Padrões de Projeto Implementados

### Singleton

O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância. Em nosso projeto, ele é utilizado para garantir que certos serviços sejam únicos e acessíveis de maneira consistente.

### Strategy/Repository

O padrão Strategy permite definir famílias de algoritmos encapsulados e intercambiáveis. No contexto do Spring, ele é aplicado em serviços que utilizam diferentes estratégias de persistência de dados (Repository Pattern), permitindo flexibilidade na escolha da implementação sem modificar a lógica de negócio.

### Facade

O padrão Facade simplifica a interação com subsistemas complexos, fornecendo uma interface unificada. Em nossos controladores, ele abstrai a lógica de integração com serviços e repositórios, oferecendo uma API coesa e fácil de usar.

## Estrutura do Projeto

- `src/main/java`: Contém o código-fonte Java da aplicação, incluindo entidades, repositórios, serviços e controladores.
  
- `src/main/resources`: Contém recursos não Java, como arquivos de configuração (`application.properties` ou `application.yml`).

## Como Executar

1. **Importe o projeto em sua IDE favorita.**

2. **Configure as dependências e o ambiente conforme necessário.**

3. **Execute a classe principal `Application.java` para iniciar a aplicação.**

4. **Explore a documentação da API gerada automaticamente pelo Swagger em:**


