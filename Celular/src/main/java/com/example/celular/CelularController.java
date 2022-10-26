package com.example.celular;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    private Button botaoVisualizar;

    private Celular celular;

    private int contador;

    ArrayList<Celular> estoque = new ArrayList<Celular>();
    HashSet<String> chave = new HashSet<String>();
    HashMap<String, Celular> myDict = new HashMap<String, Celular>();

    @FXML
    void salvarDados(ActionEvent event) throws FileNotFoundException {
        Celular celular = new Celular();
        celular.setCor(campoCor.getText());
        celular.setTela(campoTela.getText());
        celular.setModelo(campoModelo.getText());
        celular.setGigabyte(campoTamanho.getText());
        celular.setTamanho(campoGigabyte.getText());
        setCelular(celular);
        contador = contador + 1;
        guardar(celular, ("c" + contador));
        myDict.put(("c" + contador), celular);
    }

    public void visualizarDados(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String mytext = "Estoque:";
        if (campoCelular.getText().equals("")) {
            for (String key : myDict.keySet()) {
                mytext = mytext + "\n" + "Chave: " + key + " Tela: " + myDict.get(key).getTela()
                        + " Modelo: " + myDict.get(key).getModelo() + " Cor: "
                        + myDict.get(key).getCor() + " Tamanho: "
                        + myDict.get(key).getTamanho() + "Gigabyte: "
                        + myDict.get(key).getGigabyte();

//                mytext = mytext + "test//";
            }
            alert.setContentText(mytext);
            alert.showAndWait();
        } else if(myDict.isEmpty()){
            alert.setContentText( "NÃO HÁ ESTOQUE");
            alert.showAndWait();
        }else{
            alert.setContentText( "Tela: " + myDict.get(campoCelular.getText()).getTela()
                    + " Modelo: " + myDict.get(campoCelular.getText()).getModelo() +
                    " Cor: " + myDict.get(campoCelular.getText()).getCor() +
                    " Tamanho: " + myDict.get(campoCelular.getText()).getTamanho() +
                    " Gigabyte: " + myDict.get(campoCelular.getText()).getGigabyte());
            alert.showAndWait();
        }
    }

    public void guardar(Celular celular, String chave){
        this.estoque.add(celular);
        this.chave.add(chave);
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Celular getCelular() {
        return this.celular;
    }
}


