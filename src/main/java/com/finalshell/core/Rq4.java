package com.finalshell.core;

import java.awt.Component;
import java.lang.reflect.Constructor;
import javax.swing.JTable;

public class Rq4 extends Rt4 {
   public final java.lang.Class[] Y = new java.lang.Class[]{String.class};
   public Constructor k;
   public Object p;
   public static int[] D;
   public static String b;

   public Rq4() {
      super(new NH3());
      this.l().setName(b);
   }

   @Override
   public boolean stopCellEditing() {
      Component var1 = this.l();

      try {
         this.p = this.k.newInstance(super.getCellEditorValue());
         this.q(var1, true);
         return super.stopCellEditing();
      } catch (Exception var3) {
         this.q(var1, false);
         return false;
      }
   }

   @Override
   public Component getTableCellEditorComponent(JTable var1, Object var2, boolean var3, int var4, int var5) {
      int[] var10000 = G();
      this.p = null;
      int[] var6 = var10000;

      try {
         label31: {
            java.lang.Class var7 = var1.getColumnClass(var5);

            label24: {
               try {
                  if (var6 == null) {
                     break label31;
                  }

                  if (var7 != Object.class) {
                     break label24;
                  }
               } catch (Exception var8) {
                  throw a(var8);
               }

               var7 = String.class;
            }

            this.k = var7.getConstructor(this.Y);
         }
      } catch (Exception var9) {
         return null;
      }

      Component var10 = super.getTableCellEditorComponent(var1, var2, var3, var4, var5);
      this.q(var10, true);
      return var10;
   }

   public void q(Component var1, boolean var2) {
      int[] var3 = G();
      Component var10000 = var1;
      if (var3 != null) {
         if (!(var1 instanceof NH3)) {
            return;
         }

         var10000 = var1;
      }

      NH3 var4 = (NH3)var10000;
      boolean var10001 = var2;
      if (var3 != null) {
         var10001 = !var2;
      }

      var4.s(var10001);
   }

   @Override
   public Object getCellEditorValue() {
      return this.p;
   }

   public static void O(int[] var0) {
      D = var0;
   }

   public static int[] G() {
      return D;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      if (G() == null) {
         O(new int[3]);
      }

      char[] var10003 = "\u0002\u0016)A#(\u00052\u001e?B4".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 81;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      } else {
         var6 = 81;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            b = var9;
            return;
         }

         var10005 = var10003;
         var10 = 81;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 7;
               break;
            case 1:
               var23 = 38;
               break;
            case 2:
               var23 = 26;
               break;
            case 3:
               var23 = 124;
               break;
            case 4:
               var23 = 23;
               break;
            case 5:
               var23 = 87;
               break;
            default:
               var23 = 49;
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





