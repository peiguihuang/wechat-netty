package the.wechat.protocol.command;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import org.junit.Assert;
import org.junit.Test;
import the.wechat.protocol.Packet;
import the.wechat.protocol.PacketCodec;
import the.wechat.protocol.request.LoginRequestPacket;
import the.wechat.serialize.Serializer;
import the.wechat.serialize.impl.JSONSerializer;

public class PacketCodecTest {
    @Test
    public void encode() {

        Serializer serializer = new JSONSerializer();
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();

        loginRequestPacket.setVersion(((byte) 1));
        loginRequestPacket.setUserName("zhangsan");
        loginRequestPacket.setPassword("password");

        PacketCodec packetCodec = PacketCodec.INSTANCE;
        ByteBuf byteBuf = ByteBufAllocator.DEFAULT.ioBuffer();

        packetCodec.encode(byteBuf, loginRequestPacket);
        Packet decodedPacket = packetCodec.decode(byteBuf);

        Assert.assertArrayEquals(serializer.serialize(loginRequestPacket), serializer.serialize(decodedPacket));

    }
}
