package the.wechat.protocol.request;

import the.wechat.protocol.Packet;

import static the.wechat.protocol.command.Command.HEARTBEAT_REQUEST;

public class HeartBeatRequestPacket extends Packet {
    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
