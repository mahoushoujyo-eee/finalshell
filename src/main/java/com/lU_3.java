package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;

class lU_3 implements ActionListener {
   final com.d1_2 K;
   private static final String a;
   private static final long b;

   lU_3(com.d1_2 var1) {
      this.K = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      boolean var2 = com.Oj_2.g();
      Object var10000 = this.K;
      if (var2) {
         if (com.d1_2.J(this.K) > 0) {
            com.d1_2.U(this.K, (int)b);
            this.K.repaint();
            if (var2) {
               return;
            }
         }

         var10000 = this.K.getParent();
      }

      Object var3;
      label20: {
         var3 = var10000;
         var3.remove(this.K);
         var10000 = var3;
         if (var2) {
            if (var3 instanceof JComponent) {
               ((JComponent)var3).revalidate();
               if (var2) {
                  break label20;
               }
            }

            var10000 = var3;
         }

         var10000.invalidate();
      }

      var3.repaint();
      com.cl_4.A(a, com.d1_2.Y(this.K), false);
      com.d1_2.S(this.K).Y();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = ",5d`u\u001d8\u001a2cX".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 127;
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
         var10007 = 127;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 4;
               break;
            case 1:
               var21 = 47;
               break;
            case 2:
               var21 = 121;
               break;
            case 3:
               var21 = 75;
               break;
            case 4:
               var21 = 99;
               break;
            case 5:
               var21 = 18;
               break;
            default:
               var21 = 11;
         }
      } else {
         var13 = 127;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 2612770247879483197L;
            long var12 = -1372879662445699273L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 127;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 4;
               break;
            case 1:
               var21 = 47;
               break;
            case 2:
               var21 = 121;
               break;
            case 3:
               var21 = 75;
               break;
            case 4:
               var21 = 99;
               break;
            case 5:
               var21 = 18;
               break;
            default:
               var21 = 11;
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
                  var21 = 4;
                  break;
               case 1:
                  var21 = 47;
                  break;
               case 2:
                  var21 = 121;
                  break;
               case 3:
                  var21 = 75;
                  break;
               case 4:
                  var21 = 99;
                  break;
               case 5:
                  var21 = 18;
                  break;
               default:
                  var21 = 11;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 2612770247879483197L;
               long var11 = -1372879662445699273L ^ var0;
               var6 = -1;
               b = var11;
               return;
            }

            var17 = var10002;
            var10005 = var2;
            char var23 = var10002[var2];
            var10007 = var13;
            var10006 = var23;
            switch (var2 % 7) {
               case 0:
                  var21 = 4;
                  break;
               case 1:
                  var21 = 47;
                  break;
               case 2:
                  var21 = 121;
                  break;
               case 3:
                  var21 = 75;
                  break;
               case 4:
                  var21 = 99;
                  break;
               case 5:
                  var21 = 18;
                  break;
               default:
                  var21 = 11;
            }
         }
      }
   }
}





