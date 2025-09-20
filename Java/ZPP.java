import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class CopiarColar {
    public static String colarTexto() {
        try {
            // Pega a área de transferência
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            
            // Pega o conteúdo da área de transferência
            Transferable conteudo = clipboard.getContents(null);
            
            // Verifica se o conteúdo é uma string
            if (conteudo != null && conteudo.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                // Se for, pega a string e a retorna
                return (String) conteudo.getTransferData(DataFlavor.stringFlavor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Retorna nulo se não houver texto
    }
}
