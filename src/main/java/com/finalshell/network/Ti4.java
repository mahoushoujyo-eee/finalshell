package com.finalshell.network;

import java.net.SocketException;

public class Ti4 extends SocketException {
   public String H;

   public Ti4(String var1, String var2) {
      super(var1);
      this.H = var2;
   }

   public String a() {
      return this.H;
   }
}





