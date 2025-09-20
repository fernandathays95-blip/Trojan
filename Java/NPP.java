public class Main {
    public static void main(String[] args) {
        // 1. Copia um texto para a área de transferência
        CopiarColar.copiarTexto("Este é um texto de teste.");
        
        // 2. Cola o texto da área de transferência e o imprime
        String textoColado = CopiarColar.colarTexto();
        if (textoColado != null) {
            System.out.println("Texto colado: " + textoColado);
        }
    }
}
