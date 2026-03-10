package documentos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Planinha implements Documento {

    @Override
    public void gerar() {
        String dataHora = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Gerando documento Planinha...");
        System.out.println("  Arquivo : documento.xlsx");
        System.out.println("  Data    : " + dataHora);
        System.out.println("  Status  : Pronta para relatórios e controles.");
    }
}
