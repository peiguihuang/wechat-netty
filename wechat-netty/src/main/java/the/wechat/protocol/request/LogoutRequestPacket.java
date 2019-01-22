package the.wechat.protocol.request;

import lombok.Data;
import the.wechat.protocol.Packet;

import static the.wechat.protocol.command.Command.LOGOUT_REQUEST;

@Data
public class LogoutRequestPacket extends Packet {
    @Override
    public Byte getCommand() {

        return LOGOUT_REQUEST;
    }
}
