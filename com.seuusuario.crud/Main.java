package com.seuusuario.crud;

import com.seuusuario.crud.model.User;
import com.seuusuario.crud.service.UserService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private final static UserService userService = new UserService();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int selectedOption = -1;

        while (selectedOption != 0) {
            System.out.println(("Bem vindo ao cadastro de usuários, selecione a operação desejada"));
            System.out.println("1 - Criar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar por ID");
            System.out.println("4 - Atualizar usuário");
            System.out.println("5 - Deletar usuário");
            System.out.println("0 - Sair");
            selectedOption = scanner.nextInt();
            scanner.nextLine();

            switch (selectedOption) {
                case 1:
                    createNewUser();
                    break;
                case 2:
                    listAllUsers();
                    break;
                case 3:
                    User user = findUserById();
                    if (user != null) {
                        System.out.println(user);
                    } else {
                        System.out.println("Usuário não encontrado");
                    }
                    break;
                case 4:
                    updateUser();
                    break;
                case 5:
                    deleteUser();
                    break;
            }
        }
    }

    private static void createNewUser() {
        User user = new User();
        System.out.println("Informe o nome do usuário");
        var name = scanner.nextLine();
        user.setName(name);

        System.out.println("Informe o email do usuário");
        var email = scanner.nextLine();
        user.setEmail(email);

        System.out.println("Informe a idade do usuário");
        var age = scanner.nextInt();
        scanner.nextLine();
        user.setAge(age);

        userService.createUser(user);
        System.out.println("Usuário criado com sucesso!");
    }

    private static User findUserById() {
        System.out.println("Informe o id do usuário");
        Long id = scanner.nextLong();
        scanner.nextLine();
        return userService.getUserById(id);
    }

    private static void listAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users.isEmpty()) {
            System.out.println("Nenhum usuário encontrado");
        }

        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void deleteUser() {
        System.out.println("Informe o id do usuário a ser deletado");
        Long id = scanner.nextLong();
        scanner.nextLine();
        boolean deleted = userService.deleteUser(id);
        if (deleted) {
            System.out.println(" ✔ Usuário deletado com sucesso");
        } else {
            System.out.println("❌ Usuário não encontrado");
        }
    }

    private static void updateUser() {
        System.out.println("Informe o id do usuário a ser atualizado");
        Long id = scanner.nextLong();
        User user = userService.getUserById(id);
        scanner.nextLine();

        if (user == null) {
            System.out.println("❌ Usuário não encontrado");
        } else {
            System.out.println("Informe o nome do usuário");
            var name = scanner.nextLine();
            user.setName(name);

            System.out.println("Informe o email do usuário");
            var email = scanner.nextLine();
            user.setEmail(email);

            System.out.println("Informe a idade do usuário");
            var age = scanner.nextInt();
            scanner.nextLine();
            user.setAge(age);
            userService.updateUser(user);
            System.out.println(" ✔ Usuário atualizado com sucesso");
        }
    }
}
