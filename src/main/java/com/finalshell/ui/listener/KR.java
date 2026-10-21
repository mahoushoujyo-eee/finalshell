package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Yk2;
import com.finalshell.ui.dialog.DU;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class KR implements ActionListener {
   public final DU d;
   public static String a;

   public KR(DU var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Registry.packArgs(a);
      long var3 = 517287540690064504L;
      Object var10001 = Ref.h2(517287540690064504L, var3);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      String var2 = (String)var10001;
      Object var5 = 477342503026871908L;
      Ref.g(477342503026871908L, var5);
      Object var7 = 550961635451839925L;
      ((JLabel)Ref.g(550961635451839925L, var7)).setText(var2);
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10004 = Registry.packArgs(new Yk2(this));
      long var10 = 434592463220957006L;
      Object[] var9 = var10004;
      Ref.h(434592463220957006L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "1nohn-K,|\f\u001aN\u0015v.\u007f\u00197~vZ\bZ\f\u0012[3z\u0013R\u0011pk\tZWx\u0019\u0010\u007f\u001c2\n~\f\r=#N\u0012@\b4@\u0014$\f\u0001(f"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 24;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 24;
         var10006 = var0;
      } else {
         var6 = 24;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 24;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 123;
               break;
            case 1:
               var23 = 50;
               break;
            case 2:
               var23 = 71;
               break;
            case 3:
               var23 = 67;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 92;
               break;
            default:
               var23 = 5;
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





