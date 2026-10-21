package com.finalshell.ui.listener;

import com.finalshell.crypto.User;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class BE implements ActionListener {
   public final User W;
   public static String a;

   public BE(User var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.packArgs(a);
      long var2 = 517287540690064504L;
      Registry.packArgs(Ref.h2(517287540690064504L, var2));
      long var4 = 468188037407298601L;
      Ref.h2(468188037407298601L, var4);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6.getTargetException());
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "n!Fy!C3@\u001eox\nC\u0015h5bD\n|\u0010^)EK\u0000S\"#\f[c\u0003w\u000fz#Jv%@/;\u001d\u001e9\u001c7\u0007Vbayrh\"y?\u0019MoT\u0013Az^zr4*a\u000fzn#i,n\u000bt"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 73;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 73;
         var10006 = var0;
      } else {
         var6 = 73;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 73;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 69;
               break;
            case 1:
               var23 = 4;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 73;
               break;
            case 4:
               var23 = 13;
               break;
            case 5:
               var23 = 76;
               break;
            default:
               var23 = 10;
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





