package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SetExternalEditorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

public class FJ3 implements ActionListener {
   final SetExternalEditorPanel Z;
   public static String a;

   FJ3(SetExternalEditorPanel var1) {
      this.Z = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.finalshell.core.Km2.U$String();
      Object var4 = 427341422247993135L;
      Object var10002 = Ref.g(427341422247993135L, var4);
      Object var6 = 166731455568463101L;
      String var3 = JOptionPane.showInputDialog(((com.finalshell.core.Km2)Ref.g(166731455568463101L, var6)).getParent(), a);
      Object var2 = var10002;
      var10002 = var3;
      if (var2 == null) {
         if (var3 == null) {
            return;
         }

         var10002 = var3;
      }

      if (!var10002.equals("")) {
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10003 = Registry.packArgs(new com.finalshell.task.Y8(this, var3));
         long var9 = 434592463220957006L;
         Object[] var8 = var10003;
         Ref.h(434592463220957006L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "既仚吊禦3!".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 15;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 15;
         var10006 = var0;
      } else {
         var6 = 15;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 15;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 106;
               break;
            case 1:
               var23 = 35;
               break;
            case 2:
               var23 = 8;
               break;
            case 3:
               var23 = 89;
               break;
            case 4:
               var23 = 6;
               break;
            case 5:
               var23 = 14;
               break;
            default:
               var23 = 66;
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





