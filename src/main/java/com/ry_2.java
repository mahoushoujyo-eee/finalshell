package com;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.beans.PropertyChangeListener;
import javax.swing.JComponent;

class Ry_2 extends R7 {
   final Window c;
   final ComponentAdapter j;
   final Rt_2 Q;
   final Component u;
   final ComponentAdapter A;
   final com.FY i;
   final PropertyChangeListener f;
   final com.Ds_2 H;
   private static final String a;

   Ry_2(com.Ds_2 var1, Window var2, ComponentAdapter var3, Rt_2 var4, Component var5, ComponentAdapter var6, com.FY var7, PropertyChangeListener var8) {
      this.H = var1;
      this.c = var2;
      this.j = var3;
      this.Q = var4;
      this.u = var5;
      this.A = var6;
      this.i = var7;
      this.f = var8;
   }

   @Override
   public void u(com.Ds_2 var1) {
      this.T();
   }

   @Override
   public void f(com.Ds_2 var1) {
      this.T();
   }

   protected void T() {
      this.H.b(this);
      this.c.removeComponentListener(this.j);
      int[] var10000 = com.Ds_2.U();
      this.c.removeComponentListener(this.Q);
      this.u.removeComponentListener(this.A);
      int[] var1 = var10000;
      Ry_2 var2 = this;
      if (var1 == null) {
         if (this.u instanceof JComponent) {
            ((JComponent)this.u).removeAncestorListener(this.i);
         }

         var2 = this;
      }

      var2.H.removePropertyChangeListener(a, this.f);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "Z_Q\u0013P>>WDs\u0011V55MQH\nP>".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 18;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 18;
         var10006 = var0;
      } else {
         var6 = 18;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 18;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 43;
               break;
            case 1:
               var23 = 34;
               break;
            case 2:
               var23 = 46;
               break;
            case 3:
               var23 = 113;
               break;
            case 4:
               var23 = 45;
               break;
            case 5:
               var23 = 66;
               break;
            default:
               var23 = 73;
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





