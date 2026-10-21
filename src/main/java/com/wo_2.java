package com;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Wo_2 extends com.WC implements AncestorListener {
   private JComponent P;

   public Wo_2(JComponent var1) {
      super(GO.q);
      this.M(var1);
   }

   public Wo_2(JComponent var1, long var2) {
      super(var2);
      this.M(var1);
   }

   public Wo_2(JComponent var1, String var2, long var3) {
      super(var2, var3);
      this.M(var1);
   }

   public Wo_2(JComponent var1, long var2, long var4) {
      super(var2, var4);
      this.M(var1);
   }

   public Wo_2(JComponent var1, String var2, long var3, long var5) {
      super(var2, var3, var5);
      this.M(var1);
   }

   public Wo_2(JComponent var1, long var2, ActionListener var4) {
      super(var2, var4);
      this.M(var1);
   }

   public Wo_2(JComponent var1, String var2, long var3, ActionListener var5) {
      super(var2, var3, var5);
      this.M(var1);
   }

   public Wo_2(JComponent var1, long var2, long var4, ActionListener var6) {
      super(var2, var4, var6);
      this.M(var1);
   }

   public Wo_2(JComponent var1, String var2, long var3, long var5, ActionListener var7) {
      super(var2, var3, var5, var7);
      this.M(var1);
   }

   private void M(JComponent var1) {
      this.P = var1;
      this.O(true);
      var1.addAncestorListener(this);
   }

   public void p() {
      this.P.removeAncestorListener(this);
   }

   public Component q() {
      return this.P;
   }

   @Override
   public void ancestorAdded(AncestorEvent var1) {
      this.u();
   }

   @Override
   public void ancestorRemoved(AncestorEvent var1) {
      this.Y();
   }

   @Override
   public void ancestorMoved(AncestorEvent var1) {
   }

   public static com.Wo_2 G(JComponent var0) {
      I(var0);
      return new com.Wo_2(var0);
   }

   public static com.Wo_2 r(JComponent var0, long var1) {
      I(var0);
      return new com.Wo_2(var0, var1);
   }

   public static com.Wo_2 s(JComponent var0, String var1, long var2) {
      I(var0);
      return new com.Wo_2(var0, var1, var2);
   }

   public static com.Wo_2 d(JComponent var0, long var1, long var3) {
      I(var0);
      return new com.Wo_2(var0, var1, var3);
   }

   public static com.Wo_2 Z(JComponent var0, String var1, long var2, long var4) {
      I(var0);
      return new com.Wo_2(var0, var1, var2, var4);
   }

   public static com.Wo_2 V(JComponent var0, long var1, ActionListener var3) {
      I(var0);
      return new com.Wo_2(var0, var1, var3);
   }

   public static com.Wo_2 H(JComponent var0, String var1, long var2, ActionListener var4) {
      I(var0);
      return new com.Wo_2(var0, var1, var2, var4);
   }

   public static com.Wo_2 J(JComponent var0, long var1, long var3, ActionListener var5) {
      I(var0);
      return new com.Wo_2(var0, var1, var3, var5);
   }

   public static com.Wo_2 Z(JComponent var0, String var1, long var2, long var4, ActionListener var6) {
      I(var0);
      return new com.Wo_2(var0, var1, var2, var4, var6);
   }

   public static void I(JComponent var0) {
      AncestorListener[] var2 = var0.getAncestorListeners();
      int var3 = var2.length;
      int[] var10000 = com.WC.V();
      int var4 = 0;
      int[] var1 = var10000;

      while (var4 < var3) {
         AncestorListener var5 = var2[var4];
         if (var1 == null) {
            if (var5 instanceof com.Wo_2) {
               var0.removeAncestorListener(var5);
            }

            var4++;
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public static boolean D(JComponent var0) {
      AncestorListener[] var2 = var0.getAncestorListeners();
      int[] var10000 = com.WC.V();
      int var3 = var2.length;
      int[] var1 = var10000;
      int var4 = 0;

      while (true) {
         if (var4 < var3) {
            AncestorListener var5 = var2[var4];
            if (var1 == null) {
               var6 = var5 instanceof com.Wo_2;
               if (var1 != null) {
                  break;
               }

               if (var6) {
                  return true;
               }

               var4++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var6 = false;
         break;
      }

      return var6;
   }
}





