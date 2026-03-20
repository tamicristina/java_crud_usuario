# 📚 CRUD de Usuários em Java (Console)

## 🚀 Sobre o projeto

Este projeto é uma aplicação simples de **CRUD (Create, Read, Update, Delete)** desenvolvida em **Java puro**, com o objetivo de praticar:

* Fundamentos da linguagem Java
* Programação Orientada a Objetos (POO)
* Estrutura em camadas (Model, Repository, Service)
* Manipulação de dados em memória (ArrayList)
* Interação com o usuário via terminal (Scanner)

A aplicação roda no **console** e permite gerenciar usuários de forma interativa.

---

## ⚙️ Funcionalidades

O sistema permite:

* ✅ Criar um usuário
* 📋 Listar todos os usuários
* 🔍 Buscar usuário por ID
* ✏️ Atualizar dados de um usuário
* ❌ Deletar usuário

---

## 🧱 Estrutura do projeto

O projeto segue uma organização em camadas:

```
com.seuusuario.crud
│
├── model
│   └── User.java
│
├── repository
│   └── UserRepository.java
│
├── service
│   └── UserService.java
│
└── Main.java
```

### 📌 Descrição das camadas:

* **Model** → Representa a entidade (`User`)
* **Repository** → Responsável por armazenar e manipular os dados (ArrayList)
* **Service** → Contém a lógica de negócio
* **Main** → Interface com o usuário (menu no console)

---

## 🛠️ Tecnologias utilizadas

* Java 21
* IntelliJ IDEA
* Programação Orientada a Objetos (POO)
* Estrutura em camadas

---

## 📋 Requisitos

Antes de rodar o projeto, você precisa ter instalado:

* Java JDK 21 ou superior
* IntelliJ IDEA (ou outra IDE Java)

---

## ▶️ Como executar o projeto

### 🔹 1. Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

### 🔹 2. Abrir na IDE

Abra o projeto no IntelliJ IDEA (ou outra IDE de sua preferência).

---

### 🔹 3. Executar a aplicação

* Localize a classe `Main.java`
* Execute o método `main`

---

### 🔹 4. Usar o sistema

Ao rodar, você verá o menu no terminal:

```
1 - Criar usuário
2 - Listar usuários
3 - Buscar por ID
4 - Atualizar usuário
5 - Deletar usuário
0 - Sair
```

Digite a opção desejada e siga as instruções.

---

## 💡 Observações

* Os dados são armazenados em memória (ArrayList), ou seja:

  * Ao encerrar a aplicação, os dados são perdidos
* O ID dos usuários é gerado automaticamente (auto-incremento)

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com foco em aprendizado, sendo ideal para:

* Quem está começando em Java
* Praticar lógica de programação
* Entender separação de responsabilidades (camadas)
* Preparação para frameworks como Spring Boot

