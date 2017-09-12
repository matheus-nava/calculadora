/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Calc extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage){
        VBox orq = new VBox();
        orq.setSpacing(10);
        orq.setStyle("-fx-padding: 10px; -fx-background-color: rgb(150, 65, 78)");
        
        TextField ativo = new TextField();
        TextField passivo = new TextField();
        Label result = new Label("Olá Planeta Terra!!!");
        
        Button somar = new Button("Somar");
        Button sub = new Button("Subtrair");
        Button div = new Button("Dividir");
        Button mult = new Button("Multiplicar");
        Button surp = new Button("SURPRISE!!!");
        
        somar.setOnAction( new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent x) {
                String valorNum1 = ativo.getText();
                String valorNum2 = passivo.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble + num2EmDouble;
                result.setText( "Resultado é: "+numResultado);
            }
        } );
        
        sub.setOnAction( new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent x) {
                String valorNum1 = ativo.getText();
                String valorNum2 = passivo.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble - num2EmDouble;
                result.setText( "Resultado é: "+numResultado);
            }
        } );
        
        mult.setOnAction( new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent x) {
                String valorNum1 = ativo.getText();
                String valorNum2 = passivo.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble * num2EmDouble;
                result.setText( "Resultado é: "+numResultado);
            }
        } );
        
        div.setOnAction( new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent x) {
                String valorNum1 = ativo.getText();
                String valorNum2 = passivo.getText();
                double ativoBimbao = Double.parseDouble(valorNum1);
                double passivoBimbado = Double.parseDouble(valorNum2);
                double bimbada = ativoBimbao / passivoBimbado;
                result.setText( "Resultado é: "+bimbada);
            }
        } );
        
        surp.setOnAction( new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent x) {
                
               // VBox img = new VBox();
                Button voltar = new Button("Voltar");
                //img.setStyle("-fx-background-image: url(\"duckiekingdom.jpg\")");
                //Scene Gif = new Scene(img, 500, 400);
                
                ImageView img = new ImageView();
                Image dImg = new Image("/duckiekingdom.jpg");
                img.setImage(dImg);
                
                /*voltar.setOnAction( new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent x) {
                        stage.setScene(finish);
                        stage.setTitle("Desculpa, Professor");
                        stage.show();
                    }
                } );*/
                
                //stage.setScene(Gif);
                //stage.setTitle("Gif");
                //stage.show();
            }
        } );
        
        HBox botoes = new HBox();
        
        botoes.setSpacing(10);
        botoes.setMargin(somar, new Insets(0, 0, 0, 65));
        
        botoes.getChildren().add(somar);
        botoes.getChildren().add(sub);
        botoes.getChildren().add(mult);
        botoes.getChildren().add(div);
        botoes.getChildren().add(surp);
        
        orq.getChildren().add(ativo);
        orq.getChildren().add(passivo);
        orq.getChildren().add(botoes);
        orq.getChildren().add(result);
        
        Scene finish = new Scene(orq, 500, 400);
        
        stage.setScene(finish);
        stage.setTitle("Desculpa, professor");
        stage.show();
        
    }
    
}
