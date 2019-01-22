package the.wechat.protocol.request;

import lombok.Data;
import the.wechat.protocol.Packet;

import java.util.List;

import static the.wechat.protocol.command.Command.CREATE_GROUP_REQUEST;

@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_REQUEST;
    }
}
