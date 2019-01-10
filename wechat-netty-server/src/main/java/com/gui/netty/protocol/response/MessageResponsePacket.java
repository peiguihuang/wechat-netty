package com.gui.netty.protocol.response;

import com.gui.netty.protocol.command.Packet;
import lombok.Data;

import static com.gui.netty.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @author 黄培桂
 * @create 2019-01-08 13:41
 **/

@Data
public class MessageResponsePacket extends Packet {
    private String message;

    @Override
    public Byte getCommand() {

        return MESSAGE_RESPONSE;
    }
}
