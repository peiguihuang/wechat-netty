package com.gui.nettyclient.attribute;

import io.netty.util.AttributeKey;

/**
 * @author 黄培桂
 * @create 2019-01-08 13:34
 **/

public interface  Attributes {
    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");

}
