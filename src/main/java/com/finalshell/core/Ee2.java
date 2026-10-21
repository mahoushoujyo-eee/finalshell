package com.finalshell.core;

import com.finalshell.ui.panel.K02;
import com.finalshell.ui.panel.Kc4;
import com.finalshell.ui.panel.Kz4;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.TransferHandler.TransferSupport;

public class Ee2 extends EY {
   public final File u;
   public final K02 X;
   public static String a;

   public Ee2(K02 var1, boolean var2, boolean var3, File var4) {
      super(var2, var3);
      this.X = var1;
      this.u = var4;
   }

   @Override
   public boolean d() {
      String var10000 = Kz4.M();
      Container var2 = this.X.getParent();
      String var1 = var10000;
      boolean var3 = var2 instanceof Kc4;
      if (var1 != null) {
         if (var3) {
            return ((Kc4)var2).y$boolean();
         }

         var3 = this.X.N();
      }

      return var3;
   }

   @Override
   public int E() {
      String var10000 = Kz4.M();
      Container var2 = this.X.getParent();
      String var1 = var10000;
      int var3 = (var2 instanceof Kc4) ? 1 : 0;
      if (var1 != null) {
         if (var3 != 0) {
            return ((Kc4)var2).X();
         }

         var3 = this.X.U();
      }

      return var3;
   }

   @Override
   public File P$File() {
      String var1 = Kz4.M();
      Ee2 var10000 = this;
      if (var1 != null) {
         if (this.E() == 2) {
            if (var1 == null) {
               return this.u;
            }

            Container var2 = this.X.getParent();
            if (var2 instanceof Kc4) {
               this.X.K(new ActionEvent(this.X, 0, a), false);
            }
         }

         var10000 = this;
      }

      return var10000.u;
   }

   @Override
   public boolean importData(TransferSupport var1) {
      return PG.N(this.X, var1);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "1<\u0015R\u000eAW\u00010\u001d\u0017LU\u0018\u0013'\u0018P".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 116;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 116;
         var10006 = var0;
      } else {
         var6 = 116;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 116;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 3;
               break;
            case 1:
               var23 = 33;
               break;
            case 2:
               var23 = 13;
               break;
            case 3:
               var23 = 67;
               break;
            case 4:
               var23 = 90;
               break;
            case 5:
               var23 = 88;
               break;
            default:
               var23 = 76;
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





