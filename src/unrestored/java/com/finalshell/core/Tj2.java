package com.finalshell.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Tj2 extends TN {
   public boolean e;
   public long c;

   public Tj2(boolean var1, long var2) {
      this.n = Dq2.Z;
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      DataOutputStream var5 = new DataOutputStream(var4);

      try {
         var5.writeShort(this.n);
         var5.writeBoolean(var1);
         var5.writeLong(var2);
         this.u = var4.toByteArray();
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   public Tj2(byte[] var1) {
      this.n = Dq2.Z;
      ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
      DataInputStream var3 = new DataInputStream(var2);

      try {
         this.n = var3.readShort();
         this.e = var3.readBoolean();
         this.c = var3.readLong();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public boolean d() {
      return this.e;
   }

   public void z(boolean var1) {
      this.e = var1;
   }

   public long Q() {
      return this.c;
   }
}





