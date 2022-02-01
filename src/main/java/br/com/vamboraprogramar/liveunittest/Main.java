package br.com.vamboraprogramar.liveunittest;

import br.com.vamboraprogramar.liveunittest.gui.UserGui;

import java.util.Scanner;

public class Main {

    private static final int OPTION_EXIT = 0;
    private static final int OPTION_ADD_USER = 1;

    public static void main(String[] args) {
        UserGui userGui = new UserGui();
        Scanner readKeyboard = new Scanner(System.in);
        int op = -1;

        System.out.println("Bem vindo ao sistema exemplo para live de testes");

        do{
            System.out.println("\n");
            System.out.println("-----------------------------------------------");
            System.out.println("Selecione a opção desejada");
            System.out.println(OPTION_EXIT + " - Sair");
            System.out.println(OPTION_ADD_USER + " - Cadastrar usuário");

            op = readKeyboard.nextInt();
            readKeyboard.nextLine();

            switch (op){
                case OPTION_ADD_USER: userGui.add();
            }
        }while (op != OPTION_EXIT);

        System.out.println("Obrigado por usar nosso sistema");
    }
}
