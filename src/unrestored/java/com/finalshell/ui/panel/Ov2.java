package com.finalshell.ui.panel;

import com.finalshell.core.ND;
import com.finalshell.core.QC;
import javax.swing.Icon;

public class Ov2 extends O implements ND {
   public boolean W;
   public float Z;
   public static String a;

   public Ov2() {
      this.f();
   }

   public Ov2(Icon var1) {
      super(var1);
      this.f();
   }

   public Ov2(Icon var1, int var2) {
      super(var1, var2);
      this.f();
   }

   public Ov2(String var1) {
      super(var1);
      this.f();
   }

   public Ov2(String var1, int var2) {
      super(var1, var2, new Object[0]);
      this.f();
   }

   public Ov2(String var1, Icon var2) {
      super(var1, var2);
      this.f();
   }

   public Ov2(String var1, Icon var2, int var3) {
      super(var1, var2, var3, new Object[0]);
      this.f();
   }

   public void f() {
      this.S(a);
   }

   @Override
   public void o(boolean var1) {
      this.W = var1;
      this.repaint();
   }

   @Override
   public boolean D$boolean() {
      return this.W;
   }

   @Override
   public void w(float var1) {
      this.Z = var1;
      this.repaint();
   }

   @Override
   public float D$float() {
      return this.Z;
   }

   @Override
   public boolean contains(int var1, int var2) {
      return QC.q(this, var1, var2);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "tWCSaSccHD\u001f`\\t{@HF".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 4;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 4;
         var10006 = var0;
      } else {
         var6 = 4;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 4;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 18;
               break;
            case 1:
               var23 = 33;
               break;
            case 2:
               var23 = 34;
               break;
            case 3:
               var23 = 54;
               break;
            case 4:
               var23 = 1;
               break;
            case 5:
               var23 = 52;
               break;
            default:
               var23 = 21;
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





