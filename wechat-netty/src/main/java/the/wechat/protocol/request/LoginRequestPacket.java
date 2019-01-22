package the.wechat.protocol.request;

import lombok.Data;
import the.wechat.protocol.Packet;

import static the.wechat.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {
    private String userName;

    private String password;

    @Override
    public Byte getCommand() {

        return LOGIN_REQUEST;
    }
}
