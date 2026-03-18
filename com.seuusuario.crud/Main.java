package com.seuusuario.crud;

import com.seuusuario.crud.model.User;
import com.seuusuario.crud.service.UserService;

import java.util.Scanner;

public class Main {
    private final UserService userService = new UserService();
    private final static Scanner scanner = new Scanner(System.in);
    private final static User user = new User();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedOption = -1;

        while(selectedOption != 0){
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
                case 1 :
                    System.out.println("Informe o nome do usuário");

            }
        }




    }
        private static User userData(){
            System.out.println("Informe o nome do usuário");
            var name = scanner.next();
            user.setName(name);

            System.out.println("Informe o email do usuário");
            var email = scanner.next();
            user.setEmail(email);

            System.out.println("Informe a idade do usuário");
            var age = scanner.nextInt();
            user.setAge(age);

        };
}
