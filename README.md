# Bootcamp Project

Este projeto simula um sistema de gerenciamento de Bootcamp utilizando conceitos de Programação Orientada a Objetos (POO).

## Estrutura de Classes

- `Bootcamp`: Representa um bootcamp, contendo devs inscritos e conteúdos.
- `Conteudo`: Classe abstrata que serve como base para `Curso` e `Mentoria`.
- `Curso`: Representa um curso, estendendo `Conteudo`.
- `Mentoria`: Representa uma mentoria, estendendo `Conteudo`.
- `Dev`: Representa um desenvolvedor inscrito em um bootcamp.

## Como Executar

1. Compile todos os arquivos Java:
   ```sh
   javac -d out src/models/*.java src/Main.java
