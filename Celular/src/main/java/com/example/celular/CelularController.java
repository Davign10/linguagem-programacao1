package com.example.celular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import AcessoDAO.CelularDao;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CelularController {

    @FXML
    private TextField campoModelo;

    @FXML
    private TextField campoTela;

    @FXML
    private TextField campoTamanho;

    @FXML
    private TextField campoGigabyte;

    @FXML
    private TextField campoCor;

    @FXML
    private TextField campoCelular;

    @FXML
    private Button botaoSalvar;

    @FXML
    void salvarDados(ActionEvent event) throws Exception {
        Celular celular = new Celular();
        celular.setCor(campoCor.getText());
        celular.setTela(campoTela.getText());
        celular.setModelo(campoModelo.getText());
        celular.setTamanho(campoTamanho.getText());
        celular.setGigabyte(campoGigabyte.getText());

        CelularDao celularDao = new CelularDao();
        celularDao.salvar(celular);

    }
}


