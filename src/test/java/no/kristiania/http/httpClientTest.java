package no.kristiania.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class httpClientTest {

    @Test
    void dummyTest() {
        assertEquals(42, 6*7);
    }

    @Test
    void shouldReturnStatusCode() {
        httpClient client = new httpClient("httpbin.org", 80, "/html");
        assertEquals(200, client.getStatusCode());
    }

}