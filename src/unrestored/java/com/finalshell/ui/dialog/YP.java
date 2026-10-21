package com.finalshell.ui.dialog;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.panel.SwitchTabCommand;
import java.awt.Frame;
import javax.swing.JDialog;

public class YP extends JDialog {
   public MainFrame l;
   public SwitchTabCommand j;
   public static String a;

   public YP(MainFrame var1) {
      super((Frame)var1);
      long var3 = 529054879371079324L;
      Ref.s(529054879371079324L, var1, var3);
      this.setTitle(a);
      SwitchTabCommand var10002 = new SwitchTabCommand();
      long var5 = 217056655825504262L;
      SwitchTabCommand var4 = var10002;
      Ref.s(217056655825504262L, var4, var5);
      Object var6 = 217056655825504262L;
      this.setContentPane((SwitchTabCommand)Ref.g(217056655825504262L, var6));
      this.pack();
      this.setLocationRelativeTo(var1);
      this.setVisible(true);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "必挎镢讘缶".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 26;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      } else {
         var6 = 26;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 26;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 52;
               break;
            case 1:
               var23 = 99;
               break;
            case 2:
               var23 = 86;
               break;
            case 3:
               var23 = 60;
               break;
            case 4:
               var23 = 66;
               break;
            case 5:
               var23 = 36;
               break;
            default:
               var23 = 29;
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





