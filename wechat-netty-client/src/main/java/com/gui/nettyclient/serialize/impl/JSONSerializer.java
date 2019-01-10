package com.gui.nettyclient.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.gui.nettyclient.serialize.Serializer;
import com.gui.nettyclient.serialize.SerializerAlogrithm;

/**
 * 序列化实现类
 *
 * @author 黄培桂
 * @create 2019-01-04 17:22
 **/

public class JSONSerializer implements Serializer {
    @Override
    public byte getSerializerAlogrithm() {
        return SerializerAlogrithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}
