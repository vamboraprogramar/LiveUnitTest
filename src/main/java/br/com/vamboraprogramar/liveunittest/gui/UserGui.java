package br.com.vamboraprogramar.liveunittest.gui;

import br.com.vamboraprogramar.liveunittest.controller.UserController;
import br.com.vamboraprogramar.liveunittest.entity.User;
import br.com.vamboraprogramar.liveunittest.exceptions.InvalidFieldException;
import br.com.vamboraprogramar.liveunittest.exceptions.RequiredFieldException;
import br.com.vamboraprogramar.liveunittest.exceptions.UserNullException;
import br.com.vamboraprogramar.liveunittest.util.DateUtil;

import java.time.LocalDate;
import java.util.Scanner;

public class UserGui {

    private Scanner readKeyboard;
    private UserController userController;

    public UserGui(){
        readKeyboard = new Scanner(System.in);
        userController = new UserController();
    }

    public void add(){
        System.out.println("Digite o nome");
        String givenName = readKeyboard.nextLine();

        System.out.println("Digite o sobrenome");
        String surname = readKeyboard.nextLine();

        System.out.println("Digite (M) para masculino e (F) para Feminino");
        String gender = readKeyboard.nextLine();

        System.out.println("Digite a data de nascimento no formato DD/MM/YYYY");
        String birthDateString = readKeyboard.nextLine();
        LocalDate birthDate = DateUtil.toDate(birthDateString);

        User user = User.builder()
                .givenName(givenName.trim())
                .surname(surname.trim())
                .gender(gender.trim())
                .birthDate(birthDate)
                .build();

        try{
            userController.add(user);
        }catch (UserNullException | RequiredFieldException | InvalidFieldException e){
            System.out.println("Houve um erro ao cadastrar o Usuário "
                    + user.getGivenName() + ". Erro:" + e.getMessage());
        }

        System.out.println("Usuário " + user.getGivenName() + " cadastrado com sucesso.");
    }
}
