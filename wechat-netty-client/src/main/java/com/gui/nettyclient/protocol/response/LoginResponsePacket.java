package com.gui.nettyclient.protocol.response;

import com.gui.nettyclient.protocol.command.Packet;
import lombok.Data;

import static com.gui.nettyclient.protocol.command.Command.LOGIN_RESPONSE;

/**
 * 登录返回
 *
 * @author 黄培桂
 * @create 2019-01-08 11:38
 **/

@Data
public class LoginResponsePacket  extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
