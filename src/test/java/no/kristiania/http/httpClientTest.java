package no.kristiania.http;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class httpClientTest {

    @Test
    void dummyTest() {
        assertEquals(42, 6*7);
    }

    @Test
    void shouldReturnStatusCode() throws IOException {
        httpClient client = new httpClient("httpbin.org", 80, "/html");
        assertEquals(200, client.getStatusCode());
    }

    @Test
    void shouldReturn404StatusCode() throws IOException {
        httpClient client = new httpClient("httpbin.org", 80, "/this-page.does-not-exist");
        assertEquals(404, client.getStatusCode());
    }

    @Test
    void shouldReturnHeaderFields() throws IOException {
        httpClient client = new httpClient("httpbin.org", 80, "/html");
        assertEquals("text/html; charset=utf-8", client.getHeader("Content-Type"));
    }

}