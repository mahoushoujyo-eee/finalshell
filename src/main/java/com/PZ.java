package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class PZ extends ButtonGroup {
   private final List j = new ArrayList(1);
   private boolean S = true;

   public PZ() {
   }

   public PZ(AbstractButton[] var1) {
      this.p(var1);
   }

   public PZ(List var1) {
      this.J(var1);
   }

   public PZ(boolean var1) {
      this.F(var1);
   }

   public boolean f() {
      return this.S;
   }

   public void F(boolean var1) {
      this.S = var1;
   }

   @Override
   public void setSelected(ButtonModel var1, boolean var2) {
      label25: {
         PZ var10000;
         label24: {
            label23: {
               int[] var3 = com.WC.V();
               if (var3 == null) {
                  if (!var2) {
                     var10000 = this;
                     if (var3 != null) {
                        break label24;
                     }

                     if (this.S) {
                        break label23;
                     }
                  }

                  super.setSelected(var1, var2);
               }

               if (var3 == null) {
                  break label25;
               }
            }

            var10000 = this;
         }

         var10000.clearSelection();
      }

      this.p();
   }

   public List L() {
      return com.aL.J((Collection)this.buttons);
   }

   public void V(nB_3 var1) {
      this.j.add(var1);
   }

   public void P(nB_3 var1) {
      this.j.remove(var1);
   }

   public void p() {
      int[] var10000 = com.WC.V();
      Iterator var2 = com.aL.J((Collection)this.j).iterator();
      int[] var1 = var10000;

      while (var2.hasNext()) {
         nB_3 var3 = (nB_3)var2.next();
         var3.z();
         if (var1 != null) {
            break;
         }
      }
   }

   public void p(AbstractButton[] var1) {
      int[] var10000 = com.WC.V();
      AbstractButton[] var3 = var1;
      int var4 = var1.length;
      int[] var2 = var10000;
      int var5 = 0;

      while (var5 < var4) {
         AbstractButton var6 = var3[var5];
         this.add(var6);
         var5++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void J(List var1) {
      int[] var10000 = com.WC.V();
      Iterator var3 = var1.iterator();
      int[] var2 = var10000;

      while (var3.hasNext()) {
         AbstractButton var4 = (AbstractButton)var3.next();
         this.add(var4);
         if (var2 != null) {
            break;
         }
      }
   }

   public static PZ h(AbstractButton[] var0) {
      return new PZ(var0);
   }

   public static PZ c(List var0) {
      return new PZ(var0);
   }
}





