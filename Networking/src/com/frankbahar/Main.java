package com.frankbahar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {

  //          URL url = new URL("http://example.org/somepage.html");
            URL url = new URL("https://api.flickr.com/services/feeds/photos_public.gne?tags=dogs");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);
            int x = 10, y=0;
             x/=y;
            //System.out.println(z);
            int responseCode = connection.getResponseCode();
            System.out.println("Response code: " + responseCode);
            if (responseCode != 200){
                System.out.println(connection.getResponseMessage());
                System.out.println("Error reading web page");
                return;
            }
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
           String line = "";
            while((line = inputStream.readLine()) != null){
                System.out.println(line);
            }
            inputStream.close();


//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//            BufferedReader inputStream = new BufferedReader(
//                    new InputStreamReader((urlConnection.getInputStream())));
//            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
//            for(Map.Entry<String, List<String>> entry: headerFields.entrySet()){
//                String key = entry.getKey();
//                List<String> value = entry.getValue();
//                System.out.println("-----key = " + key);
//                for(String string: value){
//                    System.out.println("value = " + string);
//                }
//            }

//           String line = "";
//            while(line!=null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
            //           URI uri = url.toURI();

//            BufferedReader inputStream = new BufferedReader(
//                    new InputStreamReader((url.openStream())));
//            String line = "";
//            while(line!=null){
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
 //           URI uri = url.toURI();

      //    URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#samsung");

//            URI baseUri = new URI("http://username:password@mynewserver.com:5000");
//            URI uri1 = new URI("/catalogue/phones?os=android#samsung");
//            URI uri2 = new URI("/catalogue/tvs?manufacturer=samsung");
//            URI uri3 = new URI("/stores/locations?zip=12345");
//
//            URI resultUri1 = baseUri.resolve(uri1);
//            URI resultUri2 = baseUri.resolve(uri2);
//            URI resultUri3 = baseUri.resolve(uri3);
//
//            URL url1 = resultUri1.toURL();
//            System.out.println("URL = " + url1);
//            URL url2 = resultUri2.toURL();
//            System.out.println("URL = " + url2);
//            URL url3 = resultUri3.toURL();
//            System.out.println("URL = " + url3);
//
//            URI relativizedURI = baseUri.relativize(resultUri2);
//            System.out.println("Releative URI = " + relativizedURI);

//            System.out.println("Scheme: " + uri.getScheme());
//            System.out.println("Scheme-specific part: " + uri.getSchemeSpecificPart());
//            System.out.println("Authority: " + uri.getAuthority());
//            System.out.println("User info: " + uri.getUserInfo());
//            System.out.println("Host: " + uri.getHost());
//            System.out.println("Port: " + uri.getPort());
//            System.out.println("Path: " + uri.getPath());
//            System.out.println("Query: " + uri.getQuery());
//            System.out.println("Fragment: " + uri.getFragment());
        } catch (MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (IOException e){
            System.out.println("IIOException: " + e.getMessage());
        }
    }
}
