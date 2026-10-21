package com.finalshell.core;

import com.finalshell.ui.panel.Ky4;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceContext;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;

public class Pa2 extends DragSourceAdapter {
   Pa2() {
   }

   @Override
   public void dragEnter(DragSourceDragEvent var1) {
      this.c(var1);
   }

   protected void c(DragSourceDragEvent var1) {
      int var10000 = Rn2.Y();
      DragSourceContext var3 = var1.getDragSourceContext();
      Rn2.h = var3.getComponent();
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

                  if (!Rn2.c.containsKey(var9)) {
                     break label41;
                  }
               } catch (Throwable var13) {
                  throw a(var13);
               }

               try {
                  Rn2.b = var4.getTransferData(var9);
                  Rn2.F = (Up2)Rn2.c.get(var9);
                  Rn2.W = Rn2.F.u(Rn2.b, var1);
                  Rn2.f = OK3.P(var3.getComponent());
                  Rn2.f.u(Rn2.W, this.R(Rn2.f, var1));
                  break;
               } catch (Throwable var12) {
                  NE3.g(Rn2.class, var12);
               }
            }

            var8++;
         }

         if (var2 == 0) {
            break;
         }
      }

      try {
         if (Ky4.F$arrString() != null) {
            Rn2.i(++var2);
         }
      } catch (Throwable var11) {
         throw a(var11);
      }
   }

   @Override
   public void dragMouseMoved(DragSourceDragEvent var1) {
      int var10000 = Rn2.R();
      DragSourceContext var3 = var1.getDragSourceContext();
      int var2 = var10000;
      if (var3.getComponent() != Rn2.h) {
         this.c(var1);
      }

      if (Rn2.W != null) {
         com.finalshell.ui.panel.Qm2 var4 = OK3.P(var1.getDragSourceContext().getComponent());
         com.finalshell.ui.panel.Qm2 var5 = var4;
         if (var2 == 0) {
            if (var4 != Rn2.f) {
               Rn2.f.K();
               Rn2.f = var4;
            }

            var5 = Rn2.f;
         }

         var5.u(Rn2.W, this.R(Rn2.f, var1));
      }
   }

   public Point R(com.finalshell.ui.panel.Qm2 var1, DragSourceDragEvent var2) {
      Point var3 = FN.f$Point(var1);
      Point var4 = Rn2.F.e(Rn2.b, var2);
      return new Point(var3.x + var4.x, var3.y + var4.y);
   }

   @Override
   public void dragDropEnd(DragSourceDropEvent var1) {
      int var10000 = Rn2.Y();
      Rn2.h = null;
      int var2 = var10000;
      if (var2 != 0) {
         if (Rn2.W == null) {
            return;
         }

         Rn2.F.v(Rn2.b, var1);
         Rn2.f.K();
         Rn2.f = null;
         Rn2.b = null;
         Rn2.W = null;
      }

      Rn2.F = null;
   }

   public static Throwable a(Throwable var0) {
      return var0;
   }
}





