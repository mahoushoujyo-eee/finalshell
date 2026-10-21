package com.finalshell.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public interface PJ3 {
   Socket y(String var1, int var2) throws IOException, UnknownHostException;

   InputStream j(Socket var1) throws IOException;

   OutputStream P(Socket var1) throws IOException;
}





