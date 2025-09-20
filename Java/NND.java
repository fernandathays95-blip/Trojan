import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CopiarColar {
    public static void copiarTexto(String texto) {
        // Cria um objeto que "seleciona" o texto que você quer copiar
        StringSelection stringSelection = new StringSelection(texto);
        
        // Pega a área de transferência do sistema
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
        // Coloca a "seleção" na área de transferência
        clipboard.setContents(stringSelection, null);
        
        System.out.println("Texto copiado para a área de transferência!");
    }
}
