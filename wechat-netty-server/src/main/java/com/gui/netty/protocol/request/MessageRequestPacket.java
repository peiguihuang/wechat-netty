package com.gui.netty.protocol.request;

import com.gui.netty.protocol.command.Packet;
import lombok.Data;

import static com.gui.netty.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @author 黄培桂
 * @create 2019-01-08 13:36
 **/

@Data
public class MessageRequestPacket extends Packet {
    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
