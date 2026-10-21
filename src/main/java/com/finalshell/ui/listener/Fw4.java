package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.EffectPreview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Fw4 implements ActionListener {
   final EffectPreview n;
   public static String a;

   Fw4(EffectPreview var1) {
      this.n = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      File var2 = new File(a);
      Registry.packArgs(var2);
      long var3 = 557190378343810325L;
      Ref.h2(557190378343810325L, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = " 'RW\"\u001e\u0017!".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 81;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      } else {
         var6 = 81;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 95;
               break;
            case 1:
               var23 = 89;
               break;
            case 2:
               var23 = 119;
               break;
            case 3:
               var23 = 110;
               break;
            case 4:
               var23 = 22;
               break;
            case 5:
               var23 = 34;
               break;
            default:
               var23 = 35;
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





