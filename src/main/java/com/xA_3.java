package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.EventObject;

public class xA_3 implements ActionListener, ItemListener, Serializable {
   protected Object j;
   final rt_4 p;

   protected xA_3(rt_4 var1) {
      this.p = var1;
   }

   public Object G() {
      return this.j;
   }

   public void y(Object var1) {
      this.j = var1;
   }

   public boolean T(EventObject var1) {
      int[] var2 = com.WC.V();
      EventObject var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return true;
         }

         var10000 = var1;
      }

      boolean var5 = var10000 instanceof ActionEvent;
      if (var2 == null) {
         if (var5) {
            return true;
         }

         var5 = var1 instanceof KeyEvent;
      }

      if (var2 == null) {
         if (var5) {
            KeyEvent var4 = (KeyEvent)var1;
            return GR.lR.J(var4);
         }

         var5 = var1 instanceof MouseEvent;
      }

      if (var2 == null) {
         if (var5) {
            MouseEvent var3 = (MouseEvent)var1;
            int var6 = this.p.B;
            if (var2 == null) {
               if (this.p.B < 0) {
                  return (boolean)0;
               }

               var6 = var3.getClickCount();
            }

            if (var2 != null) {
               return (boolean)var6;
            }

            if (var6 >= this.p.B) {
               return (boolean)1;
            }

            return (boolean)0;
         }

         var5 = false;
      }

      return var5;
   }

   public boolean P(EventObject var1) {
      return true;
   }

   public boolean p() {
      rt_4.H(this.p);
      return true;
   }

   public void a() {
      rt_4.u(this.p);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.p.stopCellEditing();
   }

   @Override
   public void itemStateChanged(ItemEvent var1) {
      this.p.stopCellEditing();
   }
}





