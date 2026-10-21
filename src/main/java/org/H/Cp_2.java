package org.H;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cp_2 extends org.H.Y {
   private final short D;
   private final short Z;
   public final byte[] h;
   private final org.H.C3[] q;
   private final org.H.Y[] Y;

   public Cp_2(short var1, short var2, short var3, byte[] var4, org.H.C3[] var5, org.H.Y[] var6) {
      super(var1);
      this.D = var2;
      this.Z = var3;
      this.h = var4;
      this.q = var5;
      this.Y = var6;
   }

   private static org.H.Y K(short var0, org.H.Cr_2 var1, DataInputStream var2) throws IOException {
      short var4 = var2.readShort();
      short var5 = var2.readShort();
      byte[] var6 = org.H.Cr_2.S(var2);
      com.ky_4[] var10000 = org.H.Cr_2.q();
      org.H.C3[] var7 = new org.H.C3[var2.readUnsignedShort()];
      com.ky_4[] var3 = var10000;
      int var8 = 0;

      while (var8 < var7.length) {
         var7[var8] = new org.H.C3(var2.readShort(), var2.readShort(), var2.readShort(), var2.readShort());
         var8++;
         if (var3 != null) {
            break;
         }
      }

      org.H.Y[] var10 = new org.H.Y[var2.readUnsignedShort()];
      int var9 = 0;

      while (var9 < var10.length) {
         var10[var9] = org.H.Cr_2.U(var1, var2);
         var9++;
         if (var3 != null) {
            break;
         }
      }

      return new org.H.Cp_2(var0, var4, var5, var6, var7, var10);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.D);
      var1.writeShort(this.Z);
      var1.writeInt(this.h.length);
      var1.write(this.h);
      var1.writeShort(this.q.length);
      org.H.C3[] var3 = this.q;
      int var4 = var3.length;
      com.ky_4[] var10000 = org.H.Cr_2.q();
      int var5 = 0;
      com.ky_4[] var2 = var10000;

      while (true) {
         if (var5 < var4) {
            org.H.C3 var6 = var3[var5];

            try {
               var1.writeShort(var6.k);
               var1.writeShort(var6.s);
               var1.writeShort(var6.E);
               var1.writeShort(var6.O);
               var5++;
               if (var2 != null) {
                  break;
               }

               if (var2 == null) {
                  continue;
               }
            } catch (IOException var7) {
               throw a(var7);
            }
         }

         var1.writeShort(this.Y.length);
         break;
      }

      for (org.H.Y var11 : this.Y) {
         var11.B(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   static org.H.Y E(short var0, org.H.Cr_2 var1, DataInputStream var2) throws IOException {
      return K(var0, var1, var2);
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}





