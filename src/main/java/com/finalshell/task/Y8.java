package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.FJ3;
import com.finalshell.ui.panel.ConnectionInfoPanel;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Y8 implements Runnable {
   public final String S;
   public final FJ3 y;
   public static String a;

   public Y8(FJ3 var1, String var2) {
      this.y = var1;
      this.S = var2;
   }

   @Override
   public void run() {
      try {
         Object var2 = 363274653628888003L;
         Ref.g(363274653628888003L, var2);
         Object var4 = 427341422247993135L;
         Ref.g(427341422247993135L, var4);
         Object var6 = 476201740043670453L;
         Ref.g(476201740043670453L, var6);
         Object[] var10004 = Registry.emptyArgs();
         long var9 = 346382751221538814L;
         Object[] var8 = var10004;
         Ref.h(346382751221538814L, var8, var9);
         Object var10 = 363274653628888003L;
         Ref.g(363274653628888003L, var10);
         Object var12 = 427341422247993135L;
         Ref.g(427341422247993135L, var12);
         Object var14 = 166731455568463101L;
         Ref.g(166731455568463101L, var14);
         Object[] var10009 = Registry.emptyArgs();
         long var17 = 565315838989287146L;
         Object[] var16 = var10009;
         Ref.h(565315838989287146L, var16, var17);
         Object[] var10010 = Registry.emptyArgs();
         long var19 = 152919711700242153L;
         Object[] var18 = var10010;
         Ref.h(152919711700242153L, var18, var19);
         Object[] var10011 = Registry.emptyArgs();
         long var21 = 498856411508641826L;
         Object[] var20 = var10011;
         Ref.h(498856411508641826L, var20, var21);
         Object var22 = 424479769549909696L;
         Object[] var10012 = Registry.packArgs(this, Ref.g(424479769549909696L, var22));
         long var25 = 502687824919125732L;
         Object[] var24 = var10012;
         Ref.h(502687824919125732L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var32) {
            throw var32.getTargetException();
         }
      } catch (Exception var33) {
         var33.printStackTrace();
         Object var26 = 363274653628888003L;
         Ref.g(363274653628888003L, var26);
         Object var28 = 427341422247993135L;
         Ref.g(427341422247993135L, var28);
         Object var30 = 476201740043670453L;
         JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((ConnectionInfoPanel)Ref.g(476201740043670453L, var30)), a);
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "则康斀亯夦贬\u007f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 58;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      } else {
         var6 = 58;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 58;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 56;
               break;
            case 1:
               var23 = 119;
               break;
            case 2:
               var23 = 61;
               break;
            case 3:
               var23 = 99;
               break;
            case 4:
               var23 = 45;
               break;
            case 5:
               var23 = 51;
               break;
            default:
               var23 = 100;
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





