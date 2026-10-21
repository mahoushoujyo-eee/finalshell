package com.finalshell.ui.listener;

import com.finalshell.core.LD3_2;
import com.finalshell.core.Yy2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Edit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Jh2 implements MouseListener {
   final com.finalshell.ui.model.C62 y;
   final Edit F;
   final Yy2 J;

   Jh2(Yy2 var1, com.finalshell.ui.model.C62 var2, Edit var3) {
      this.J = var1;
      this.y = var2;
      this.F = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Edit.t();
      Object var5 = 452820645423409010L;
      Object var3 = ((Yy2)Ref.g(452820645423409010L, var5)).rowAtPoint(var1.getPoint());
      Jh2 var10001 = var1.getButton();
      byte var10002 = 3;
      if (this == null) {
         label53: {
            if (var10001 == 3) {
               var10001 = this;
               Object var7 = 452820645423409010L;
               boolean var21 = ((Yy2)Ref.g(452820645423409010L, var7)).isRowSelected((int)var3);
               if (this != null) {
                  break label53;
               }

               if (!var21) {
                  Object var9 = 452820645423409010L;
                  ((Yy2)Ref.g(452820645423409010L, var9)).getSelectionModel().setSelectionInterval((int)var3, (int)var3);
               }
            }

            var10001 = var1.getButton();
         }

         var10002 = 1;
      }

      label58: {
         if (this == null) {
            if (var10001 != var10002) {
               return;
            }

            var10001 = var1.getClickCount();
            if (this != null) {
               break label58;
            }

            var10002 = 2;
         }

         if (var10001 != var10002) {
            return;
         }

         var10001 = (Jh2)var3;
      }

      if (var10001 != false) {
         Object var11 = 504554534303582134L;
         Ref.g(504554534303582134L, var11);
         LD3_2 var10003 = (LD3_2)(Registry.packArgs((int)var3));
         long var14 = 548405852497465390L;
         Object[] var13 = var10003;
         var10003 = Ref.h(548405852497465390L, var13, var14);

         try {
            var10003 = (LD3_2)var10003;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         LD3_2 var4 = var10003;
         Object var15 = 399758841572303115L;
         Ref.g(399758841572303115L, var15);
         Object[] var10005 = Registry.packArgs(var4);
         long var18 = 293809111816395161L;
         Object[] var17 = var10005;
         Ref.h(293809111816395161L, var17, var18);

         try {
            ;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }
}





