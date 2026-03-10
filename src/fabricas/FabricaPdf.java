package fabricas;

import documentos.Documento;
import documentos.Pdf;

public class FabricaPdf extends FabricaDocumento {

    @Override
    public Documento criarDocumento() {
        return new Pdf();
    }
}
