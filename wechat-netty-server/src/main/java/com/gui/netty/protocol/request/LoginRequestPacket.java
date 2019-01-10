package com.gui.netty.protocol.request;

import com.gui.netty.protocol.command.Packet;
import lombok.Data;

import static com.gui.netty.protocol.command.Command.LOGIN_REQUEST;

/**
 * 登录请求数据包
 *
 * @author 黄培桂
 * @create 2019-01-04 17:13
 **/

@Data
public class LoginRequestPacket extends Packet {
    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
