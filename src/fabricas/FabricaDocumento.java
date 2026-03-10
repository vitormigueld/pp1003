package fabricas;

import documentos.Documento;

public abstract class FabricaDocumento {

    public abstract Documento criarDocumento();

    public void gerarDocumento() {
        Documento doc = criarDocumento();
        doc.gerar();
    }
}
