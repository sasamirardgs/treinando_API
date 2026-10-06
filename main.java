import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {
    HttpClient cliente = HttpClient.newHttpClient();
    String endereco = "https://dog.ceo/api/breeds/image/random";

    HttpRequest requisicao = HttpRequest.newBuilder()
        .uri(URI.create(endereco))
        .GET()
        .build();

        HttpResponse<String> resposta = cliente.send(requisicao,
        HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());

    }

}
