package com.finalshell.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TZ extends TN {
   public boolean x;
   public long C;

   public TZ(boolean var1, long var2) {
      this.n = Dq2.d;
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

   public TZ(byte[] var1) {
      this.n = Dq2.d;
      ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
      DataInputStream var3 = new DataInputStream(var2);

      try {
         this.n = var3.readShort();
         this.x = var3.readBoolean();
         this.C = var3.readLong();
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   public boolean W() {
      return this.x;
   }

   public void B(boolean var1) {
      this.x = var1;
   }

   public long o() {
      return this.C;
   }
}





