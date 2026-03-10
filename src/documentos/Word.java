package documentos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Word  implements Documento {

    @Override
    public void gerar() {
        String dataHora = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Gerando documento Word...");
        System.out.println("  Arquivo : documento.docx");
        System.out.println("  Data    : " + dataHora);
        System.out.println("  Status  : Pronto para edição interna.");
    }
}
