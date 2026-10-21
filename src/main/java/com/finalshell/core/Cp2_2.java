package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cp2_2 extends Y_3 {
   public final short D;
   public final short Z;
   public final byte[] h;
   public final C3_4[] q;
   public final Y_3[] Y;

   public Cp2_2(short var1, short var2, short var3, byte[] var4, C3_4[] var5, Y_3[] var6) {
      super(var1);
      this.D = var2;
      this.Z = var3;
      this.h = var4;
      this.q = var5;
      this.Y = var6;
   }

   public static Y_3 K(short var0, Cr2_2 var1, DataInputStream var2) throws IOException {
      short var4 = var2.readShort();
      short var5 = var2.readShort();
      byte[] var6 = Cr2_2.S(var2);
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      C3_4[] var7 = new C3_4[var2.readUnsignedShort()];
      Ky4[] var3 = var10000;
      int var8 = 0;

      while (var8 < var7.length) {
         var7[var8] = new C3_4(var2.readShort(), var2.readShort(), var2.readShort(), var2.readShort());
         var8++;
         if (var3 != null) {
            break;
         }
      }

      Y_3[] var10 = new Y_3[var2.readUnsignedShort()];
      int var9 = 0;

      while (var9 < var10.length) {
         var10[var9] = Cr2_2.U(var1, var2);
         var9++;
         if (var3 != null) {
            break;
         }
      }

      return new Cp2_2(var0, var4, var5, var6, var7, var10);
   }

   @Override
   protected void T(DataOutputStream var1) throws IOException {
      var1.writeShort(this.D);
      var1.writeShort(this.Z);
      var1.writeInt(this.h.length);
      var1.write(this.h);
      var1.writeShort(this.q.length);
      C3_4[] var3 = this.q;
      int var4 = var3.length;
      Ky4[] var10000 = Cr2_2.q$arrky_4();
      int var5 = 0;
      Ky4[] var2 = var10000;

      while (true) {
         if (var5 < var4) {
            C3_4 var6 = var3[var5];

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

      for (Y_3 var11 : this.Y) {
         var11.B(var1);
         if (var2 != null) {
            break;
         }
      }
   }

   static Y_3 E(short var0, Cr2_2 var1, DataInputStream var2) throws IOException {
      return K(var0, var1, var2);
   }

   public static IOException a(IOException var0) {
      return var0;
   }
}





