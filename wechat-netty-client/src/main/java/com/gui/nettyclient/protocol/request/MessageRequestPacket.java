package com.gui.nettyclient.protocol.request;

import com.gui.nettyclient.protocol.command.Packet;
import lombok.Data;
import static com.gui.nettyclient.protocol.command.Command.MESSAGE_REQUEST;

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
