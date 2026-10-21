package com.finalshell.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TD extends TN {
   public String D;
   public String L;

   public TD(String var1, String var2) {
      this.n = Dq2.Z;
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

   public TD(byte[] var1) {
      this.n = Dq2.Z;
      ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
      DataInputStream var3 = new DataInputStream(var2);

      try {
         this.n = var3.readShort();
         byte[] var4 = new byte[var3.readInt()];
         var3.read(var4);
         this.L = new String(var4);
         byte[] var5 = new byte[var3.readInt()];
         var3.read(var5);
         this.D = new String(var5);
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public String x() {
      return this.D;
   }

   public void m(String var1) {
      this.D = var1;
   }

   public String T() {
      return this.L;
   }

   public void Z(String var1) {
      this.L = var1;
   }
}





