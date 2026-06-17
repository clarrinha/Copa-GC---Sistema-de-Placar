# Copa GC

Sistema de gerenciamento de uma Copa do Mundo simplificada desenvolvido em Java utilizando Programação Orientada a Objetos (POO).

---

##  Objetivo

O sistema permite:

- Cadastrar seleções participantes;
- Registrar partidas e seus resultados;
- Consultar seleções por grupo;
- Visualizar artilheiros;
- Calcular a classificação dos grupos;
- Simular uma Copa do Mundo através de um menu interativo.

---

##  Estrutura do Projeto

```text
COPA-GC---SISTEMA-DE-PLACAR/
├── src/
│   ├── model/
│   │   ├── Selecao.java
│   │   └── Partida.java
│   ├── service/
│   │   └── Copa.java
│   ├── util/
│   │   └── CargaInicial.java
│   └── Main.java
├── .gitignore
└── README.md
```

---

##  Arquitetura do Sistema

###  model

Responsável pelas entidades do sistema.

#### Selecao.java

Representa uma seleção participante da Copa.

**Atributos:**

```java
private String nome;
private char grupo;
private String codigoFIFA;
```

**Responsabilidades:**

- Armazenar informações da seleção;
- Disponibilizar getters;
- Sobrescrever o método `toString()`.

#### Partida.java

Representa uma partida da Copa.

**Atributos:**

```java
private Selecao mandante;
private Selecao visitante;
private int golsA;
private int golsB;
```

**Responsabilidades:**

- Armazenar os dados da partida;
- Disponibilizar getters;
- Sobrescrever o método `toString()`.

---

### service

Responsável pelas regras de negócio.

#### Copa.java

Gerencia toda a competição.

**Coleções utilizadas:**

```java
List<Selecao> selecoes;
List<Partida> partidas;
List<String> artilheiros;
```

**Métodos principais:**

```java
adicionarSelecao()
registrarPartida()
listarGrupo()
topArtilheiros()
calcularClassificacao()
```

**Responsabilidades:**

- Gerenciar seleções;
- Registrar partidas;
- Listar grupos;
- Exibir artilheiros;
- Calcular classificação.

---



### Main.java

Ponto de entrada da aplicação.

**Responsabilidades:**

- Inicializar o sistema;
- Carregar os dados iniciais;
- Exibir o menu principal;
- Receber entradas do usuário via Scanner;
- Chamar os métodos da classe Copa.

---

##  Funcionalidades

### 1. Adicionar Seleção

Permite cadastrar novas seleções na competição.

### 2. Registrar Partida

Permite registrar o resultado de uma partida.

### 3. Consultar Grupo

Exibe todas as seleções de um grupo específico.

### 4. Ver Artilheiros

Mostra os artilheiros cadastrados.

### 5. Classificação

Calcula e exibe a classificação atual dos grupos.

---


## 💻 Tecnologias Utilizadas

```text
Java
Programação Orientada a Objetos (POO)
Collections Framework
Scanner
ArrayList
```

---

## 📚 Conceitos Aplicados

- Encapsulamento;
- Classes e Objetos;
- Pacotes;
- Listas (ArrayList);
- Separação de Responsabilidades;
- Manipulação de Dados;
- Estruturas de Controle.

---

## ▶Como Executar

### Compilar

```bash

```

### Executar

```bash

```

---

## 👨‍💻 Equipe

- Gabriel Saraiva 
- Maria Clara 
- Rafael Fagner 
- Pedro Luis

---
