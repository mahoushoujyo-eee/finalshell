package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public class H2_3 extends N2_3 {
   public final float o;
   public static String b;

   H2_3(float var1) {
      this.o = var1;
   }

   @Override
   public Object w(Cr2_2 var1) {
      return this.o;
   }

   @Override
   public boolean x() {
      return false;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte(4);
      var1.writeFloat(this.o);
   }

   @Override
   public String toString() {
      return b + this.o + ")";
   }

   @Override
   public boolean equals(@C_9 Object var1) {
      Ky4[] var2 = Cr2_2.q$arrky_4();
      int var10000 = (var1 instanceof H2_3) ? 1 : 0;
      if (var2 == null) {
         if (!var10000) {
            return 0 != 0;
         }

         float var3;
         var10000 = (var3 = ((H2_3)var1).o - this.o) == 0.0F ? 0 : (var3 < 0.0F ? -1 : 1);
      }

      if (var2 != null) {
         return var10000 != 0;
      } else {
         return (boolean)(!var10000 ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.o);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Yl\u0019\u001a\u000fa\fN|\u0011%4A6EJ9/4\b".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 49;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      } else {
         var6 = 49;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 49;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 43;
               break;
            case 1:
               var23 = 18;
               break;
            case 2:
               var23 = 102;
               break;
            case 3:
               var23 = 120;
               break;
            case 4:
               var23 = 106;
               break;
            case 5:
               var23 = 17;
               break;
            default:
               var23 = 115;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





