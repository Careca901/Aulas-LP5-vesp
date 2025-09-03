/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author u1845853
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);

        }
    }

    public static void limpar(JComponent... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            JComponent comp = componentes[i];
            //intanceof
            if (comp instanceof JTextField textField) {
                textField.setText("");
            } else if (comp instanceof JCheckBox checkBox) {
                checkBox.setSelected(false);
            } else if (comp instanceof JComboBox comboBox) {
                comboBox.setSelectedIndex(-1);
            } else if (comp instanceof JFormattedTextField formattedTextField) {
                formattedTextField.setText("");
            } else if (comp instanceof JPasswordField passwordField) {
                passwordField.setText("");
            }
        }

    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
        
    }
    public static boolean pergunta(String cad) {
        JOptionPane.showConfirmDialog(null, cad);
        return true;
    }
}
