package fabricas;

import documentos.Documento;
import documentos.Planinha;

public class FabricaPlanilha extends FabricaDocumento {

    @Override
    public Documento criarDocumento() {
        return new Planinha();
    }
}
