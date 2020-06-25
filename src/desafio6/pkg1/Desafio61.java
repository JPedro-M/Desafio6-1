package desafio6.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author troll
 */
public class Desafio61 {
    public static void main(String[] args) {
        int rato, coelho, codigo, experiencia, quantidade, total;
        
        experiencia = 0;
        rato = 0;
        coelho = 0;
        while(experiencia < 15) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ratos e 2 para coelho."));
            if (codigo == 1 || codigo == 2) {
                if (codigo == 1) {
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de ratos?"));
                    rato += quantidade;
                    experiencia += 1;
                }else if (codigo == 2) {
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidades de coelhos?"));
                    coelho += quantidade;
                    experiencia += 1;
                }
            }else {
                JOptionPane.showMessageDialog(null, "Esse código é invalido.");
            }
        }
        total = rato + coelho;
        JOptionPane.showMessageDialog(null, "Total de cobaias: "+total+"\n____________________\nTotal de ratos: "+rato+"\nTotal de coelhos: "+coelho);
    }
}
