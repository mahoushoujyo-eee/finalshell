package com.finalshell.ui.listener;

import com.finalshell.core.DE;
import com.finalshell.core.FN;
import com.finalshell.core.Q4_2;
import com.finalshell.ui.panel.KD3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Av2 implements ActionListener {
   public Q4_2 V;
   final KD3 I;
   public static String a;

   Av2(KD3 var1) {
      this.I = var1;
      this.V = null;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = KD3.u();
      Av2 var10000 = this;
      if (var2 == null) {
         if (this.V == null) {
            this.V = new Q4_2(KD3.b(this.I));
            this.V.t(a);
            this.V.setMultiSelectionEnabled(false);
            this.V.addChoosableFileFilter(DE.S);
            this.V.setFileFilter(DE.S);
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (KD3.b(var10000.I) != null) {
            this.V.f(KD3.b(this.I));
         }

         var10000 = this;
      }

      if (var2 == null) {
         if (var10000.V.showOpenDialog(FN.L(this.I)) != 0) {
            return;
         }

         var10000 = this;
      }

      var10000.I.v(this.V.getSelectedFile());
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "]N\u000f\u001c``<OSC\u001eqcvC_\u0002\u0002/ibOE$\u001d`aw\u0004_\u0004\u0004mc".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 122;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      } else {
         var6 = 122;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 122;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 80;
               break;
            case 1:
               var23 = 81;
               break;
            case 2:
               var23 = 23;
               break;
            case 3:
               var23 = 10;
               break;
            case 4:
               var23 = 123;
               break;
            case 5:
               var23 = 124;
               break;
            default:
               var23 = 104;
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
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





