package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.O0;
import java.lang.reflect.InvocationTargetException;

public class LO3 extends Ln4_2 {
   public String w;
   public static String c;

   public void K(O0 var1) {
      Registry.packArgs(this, var1);
      long var2 = 272456164038541053L;
      Ref.h2(272456164038541053L, var2);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void w() throws Exception {
      Object var3 = 276837332462939445L;
      Registry.packArgs(Ref.g(276837332462939445L, var3));
      long var5 = 340002508208074194L;
      Object var10002 = Ref.h2(340002508208074194L, var5);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      String var1 = (String)var10002;
      O0 var2 = O0.y(var1);
      Object[] var10003 = Registry.packArgs(var2);
      long var8 = 499690674028780412L;
      Object[] var7 = var10003;
      Ref.h(499690674028780412L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void r$void() throws Exception {
      Object[] var10001 = Registry.packArgs(true);
      long var2 = 222535382303311372L;
      Object[] var1 = var10001;
      Ref.h(222535382303311372L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void s(boolean var1) throws Exception {
      O0 var10001 = (O0)(Registry.emptyArgs());
      long var4 = 185793966100702169L;
      Object[] var3 = var10001;
      var10001 = Ref.h(185793966100702169L, var3, var4);

      try {
         var10001 = (O0)var10001;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      O0 var2 = var10001;

      try {
         Object var5 = 276837332462939445L;
         Ref.g(276837332462939445L, var5);
         StringBuilder var10003 = new StringBuilder().append(c);
         Object var7 = 469940910977292411L;
         Registry.packArgs(var10003, this.append((String)Ref.g(469940910977292411L, var7)).toString(), var2);
         long var9 = 437452996357594521L;
         Ref.h2(437452996357594521L, var9);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var1) {
            Registry.emptyArgs();
            long var11 = 270389152141252877L;
            Ref.h2(270389152141252877L, var11);
            Object[] var10006 = Registry.emptyArgs();
            long var14 = 612604310671515822L;
            Object[] var13 = var10006;
            Ref.h(612604310671515822L, var13, var14);
            Object[] var10007 = Registry.emptyArgs();
            long var16 = 200561288808923907L;
            Object[] var15 = var10007;
            Ref.h(200561288808923907L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }
         }
      } catch (Exception var19) {
         throw a(var19);
      }
   }

   public O0 r$O0() {
      O0 var1 = new O0();
      Registry.packArgs(this, var1);
      long var2 = 622166953529806027L;
      Ref.h2(622166953529806027L, var2);

      try {
         return var1;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public Ln4_2 B() {
      return new LO3();
   }

   public String v() {
      Object var1 = 276837332462939445L;
      return (String)Ref.g(276837332462939445L, var1);
   }

   public void e(String var1) {
      long var3 = 276837332462939445L;
      Ref.s(276837332462939445L, var1, var3);
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\".l1\\\u000b:'.n3P\u001e:".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 116;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 116;
         var10006 = var0;
      } else {
         var6 = 116;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            c = var9;
            return;
         }

         var10005 = var10003;
         var10 = 116;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 48;
               break;
            case 1:
               var23 = 53;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 33;
               break;
            case 4:
               var23 = 77;
               break;
            case 5:
               var23 = 13;
               break;
            default:
               var23 = 17;
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
               c = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





