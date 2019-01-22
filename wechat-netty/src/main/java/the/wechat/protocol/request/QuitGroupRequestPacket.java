package the.wechat.protocol.request;

import lombok.Data;
import the.wechat.protocol.Packet;

import static the.wechat.protocol.command.Command.QUIT_GROUP_REQUEST;

@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {

        return QUIT_GROUP_REQUEST;
    }
}
