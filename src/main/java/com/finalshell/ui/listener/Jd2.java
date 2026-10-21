package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Jd2 implements ActionListener {
   public final com.finalshell.ui.frame.MainFrame L;
   public static String a;

   public Jd2(com.finalshell.ui.frame.MainFrame var1) {
      this.L = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 524718701098134020L;
      Ref.g(524718701098134020L, var2);
      Object[] var10002 = Registry.packArgs((String)Registry.lookupField(613893959659572417L).get(null) + a);
      long var5 = 510227890552392495L;
      Object[] var4 = var10002;
      Ref.h(510227890552392495L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\u0002IWL\\b4_@PW".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 34;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      } else {
         var6 = 34;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 34;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 31;
               break;
            case 1:
               var23 = 13;
               break;
            case 2:
               var23 = 7;
               break;
            case 3:
               var23 = 1;
               break;
            case 4:
               var23 = 19;
               break;
            case 5:
               var23 = 125;
               break;
            default:
               var23 = 119;
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





