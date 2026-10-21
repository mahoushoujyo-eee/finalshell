package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.Connection5;
import com.finalshell.ui.panel.RouteTracePanel2;
import com.finalshell.ui.panel.UV3;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;

public class Bt4 implements MouseListener {
   public final UV3 H;

   public Bt4(UV3 var1) {
      this.H = var1;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = com.finalshell.ui.panel.F8.y();
      Object var4 = 254650031326843112L;
      Ref.g(254650031326843112L, var4);
      Object var6 = 601581016628183308L;
      Connection5 var10002 = (Connection5)Ref.g(601581016628183308L, var6);
      if (var2 == null) {
         var10002.getSelectionModel().clearSelection();
         if (var1.getButton() != 3) {
            return;
         }

         Object var8 = 254650031326843112L;
         Ref.g(254650031326843112L, var8);
         Object var10 = 601581016628183308L;
         Connection5 var10004 = (Connection5)Ref.g(601581016628183308L, var10);
      }

      RouteTracePanel2 var10003 = (RouteTracePanel2)(Registry.emptyArgs());
      long var13 = 458516521755846832L;
      Object[] var12 = var10003;
      var10003 = Ref.h(458516521755846832L, var12, var13);

      try {
         var10003 = (RouteTracePanel2)var10003;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      RouteTracePanel2 var3 = var10003;
      var3.show((Component)var1.getSource(), var1.getX() + 1, var1.getY() + 1);
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





