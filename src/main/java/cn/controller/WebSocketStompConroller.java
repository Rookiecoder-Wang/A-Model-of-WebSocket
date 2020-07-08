package cn.controller;

import cn.websocket.Shout;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class WebSocketStompConroller {
    @MessageMapping("/marco")
    public void handleShout(Shout incoming)
    {
        System.out.println("Received message:"+incoming.getMessage());
    }
    @SubscribeMapping("/subscribe")
    public Shout handleSubscribe()
    {
        Shout  outing = new Shout();
        outing.setMessage("666666666666666");
        return outing;
    }
}