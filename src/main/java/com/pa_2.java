package com;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;

class Pa_2 extends DragSourceAdapter {
   @Override
   public void dragEnter(DragSourceDragEvent var1) {
      this.c(var1);
   }

   protected void c(DragSourceDragEvent var1) {
      int var10000 = Rn_2.Y();
      DragSourceContext var3 = var1.getDragSourceContext();
      Rn_2.h = var3.getComponent();
      int var2 = var10000;
      Transferable var4 = var3.getTransferable();
      DataFlavor[] var5 = var4.getTransferDataFlavors();
      DataFlavor[] var6 = var5;
      int var7 = var5.length;
      int var8 = 0;

      while (var8 < var7) {
         DataFlavor var9 = var6[var8];

         label42: {
            label41: {
               try {
                  if (var2 == 0) {
                     break label42;
                  }

                  if (!Rn_2.c.containsKey(var9)) {
                     break label41;
                  }
               } catch (Throwable var13) {
                  throw a(var13);
               }

               try {
                  Rn_2.b = var4.getTransferData(var9);
                  Rn_2.F = (up_2)Rn_2.c.get(var9);
                  Rn_2.W = Rn_2.F.u(Rn_2.b, var1);
                  Rn_2.f = com.oK_3.P(var3.getComponent());
                  Rn_2.f.u(Rn_2.W, this.R(Rn_2.f, var1));
                  break;
               } catch (Throwable var12) {
                  nE_3.g(Rn_2.class, var12);
               }
            }

            var8++;
         }

         if (var2 == 0) {
            break;
         }
      }

      try {
         if (com.ky_4.F() != null) {
            Rn_2.i(++var2);
         }
      } catch (Throwable var11) {
         throw a(var11);
      }
   }

   @Override
   public void dragMouseMoved(DragSourceDragEvent var1) {
      int var10000 = Rn_2.R();
      DragSourceContext var3 = var1.getDragSourceContext();
      int var2 = var10000;
      if (var3.getComponent() != Rn_2.h) {
         this.c(var1);
      }

      if (Rn_2.W != null) {
         com.Qm_2 var4 = com.oK_3.P(var1.getDragSourceContext().getComponent());
         com.Qm_2 var5 = var4;
         if (var2 == 0) {
            if (var4 != Rn_2.f) {
               Rn_2.f.K();
               Rn_2.f = var4;
            }

            var5 = Rn_2.f;
         }

         var5.u(Rn_2.W, this.R(Rn_2.f, var1));
      }
   }

   public Point R(com.Qm_2 var1, DragSourceDragEvent var2) {
      Point var3 = com.FN.f(var1);
      Point var4 = Rn_2.F.e(Rn_2.b, var2);
      return new Point(var3.x + var4.x, var3.y + var4.y);
   }

   @Override
   public void dragDropEnd(DragSourceDropEvent var1) {
      int var10000 = Rn_2.Y();
      Rn_2.h = null;
      int var2 = var10000;
      if (var2 != 0) {
         if (Rn_2.W == null) {
            return;
         }

         Rn_2.F.v(Rn_2.b, var1);
         Rn_2.f.K();
         Rn_2.f = null;
         Rn_2.b = null;
         Rn_2.W = null;
      }

      Rn_2.F = null;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}





