
package view.manage;

import control.ListaUsuarioController;
import control.TelaPrincipalController;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Usuario;


public class listausuarioabre {
    
    
    private static Stage stage;


      
    
    public void abreTela() {
        try {
            start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(listausuarioabre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void fecharTela(){
        
        stage.close();
    }
    

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/ListaUsuario.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        listausuarioabre.stage=stage;
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    public void abreTela(Usuario u) {
        TelaPrincipalController.setLog(u);
    }
    
}
