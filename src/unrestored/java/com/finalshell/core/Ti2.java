package com.finalshell.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ti2 extends TN {
   public String w;
   public String V;

   public Ti2(String var1, String var2) {
      this.n = Dq2.M;
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);

      try {
         var4.writeShort(this.n);
         var4.writeInt(var1.getBytes().length);
         var4.write(var1.getBytes());
         var4.writeInt(var2.getBytes().length);
         var4.write(var2.getBytes());
         this.u = var3.toByteArray();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public Ti2(byte[] var1) {
      this.n = Dq2.M;
      ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
      DataInputStream var3 = new DataInputStream(var2);

      try {
         this.n = var3.readShort();
         byte[] var4 = new byte[var3.readInt()];
         var3.read(var4);
         this.V = new String(var4);
         byte[] var5 = new byte[var3.readInt()];
         var3.read(var5);
         this.w = new String(var5);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public String X() {
      return this.w;
   }

   public void H(String var1) {
      this.w = var1;
   }

   public String t() {
      return this.V;
   }

   public void P(String var1) {
      this.V = var1;
   }
}





