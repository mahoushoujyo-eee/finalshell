package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.ZU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class FR3 implements ActionListener {
   public final ZU U;
   public static String a;

   public FR3(ZU var1) {
      this.U = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.packArgs(a);
      long var2 = 468188037407298601L;
      Ref.h2(468188037407298601L, var2);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4.getTargetException());
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "Zjr\u0017\t\tuEiqI[I)F|s\u0001\u001dE5_1rH\n\u001fn\u001cvr\n_".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 67;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 67;
         var10006 = var0;
      } else {
         var6 = 67;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 67;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 113;
               break;
            case 1:
               var23 = 93;
               break;
            case 2:
               var23 = 69;
               break;
            case 3:
               var23 = 36;
               break;
            case 4:
               var23 = 112;
               break;
            case 5:
               var23 = 101;
               break;
            default:
               var23 = 25;
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





