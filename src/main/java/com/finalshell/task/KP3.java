package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Ly_4;
import com.finalshell.ui.panel.Connection4;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JOptionPane;

public class KP3 implements Runnable {
   public final String s;
   public final Ly_4 X;
   public static String a;

   public KP3(Ly_4 var1, String var2) {
      this.X = var1;
      this.s = var2;
   }

   @Override
   public void run() {
      Object var6 = 124351971510883468L;
      Ref.g(124351971510883468L, var6);
      Object var8 = 357358512404315725L;
      Ref.g(357358512404315725L, var8);
      Object var10 = 305402254993059552L;
      Ref.g(305402254993059552L, var10);
      Object[] var10004 = Registry.emptyArgs();
      long var13 = 212042562452272939L;
      Object[] var12 = var10004;
      Ref.h(212042562452272939L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      String var2 = null;
      Object var14 = 124351971510883468L;
      Ref.g(124351971510883468L, var14);
      Object var16 = 357358512404315725L;
      Ref.g(357358512404315725L, var16);
      Object var18 = 515525013030853953L;
      Ref.g(515525013030853953L, var18);
      Object[] var10008 = Registry.emptyArgs();
      long var21 = 498856411508641826L;
      Object[] var20 = var10008;
      Registry.packArgs(Ref.h(498856411508641826L, var20, var21));
      long var22 = 159824902428932603L;
      Object var10009 = Ref.h2(159824902428932603L, var22);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      String var3 = (String)var10009;
      new StringBuilder();
      Object var24 = 124351971510883468L;
      Ref.g(124351971510883468L, var24);
      Object var26 = 357358512404315725L;
      Ref.g(357358512404315725L, var26);
      Object var28 = 515525013030853953L;
      Object var10013 = Ref.g(515525013030853953L, var28);
      String var10014 = (String)(Registry.emptyArgs());
      long var31 = 498856411508641826L;
      Object[] var30 = var10014;
      var10014 = Ref.h(498856411508641826L, var30, var31);

      try {
         var10014 = (String)var10014;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      var10013.append((String)var10014).append(var3);
      Object var32 = 583261171697996206L;
      String var4 = this.append((String)Ref.g(583261171697996206L, var32)).toString();

      try {
         Object var34 = 124351971510883468L;
         Ref.g(124351971510883468L, var34);
         Object var36 = 357358512404315725L;
         Ref.g(357358512404315725L, var36);
         Object var38 = 305402254993059552L;
         Ref.g(305402254993059552L, var38);
         Object[] var10018 = Registry.emptyArgs();
         long var41 = 346382751221538814L;
         Object[] var40 = var10018;
         Ref.h(346382751221538814L, var40, var41);
         Object var42 = 124351971510883468L;
         Ref.g(124351971510883468L, var42);
         Object var44 = 357358512404315725L;
         Ref.g(357358512404315725L, var44);
         Object var46 = 305402254993059552L;
         ((Connection4)Ref.g(305402254993059552L, var46)).getParent();
         Object var48 = 124351971510883468L;
         Ref.g(124351971510883468L, var48);
         Object var50 = 357358512404315725L;
         Ref.g(357358512404315725L, var50);
         Object var52 = 515525013030853953L;
         Ref.g(515525013030853953L, var52);
         Object[] var10027 = Registry.emptyArgs();
         long var55 = 498856411508641826L;
         Object[] var54 = var10027;
         var10027 = Ref.h(498856411508641826L, var54, var55);
         Object var56 = 583261171697996206L;
         var10027 = Registry.packArgs(var10027, this, Ref.g(583261171697996206L, var56), true, true);
         long var59 = 184332907359967333L;
         Object[] var58 = var10027;
         Ref.h(184332907359967333L, var58, var59);

         try {
            ;
         } catch (InvocationTargetException var67) {
            throw var67.getTargetException();
         }
      } catch (Exception var68) {
         var68.printStackTrace();
         var2 = a + var68;
      }

      try {
         if (var2 != null) {
            Object var60 = 124351971510883468L;
            Ref.g(124351971510883468L, var60);
            Object var62 = 357358512404315725L;
            Ref.g(357358512404315725L, var62);
            Object var64 = 305402254993059552L;
            JOptionPane.showMessageDialog((Connection4)Ref.g(305402254993059552L, var64), var2);
         }
      } catch (Exception var66) {
         throw a(var66);
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
      char[] var10003 = "刽廐奙赙\"\f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 111;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 111;
         var10006 = var0;
      } else {
         var6 = 111;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 111;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 73;
               break;
            case 1:
               var23 = 69;
               break;
            case 2:
               var23 = 7;
               break;
            case 3:
               var23 = 19;
               break;
            case 4:
               var23 = 108;
               break;
            case 5:
               var23 = 105;
               break;
            default:
               var23 = 22;
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





