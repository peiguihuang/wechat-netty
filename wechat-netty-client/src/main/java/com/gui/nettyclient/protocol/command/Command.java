package com.gui.nettyclient.protocol.command;

/**
 * 指令
 *
 * @author 黄培桂
 * @create 2019-01-04 17:13
 **/

public interface  Command {
    Byte LOGIN_REQUEST = 1;
    Byte LOGIN_RESPONSE = 2;


    Byte MESSAGE_REQUEST = 3;
    Byte MESSAGE_RESPONSE = 4;
}
