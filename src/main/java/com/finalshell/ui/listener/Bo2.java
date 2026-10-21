package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Bo2 implements ActionListener {
   final com.finalshell.ui.frame.U u;
   public static String a;

   Bo2(com.finalshell.ui.frame.U var1) {
      this.u = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.packArgs(a);
      long var2 = 468188037407298601L;
      Ref.h2(468188037407298601L, var2);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "059w\u0011kDw6:pL9\u0004+5/r\u0004\u007f\b7,bsM`[`yco\u0016<\u0007".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 69;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 69;
         var10006 = var0;
      } else {
         var6 = 69;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 69;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 29;
               break;
            case 1:
               var23 = 4;
               break;
            case 2:
               var23 = 8;
               break;
            case 3:
               var23 = 66;
               break;
            case 4:
               var23 = 39;
               break;
            case 5:
               var23 = 20;
               break;
            default:
               var23 = 46;
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





