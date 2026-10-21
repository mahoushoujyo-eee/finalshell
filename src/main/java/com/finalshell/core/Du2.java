package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class Du2 extends AbstractListModel {
   public ArrayList x;
   public String[] a;
   public java.lang.Class[] W;
   public static String b;

   public Du2() {
      ArrayList var10001 = new ArrayList();
      long var2 = 587586177856690794L;
      ArrayList var1 = var10001;
      Ref.s(587586177856690794L, var1, var2);
      String[] var10002 = new String[]{b};
      long var4 = 437066352942724981L;
      String[] var3 = var10002;
      Ref.s(437066352942724981L, var3, var4);
      java.lang.Class[] var10003 = new java.lang.Class[]{Object.class};
      long var6 = 566899324430396131L;
      java.lang.Class[] var5 = var10003;
      Ref.s(566899324430396131L, var5, var6);
   }

   public String z(int var1) {
      Object var2 = 437066352942724981L;
      return ((String[])Ref.g(437066352942724981L, var2))[var1];
   }

   public void b() {
      Object var1 = 587586177856690794L;
      ((ArrayList)Ref.g(587586177856690794L, var1)).clear();
   }

   public java.lang.Class U(int var1) {
      Object var2 = 566899324430396131L;
      return ((java.lang.Class[])Ref.g(566899324430396131L, var2))[var1];
   }

   public void r(int var1) {
      Object var2 = 587586177856690794L;
      ((ArrayList)Ref.g(587586177856690794L, var2)).remove(var1);
   }

   public synchronized void k(L1 var1) {
      Object var2 = 587586177856690794L;
      ((ArrayList)Ref.g(587586177856690794L, var2)).add(var1);
   }

   public void R() {
      Object var1 = 587586177856690794L;
      this.fireContentsChanged(false, (int)this, ((ArrayList)Ref.g(587586177856690794L, var1)).size() - 1);
   }

   public synchronized void x(L1 var1) {
      Object var2 = 587586177856690794L;
      ((ArrayList)Ref.g(587586177856690794L, var2)).add(0, var1);
   }

   @Override
   public int getSize() {
      Object var1 = 587586177856690794L;
      return ((ArrayList)Ref.g(587586177856690794L, var1)).size();
   }

   public L1 Z(int var1) {
      Object var3 = 587586177856690794L;
      return (L1)((ArrayList)Ref.g(587586177856690794L, var3)).get(var1);
   }

   @Override
   public Object getElementAt(int var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var3 = 430610060651646114L;
      Object[] var2 = var10001;
      var10001 = Ref.h(430610060651646114L, var2, var3);

      try {
         return (L1)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "\\IO".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 82;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      } else {
         var6 = 82;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 82;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 109;
               break;
            case 1:
               var23 = 118;
               break;
            case 2:
               var23 = 121;
               break;
            case 3:
               var23 = 104;
               break;
            case 4:
               var23 = 73;
               break;
            case 5:
               var23 = 21;
               break;
            default:
               var23 = 85;
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
               b = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





