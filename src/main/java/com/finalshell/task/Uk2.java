package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.panel.Address;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Uk2 implements Runnable {
   public final Ck4 i;
   public final Address h;
   public static String a;

   public Uk2(Address var1, Ck4 var2) {
      this.h = var1;
      this.i = var2;
   }

   @Override
   public void run() {
      Object var4 = 354310498412401109L;
      Ref.g(354310498412401109L, var4);
      Object var6 = 627973027287447539L;
      Ref.g(627973027287447539L, var6);
      Object[] var10003 = Registry.emptyArgs();
      long var9 = 212042562452272939L;
      Object[] var8 = var10003;
      Ref.h(212042562452272939L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      String var2 = null;

      try {
         Object var10 = 542715414470380501L;
         Ref.g(542715414470380501L, var10);
         Object[] var10006 = Registry.emptyArgs();
         long var13 = 605430732347023634L;
         Object[] var12 = var10006;
         var10006 = Registry.packArgs(Ref.h(605430732347023634L, var12, var13));
         long var15 = 596624758422184723L;
         Object[] var14 = var10006;
         Ref.h(596624758422184723L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var30) {
            throw var30.getTargetException();
         }

         Object var16 = 354310498412401109L;
         Ref.g(354310498412401109L, var16);
         Object var18 = 627973027287447539L;
         Ref.g(627973027287447539L, var18);
         Object var20 = 542715414470380501L;
         Ref.g(542715414470380501L, var20);
         Object[] var10011 = Registry.emptyArgs();
         long var23 = 605430732347023634L;
         Object[] var22 = var10011;
         var10011 = Registry.packArgs(Ref.h(605430732347023634L, var22, var23));
         long var25 = 266662749976559972L;
         Object[] var24 = var10011;
         Ref.h(266662749976559972L, var24, var25);

         try {
            ;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }
      } catch (Exception var31) {
         var31.printStackTrace();
         var2 = a + var31;
      }

      try {
         if (var2 != null) {
            Object var26 = 354310498412401109L;
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor((Address)Ref.g(354310498412401109L, var26)), var2);
         }
      } catch (Exception var28) {
         throw a(var28);
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "剉阾旎亼奊贬pc".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 55;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      } else {
         var6 = 55;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 55;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 94;
               break;
            case 1:
               var23 = 109;
               break;
            case 2:
               var23 = 126;
               break;
            case 3:
               var23 = 125;
               break;
            case 4:
               var23 = 76;
               break;
            case 5:
               var23 = 62;
               break;
            default:
               var23 = 102;
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





