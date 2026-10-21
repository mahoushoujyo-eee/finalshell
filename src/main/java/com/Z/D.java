package com.Z;

import com.NE;
import com.i2_2;
import java.awt.Component;
import java.io.File;
import javax.swing.JList;

class D extends com.L.Q {
   final i_2 k;
   private static final String c;
   private static final long d;

   D(i_2 var1) {
      this.k = var1;
   }

   @Override
   public Component getListCellRendererComponent(JList var1, Object var2, int var3, boolean var4, boolean var5) {
      String var6;
      com.L.U var7;
      label23: {
         var7 = (com.L.U)super.getListCellRendererComponent(var1, var2, var3, var4, var5);
         String var10000 = com.Z.T.v();
         File var8 = (File)var2;
         var6 = var10000;
         if (var6 == null) {
            if (var8 == null) {
               var7.setIcon(com.Cz_2.C());
               var7.setText(i2_2.O(c));
               if (var6 == null) {
                  break label23;
               }
            }

            var7.setIcon(com.Cz_2.B(var8));
         }

         var7.setText(NE.w(com.Cz_2.X(var8), (int)d, true));
      }

      int var10001 = var3;
      if (var6 == null) {
         var10001 = var3 == this.k.f.e ? 1 : 0;
      }

      var7.B((boolean)var10001);
      return var7;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "bkWaBC\u007fsgYh@M>z}P\u007f\rW>zz".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 62;
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
         var10007 = 62;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 43;
               break;
            case 1:
               var21 = 48;
               break;
            case 2:
               var21 = 11;
               break;
            case 3:
               var21 = 51;
               break;
            case 4:
               var21 = 29;
               break;
            case 5:
               var21 = 27;
               break;
            default:
               var21 = 111;
         }
      } else {
         var13 = 62;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            c = var16;
            long var3 = 4382427620864525795L;
            long var12 = -381978191839001141L ^ var3;
            var8 = -1;
            d = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 62;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 43;
               break;
            case 1:
               var21 = 48;
               break;
            case 2:
               var21 = 11;
               break;
            case 3:
               var21 = 51;
               break;
            case 4:
               var21 = 29;
               break;
            case 5:
               var21 = 27;
               break;
            default:
               var21 = 111;
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
                  var21 = 43;
                  break;
               case 1:
                  var21 = 48;
                  break;
               case 2:
                  var21 = 11;
                  break;
               case 3:
                  var21 = 51;
                  break;
               case 4:
                  var21 = 29;
                  break;
               case 5:
                  var21 = 27;
                  break;
               default:
                  var21 = 111;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               c = var15;
               long var0 = 4382427620864525795L;
               long var11 = -381978191839001141L ^ var0;
               var6 = -1;
               d = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 43;
                  break;
               case 1:
                  var21 = 48;
                  break;
               case 2:
                  var21 = 11;
                  break;
               case 3:
                  var21 = 51;
                  break;
               case 4:
                  var21 = 29;
                  break;
               case 5:
                  var21 = 27;
                  break;
               default:
                  var21 = 111;
            }
         }
      }
   }
}





