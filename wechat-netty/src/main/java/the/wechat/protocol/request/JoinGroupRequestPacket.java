package the.wechat.protocol.request;

import lombok.Data;
import the.wechat.protocol.Packet;

import static the.wechat.protocol.command.Command.JOIN_GROUP_REQUEST;

@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return JOIN_GROUP_REQUEST;
    }
}
