package com.acuity.http.api.websockets;

import com.acuity.http.api.AcuityHttpClient;
import com.acuity.http.api.util.JsonUtil;
import com.acuity.http.api.websockets.message.Message;
import com.acuity.http.api.websockets.message.MessageManager;
import com.google.gson.JsonElement;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.HashMap;

/**
 * Created by Zachary Herridge on 6/12/2017.
 */
public class AcuityWSClient extends WebSocketListener implements AutoCloseable{

    private static final Logger logger = LoggerFactory.getLogger(AcuityWSClient.class);

    private final OkHttpClient client = new OkHttpClient();
    private WebSocket webSocket;
    private MessageManager messageManager;

    public void connect(){
        Request request = new Request.Builder()
                .url(AcuityHttpClient.WS_BASE_URL)
                .build();
        webSocket = client.newWebSocket(request, this);
        messageManager = new MessageManager(this);
    }

    public WebSocket getWebSocket() {
        return webSocket;
    }

    @Override
    public void onMessage(WebSocket webSocket, String text) {
        if (messageManager != null) messageManager.handleMessage(JsonUtil.getGSON().fromJson(text, Message.class));
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        logger.info("Websocket {} opened", webSocket);
        messageManager.send(new Message().putHeader("command", "sup").setBody("asdasdas"));
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        logger.info("Websocket {} closed: {}/{}", webSocket, code, reason);
        this.webSocket = null;
    }

    @Override
    public void close() throws Exception {
        if (webSocket != null){
            webSocket.close(1000, null);
        }
    }

    public static void main(String[] args) {
        new AcuityWSClient().connect();
    }
}
