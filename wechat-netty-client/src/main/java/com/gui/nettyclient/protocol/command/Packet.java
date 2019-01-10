package com.gui.nettyclient.protocol.command;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 通用数据包
 *
 * @author 黄培桂
 * @create 2019-01-04 17:15
 **/


@Data
public abstract  class Packet {
    /**
     * 协议版本
     */
    @JSONField(deserialize = false, serialize = false)
    private Byte version = 1;


    @JSONField(serialize = false)
    public abstract Byte getCommand();
}
