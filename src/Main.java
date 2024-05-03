import com.google.gson.Gson;
import conversorMonedas.modulo.Conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        float valor;
        String json;
        Conversor conversor;
        HttpClient client;
        HttpRequest request;
        HttpResponse<String> response;
        Gson gson = new Gson();
        boolean activado = true;

        while (activado) {
            System.out.println("""
                                        
                    1) Dolar ==> Peso Argentino
                    2) Peso Argentino => Dolar
                    3) Dolar ==> Real Brasileño
                    4) Real brasileño ==> Dolar
                    5) Dolar ==> Peso Colombiano
                    6) Peso Colombiano ==> Dólar
                    7) Salir
                    Elija una opción válida
                                        
                    **********************************************************
                    """);
            String respuesta = input.next();
            switch (respuesta) {
                case "1":
                    /*Realizar la conversión de Dolar ==> Peso Argentino */
                    try {
                        System.out.println("Digite el valor que desea convertir");
                        valor = input.nextFloat();
                        String url = "https://v6.exchangerate-api.com/v6/6d46ee3edb78df4591cc273f/pair/%s/%s/%f";
                        url = String.format(url, "USD", "ARS", valor);
                        client = HttpClient.newHttpClient();
                        request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        json = response.body();
                        conversor = gson.fromJson(json, Conversor.class);
                        conversor.setValor(valor);
                        System.out.println(conversor);
                    } catch (Exception e) {
                        System.out.println("Hubo un error" + e);

                    }

                    break;
                case "2":
                    /*Realizar la conversión de Peso Argentino ==> Dolar */
                    try {
                        System.out.println("Digite el valor que desea convertir");
                        valor = input.nextFloat();
                        String url = "https://v6.exchangerate-api.com/v6/6d46ee3edb78df4591cc273f/pair/%s/%s/%f";
                        url = String.format(url, "ARS", "USD", valor);
                        client = HttpClient.newHttpClient();
                        request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        json = response.body();
                        conversor = gson.fromJson(json, Conversor.class);
                        conversor.setValor(valor);
                        System.out.println(conversor);

                    } catch (Exception e) {
                        System.out.println("Hubo un error: " + e);
                    }
                    break;
                case "3":
                    /*Realizar la conversión de Dolar ==> Real Brasileño */
                    try {
                        System.out.println("Digite el valor que desea convertir");
                        valor = input.nextFloat();
                        String url = "https://v6.exchangerate-api.com/v6/6d46ee3edb78df4591cc273f/pair/%s/%s/%f";
                        url = String.format(url, "USD", "BRL", valor);
                        client = HttpClient.newHttpClient();
                        request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        json = response.body();
                        conversor = gson.fromJson(json, Conversor.class);
                        conversor.setValor(valor);
                        System.out.println(conversor);

                    } catch (Exception e) {
                        System.out.println("Hubo un error: " + e);
                    }
                    break;
                case "4":
                    /*Realizar la conversión de Real Brasileño ==> Dolar */
                    try {
                        System.out.println("Digite el valor que desea convertir");
                        valor = input.nextFloat();
                        String url = "https://v6.exchangerate-api.com/v6/6d46ee3edb78df4591cc273f/pair/%s/%s/%f";
                        url = String.format(url, "BRL", "USD", valor);
                        client = HttpClient.newHttpClient();
                        request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        json = response.body();
                        conversor = gson.fromJson(json, Conversor.class);
                        conversor.setValor(valor);
                        System.out.println(conversor);

                    } catch (Exception e) {
                        System.out.println("Hubo un error: " + e);
                    }
                    break;
                case "5":
                    /*Realizar la conversión de Dolar ==> Peso Colombiano */
                    try {
                        System.out.println("Digite el valor que desea convertir");
                        valor = input.nextFloat();
                        String url = "https://v6.exchangerate-api.com/v6/6d46ee3edb78df4591cc273f/pair/%s/%s/%f";
                        url = String.format(url, "USD", "COP", valor);
                        client = HttpClient.newHttpClient();
                        request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        json = response.body();
                        conversor = gson.fromJson(json, Conversor.class);
                        conversor.setValor(valor);
                        System.out.println(conversor);

                    } catch (Exception e) {
                        System.out.println("Hubo un error: " + e);
                    }
                    break;
                case "6":
                    /*Realizar la conversión de Peso Colombianos ==> Dolar */
                    try {
                        System.out.println("Digite el valor que desea convertir");
                        valor = input.nextFloat();
                        String url = "https://v6.exchangerate-api.com/v6/6d46ee3edb78df4591cc273f/pair/%s/%s/%f";
                        url = String.format(url, "COP", "USD", valor);
                        client = HttpClient.newHttpClient();
                        request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .build();
                        response = client
                                .send(request, HttpResponse.BodyHandlers.ofString());
                        json = response.body();
                        conversor = gson.fromJson(json, Conversor.class);
                        conversor.setValor(valor);
                        System.out.println(conversor);

                    } catch (Exception e) {
                        System.out.println("Hubo un error: " + e);
                    }
                    break;
                case "7":
                    System.out.println("Gracias por usar nuestro programa! :)");
                    activado = false;
                    break;
                default:
                    break;

            }

        }

    }
}
