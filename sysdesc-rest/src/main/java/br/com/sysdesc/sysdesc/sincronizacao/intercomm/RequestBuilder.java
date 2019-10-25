package br.com.sysdesc.sysdesc.sincronizacao.intercomm;

import feign.Feign;
import feign.Feign.Builder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;

public class RequestBuilder {

    private RequestBuilder() {

    }

    public static Builder build() {

        return Feign.builder().encoder(new GsonEncoder()).decoder(new GsonDecoder()).logger(new Slf4jLogger());
    }
}
