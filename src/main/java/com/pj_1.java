/*
 * Decompiled with CFR 0.152.
 */
package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Renamed from com.pJ
 */
public interface pj_1 {
    public Socket y(String var1, int var2) throws IOException, UnknownHostException;

    public InputStream j(Socket var1) throws IOException;

    public OutputStream P(Socket var1) throws IOException;
}

