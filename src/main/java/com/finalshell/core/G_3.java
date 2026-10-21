package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.io.DataOutputStream;
import java.io.IOException;

public class G_3 extends X2_3 {
   public final short v;
   public static String b;
   public static long c;

   public G_3(short var1) {
      this.v = var1;
   }

   public String E(Cr2_2 var1) {
      return var1.S$String(this.v);
   }

   @Override
   public boolean x() {
      return false;
   }

   @Override
   public void R(DataOutputStream var1) throws IOException {
      var1.writeByte((int)c);
      var1.writeShort(this.v);
   }

   @Override
   public String toString() {
      return b + this.v + ")";
   }

   @Override
   public boolean equals(@C_9 Object var1) {
      Ky4[] var2 = Cr2_2.q$arrky_4();
      short var10000 = (var1 instanceof G_3) ? 1 : 0;
      if (var2 == null) {
         if (var10000 == 0) {
            return 0 != 0;
         }

         var10000 = ((G_3)var1).v;
      }

      if (var2 != null) {
         return var10000 != 0;
      } else {
         return (boolean)(var10000 == this.v ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return this.v;
   }

   static short Y(G_3 var0) {
      return var0.v;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\n\u000fCZ}>G\u001d\u001fNeH\fz\u0016)coFW".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 54;
      char[] var10002 = var10003;
      int var4 = var10004;
      char[] var17;
      byte var21;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var17 = var10003;
         var10005 = var2;
         char var10008 = var10003[var2];
         var10007 = 54;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 127;
               break;
            case 1:
               var21 = 118;
               break;
            case 2:
               var21 = 59;
               break;
            case 3:
               var21 = 63;
               break;
            case 4:
               var21 = 31;
               break;
            case 5:
               var21 = 73;
               break;
            default:
               var21 = 63;
         }
      } else {
         var13 = 54;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            b = var16;
            long var3 = 3795609629986828949L;
            long var12 = -5991957771956079982L ^ var3;
            var8 = -1;
            c = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 54;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 127;
               break;
            case 1:
               var21 = 118;
               break;
            case 2:
               var21 = 59;
               break;
            case 3:
               var21 = 63;
               break;
            case 4:
               var21 = 31;
               break;
            case 5:
               var21 = 73;
               break;
            default:
               var21 = 63;
         }
      }

      while (true) {
         var17[var10005] = (char)(var10006 ^ var10007 ^ var21);
         var2++;
         if (var13 == 0) {
            var17 = var10002;
            var10005 = var13;
            char var24 = var10002[var13];
            var10007 = var13;
            var10006 = var24;
            switch (var2 % 7) {
               case 0:
                  var21 = 127;
                  break;
               case 1:
                  var21 = 118;
                  break;
               case 2:
                  var21 = 59;
                  break;
               case 3:
                  var21 = 63;
                  break;
               case 4:
                  var21 = 31;
                  break;
               case 5:
                  var21 = 73;
                  break;
               default:
                  var21 = 63;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               b = var15;
               long var0 = 3795609629986828949L;
               long var11 = -5991957771956079982L ^ var0;
               var6 = -1;
               c = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 127;
                  break;
               case 1:
                  var21 = 118;
                  break;
               case 2:
                  var21 = 59;
                  break;
               case 3:
                  var21 = 63;
                  break;
               case 4:
                  var21 = 31;
                  break;
               case 5:
                  var21 = 73;
                  break;
               default:
                  var21 = 63;
            }
         }
      }
   }
}





