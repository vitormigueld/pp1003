import fabricas.*;
import documentos.*;

public class Main {
    public static void main(String[] args) {
        FabricaDocumento fabrica;
        Documento documento;

        System.out.println("== TESTE: PDF ==");
        fabrica   = new FabricaPdf();
        documento = fabrica.criarDocumento();
        documento.gerar();

        System.out.println();

        System.out.println("== TESTE: Word ==");
        fabrica   = new FabricaWord();
        documento = fabrica.criarDocumento();
        documento.gerar();

        System.out.println();

        System.out.println("== TESTE: Planilha ==");
        fabrica   = new FabricaPlanilha();
        documento = fabrica.criarDocumento();
        documento.gerar();
    }
}