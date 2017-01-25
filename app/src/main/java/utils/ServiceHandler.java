package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by new on 6/16/2016.
 */
public class ServiceHandler {

    HttpURLConnection connection;
    String url;
    String mCharset = "UTF-8";
    String mRequest = null;


    public ServiceHandler(String url, String charset) {
        this.url = url;
        mCharset = charset;
    }


    public String getResponse() {
        StringBuilder mStringBuilder = new StringBuilder();
        try {

            URL mUrl = new URL(WebConstants.baseUrl + url);
            connection = (HttpURLConnection) mUrl.openConnection();
            connection.setUseCaches(false);
            connection.setRequestProperty("admin", "admin");
            connection.setRequestProperty("content", "json");
            connection.setRequestProperty("Authorization", "Basic YWRtaW46YWRtaW4=");
            connection.setDoOutput(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept-Charset", mCharset);
            connection.setReadTimeout(15000);
            connection.connect();
            // read the output from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            mStringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {
                mStringBuilder.append(line + "\n");
            }
            mRequest = mStringBuilder.toString();
        }
        catch (Exception ignored) {
        }
         return mRequest;
    }
}
