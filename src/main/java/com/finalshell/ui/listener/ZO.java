package com.finalshell.ui.listener;

import com.finalshell.core.L9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.RouteTraceAddressPanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class ZO implements MouseListener {
   public final String U;
   public final JLabel g;
   public final Color P;
   public final com.finalshell.ui.panel.W8 p;
   public final JPopupMenu w;
   public final RouteTraceAddressPanel u;

   public ZO(RouteTraceAddressPanel var1, String var2, JLabel var3, Color var4, com.finalshell.ui.panel.W8 var5, JPopupMenu var6) {
      this.u = var1;
      this.U = var2;
      this.g = var3;
      this.P = var4;
      this.p = var5;
      this.w = var6;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var2 = L9.X();
      if (var2 == null) {
         if (var1.getButton() != 1) {
            return;
         }

         Object var3 = 572657125606053081L;
         Ref.g(572657125606053081L, var3);
         Object var5 = 248665380297112060L;
         JTextField var10002 = (JTextField)Ref.g(248665380297112060L, var5);
         Object var7 = 411598179636948090L;
         this.setText((String)Ref.g(411598179636948090L, var7));
         Object var9 = 547158884885104846L;
         JLabel var10004 = (JLabel)Ref.g(547158884885104846L, var9);
         Object var11 = 159448385553585843L;
         this.setBackground((Color)Ref.g(159448385553585843L, var11));
         Object var13 = 217783752399713273L;
         com.finalshell.ui.panel.W8 var10006 = (com.finalshell.ui.panel.W8)Ref.g(217783752399713273L, var13);
         Object var15 = 159448385553585843L;
         this.setBackground((Color)Ref.g(159448385553585843L, var15));
         Object var17 = 173830265044925830L;
         ((JPopupMenu)Ref.g(173830265044925830L, var17)).setVisible(false);
      }

      Object var19 = 572657125606053081L;
      Ref.g(572657125606053081L, var19);
      Object[] var24 = Registry.packArgs(null);
      long var22 = 519002930381305189L;
      Object[] var21 = var24;
      Ref.h(519002930381305189L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }
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





