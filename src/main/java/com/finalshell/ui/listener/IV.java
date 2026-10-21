package com.finalshell.ui.listener;

import com.finalshell.core.AL_2;
import com.finalshell.ui.panel.K42;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IV implements ActionListener {
   public final K42 c;
   public static String a;

   public IV(K42 var1) {
      this.c = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      if (var1.getActionCommand().equals(a)) {
         this.c.l(AL_2.o(K42.v(this.c).getSelectedFiles()));
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "p/AF)<Ab:]Q%>M^1".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 4;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 4;
         var10006 = var0;
      } else {
         var6 = 4;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 4;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 53;
               break;
            case 1:
               var23 = 91;
               break;
            case 2:
               var23 = 53;
               break;
            case 3:
               var23 = 48;
               break;
            case 4:
               var23 = 66;
               break;
            case 5:
               var23 = 78;
               break;
            default:
               var23 = 32;
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





