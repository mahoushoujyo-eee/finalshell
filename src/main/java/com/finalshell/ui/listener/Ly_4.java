package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.KP3;
import com.finalshell.ui.panel.Connection4;
import com.finalshell.ui.panel.FilePermissionPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

public class Ly_4 implements ActionListener {
   public final FilePermissionPanel E;
   public static String a;

   public Ly_4(FilePermissionPanel var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Connection4.I();
      Object var4 = 357358512404315725L;
      Object var10002 = Ref.g(357358512404315725L, var4);
      Object var6 = 305402254993059552L;
      String var3 = JOptionPane.showInputDialog(((Connection4)Ref.g(305402254993059552L, var6)).getParent(), a);
      Object var2 = var10002;
      var10002 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var10002 = var3;
      }

      if (!var10002.equals("")) {
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10003 = Registry.packArgs(new KP3(this, var3));
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
      char[] var10003 = "斸件夣吢秊2\u0004".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 10;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 10;
         var10006 = var0;
      } else {
         var6 = 10;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 10;
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
               var23 = 10;
               break;
            case 2:
               var23 = 16;
               break;
            case 3:
               var23 = 37;
               break;
            case 4:
               var23 = 48;
               break;
            case 5:
               var23 = 2;
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





