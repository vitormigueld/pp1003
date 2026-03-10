package documentos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pdf implements Documento{
    public void gerar() {
        String dataHora = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Gerando documento PDF...");
        System.out.println("  Arquivo : documento.pdf");
        System.out.println("  Data    : " + dataHora);
        System.out.println("  Status  : Pronto para envio ao cliente e arquivamento.");
    }
}
