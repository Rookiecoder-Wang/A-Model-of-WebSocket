package cn.websocket;

import org.springframework.web.socket.*;

public class SocketHandler implements WebSocketHandler {
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("WebSocket连接成功！");
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        System.out.println("服务端已经接收到消息:"+message.toString());
        message = new TextMessage("123456");
        session.sendMessage(message);
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        System.out.println("异常信息："+exception.getMessage());
        WebSocketMessage<String> message = new TextMessage("异常信息："+exception.getMessage());
        session.sendMessage(message);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        System.out.println("WebSocket关闭");
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
