package the.wechat.protocol.response;

import lombok.Data;
import the.wechat.protocol.Packet;

import static the.wechat.protocol.command.Command.LOGOUT_RESPONSE;

@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {

        return LOGOUT_RESPONSE;
    }
}
