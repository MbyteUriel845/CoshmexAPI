package com.coshmex.store.config;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.xml.MappingJackson2XmlView;

@Component
public class Currency {

    @Scheduled(cron = "*/15 * * * * *")
    public static Double conversion() {

        String url = "https://api.exchangerate.host/latest?base=USD&symbols=MXN";
        StringBuffer sb = new StringBuffer(url);

        Double convert = null;

        DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
        defaultClientConfig.getClasses().add(MappingJackson2XmlView.class);
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource webresource = client.resource(sb.toString());

        convert = Double.valueOf(webresource.get(String.class).split("MXN")[1].split(":")[1].split("}")[0].trim());

        return convert;

    }
}
