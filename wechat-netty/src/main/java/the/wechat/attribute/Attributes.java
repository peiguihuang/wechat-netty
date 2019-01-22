package the.wechat.attribute;

import io.netty.util.AttributeKey;
import the.wechat.session.Session;

public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}
