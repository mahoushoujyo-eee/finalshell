package com.finalshell.ui.panel;

import com.finalshell.ui.model.Cs2;
import java.awt.event.KeyEvent;

public class OL extends O {
   public static String a;

   public OL() {
      this.h();
   }

   public OL(int var1) {
      super(KeyEvent.getKeyText(var1));
      this.h();
   }

   public OL(int var1, int var2) {
      super(KeyEvent.getKeyModifiersText(var2) + "+" + KeyEvent.getKeyText(var1));
      this.h();
   }

   public OL(Cs2 var1) {
      super(var1.toString());
      this.h();
   }

   public OL(String var1) {
      super(var1);
      this.h();
   }

   public void h() {
      this.S(a);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "QuO%\u0013nVU{Y+\u001a".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 108;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 108;
         var10006 = var0;
      } else {
         var6 = 108;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 108;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 85;
               break;
            case 1:
               var23 = 118;
               break;
            case 2:
               var23 = 87;
               break;
            case 3:
               var23 = 34;
               break;
            case 4:
               var23 = 26;
               break;
            case 5:
               var23 = 123;
               break;
            default:
               var23 = 23;
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





