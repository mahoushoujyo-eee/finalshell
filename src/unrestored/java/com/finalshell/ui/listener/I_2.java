package com.finalshell.ui.listener;

import com.finalshell.core.D3_2;
import com.finalshell.core.GA;
import com.finalshell.core.R8;
import com.finalshell.ui.panel.CI;
import com.finalshell.ui.panel.Pb4;
import com.finalshell.ui.panel.SZ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class I_2 implements ActionListener {
   public final com.finalshell.ui.panel.T f;
   public static String a;
   public static long b;

   public I_2(com.finalshell.ui.panel.T var1) {
      this.f = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Pb4 var2 = new Pb4();
      CI var3 = new CI(this.f.d);
      var3.setOpaque(false);
      var3.setVisibleRowCount(Math.min((int)b, this.f.d.size()));
      var3.d(true);
      var3.setCellRenderer(new D3_2(this));
      var3.addMouseListener(new M7(this, var3, var2));
      SZ var4 = new SZ(var3, false, false);
      var4.setOpaque(false);
      var4.getViewport().setOpaque(false);
      var4.G(0);
      R8 var5 = var4.i$R8();
      var5.W(com.finalshell.core.Z.k);
      var5.s(com.finalshell.core.Z.m);
      var5.L(com.finalshell.core.Z.K);
      GA.B(var4, a);
      var2.add(var4);
      var2.r(this.f.g);
      var3.setSelectedIndex(this.f.e);
      var3.k(this.f.e);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "(+4\u00013;h$<".toCharArray();
      int var10004 = var10003.length;
      int var2 = 0;
      byte var13 = 42;
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
         var10007 = 42;
         var10006 = var10008;
         switch (var2 % 7) {
            case 0:
               var21 = 97;
               break;
            case 1:
               var21 = 110;
               break;
            case 2:
               var21 = 115;
               break;
            case 3:
               var21 = 73;
               break;
            case 4:
               var21 = 118;
               break;
            case 5:
               var21 = 60;
               break;
            default:
               var21 = 32;
         }
      } else {
         var13 = 42;
         var4 = var10004;
         if (var10004 <= var2) {
            String var16 = new String(var10003).intern();
            byte var8 = -1;
            a = var16;
            long var3 = 9200005730755713294L;
            long var12 = -3166903275777648380L ^ var3;
            var8 = -1;
            b = var12;
            return;
         }

         var17 = var10003;
         var10005 = var2;
         char var22 = var10003[var2];
         var10007 = 42;
         var10006 = var22;
         switch (var2 % 7) {
            case 0:
               var21 = 97;
               break;
            case 1:
               var21 = 110;
               break;
            case 2:
               var21 = 115;
               break;
            case 3:
               var21 = 73;
               break;
            case 4:
               var21 = 118;
               break;
            case 5:
               var21 = 60;
               break;
            default:
               var21 = 32;
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
                  var21 = 97;
                  break;
               case 1:
                  var21 = 110;
                  break;
               case 2:
                  var21 = 115;
                  break;
               case 3:
                  var21 = 73;
                  break;
               case 4:
                  var21 = 118;
                  break;
               case 5:
                  var21 = 60;
                  break;
               default:
                  var21 = 32;
            }
         } else {
            if (var4 <= var2) {
               String var15 = new String(var10002).intern();
               byte var6 = -1;
               a = var15;
               long var0 = 9200005730755713294L;
               long var11 = -3166903275777648380L ^ var0;
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
                  var21 = 97;
                  break;
               case 1:
                  var21 = 110;
                  break;
               case 2:
                  var21 = 115;
                  break;
               case 3:
                  var21 = 73;
                  break;
               case 4:
                  var21 = 118;
                  break;
               case 5:
                  var21 = 60;
                  break;
               default:
                  var21 = 32;
            }
         }
      }
   }
}





