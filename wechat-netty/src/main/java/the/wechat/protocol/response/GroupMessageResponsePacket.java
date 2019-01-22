package the.wechat.protocol.response;

import lombok.Data;
import the.wechat.protocol.Packet;
import the.wechat.session.Session;

import static the.wechat.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
