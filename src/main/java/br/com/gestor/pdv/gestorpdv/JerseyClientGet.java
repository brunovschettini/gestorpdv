package br.com.gestor.pdv.gestorpdv;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {

    public static void main(String[] args) {
        try {

            Client client = Client.create();
            WebResource webResource
                    = client.resource("http://localhost:8080/gestor/ws/auth/in")
                            .queryParam("username", "ilines")
                            .queryParam("password", "989899");

            ClientResponse response = webResource
                    .post(ClientResponse.class);
            

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
