package com.finalshell.ui.listener;

import com.finalshell.core.L1;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.ClearListDialog;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import org.jdesktop.swingx.JXList;

public class A8 implements MouseListener {
   final ClearListDialog U;

   A8(ClearListDialog var1) {
      this.U = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      Object var2;
      Object var10004;
      label59: {
         ClearListDialog.i$arrString();
         Object var6 = 550210732415152298L;
         Object var10002 = Ref.g(550210732415152298L, var6);
         Object var8 = 369475678680292668L;
         int var3 = ((JXList)Ref.g(369475678680292668L, var8)).getSelectedIndex();
         var2 = var10002;
         int var29 = var1.getButton();
         byte var10003 = 1;
         var10004 = var2;
         if (var2 == null) {
            if (var29 != 1) {
               return;
            }

            var29 = var3;
            if (var2 != null) {
               break label59;
            }

            var10003 = -1;
         }

         if (var29 <= var10003) {
            return;
         }

         Object var10 = 550210732415152298L;
         Ref.g(550210732415152298L, var10);
         Object var12 = 369475678680292668L;
         var10004 = ((JXList)Ref.g(369475678680292668L, var12)).convertIndexToModel(var3);
      }

      Object var4 = var10004;
      Object var14 = 550210732415152298L;
      Ref.g(550210732415152298L, var14);
      Object var16 = 627738372728753803L;
      Ref.g(627738372728753803L, var16);
      L1 var10007 = (L1)(Registry.packArgs((int)var4));
      long var19 = 430610060651646114L;
      Object[] var18 = var10007;
      var10007 = Ref.h(430610060651646114L, var18, var19);

      try {
         var10007 = (L1)var10007;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      L1 var5 = var10007;
      L1 var32 = var1.getButton();
      if (var2 == null) {
         if (var32 != 1) {
            return;
         }

         var32 = var5;
         String var10008 = Registry.emptyArgs();
         long var21 = 542058094445767607L;
         Object[] var20 = var10008;
         var10008 = Ref.h(542058094445767607L, var20, var21);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         var10008.endsWith("/");
      }

      if (var32 == 0) {
      }

      Object var22 = 550210732415152298L;
      Ref.g(550210732415152298L, var22);
      Object[] var10009 = Registry.packArgs(var5);
      long var25 = 345502075173010592L;
      Object[] var24 = var10009;
      Ref.h(345502075173010592L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
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





