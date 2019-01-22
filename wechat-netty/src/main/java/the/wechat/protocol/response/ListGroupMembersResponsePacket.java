package the.wechat.protocol.response;

import lombok.Data;
import the.wechat.protocol.Packet;
import the.wechat.session.Session;

import java.util.List;

import static the.wechat.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {

        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
