package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.RouteTracePanel3;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class Mc2 implements MouseListener {
   final JLabel m;
   final Color x;
   final com.finalshell.ui.panel.W8 t;
   final Color e;
   final RouteTracePanel3 Z;

   Mc2(RouteTracePanel3 var1, JLabel var2, Color var3, com.finalshell.ui.panel.W8 var4, Color var5) {
      this.Z = var1;
      this.m = var2;
      this.x = var3;
      this.t = var4;
      this.e = var5;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 208309602693273010L;
      JLabel var10001 = (JLabel)Ref.g(208309602693273010L, var2);
      Object var4 = 445031052821050371L;
      this.setBackground((Color)Ref.g(445031052821050371L, var4));
      Object var6 = 162297733928999063L;
      com.finalshell.ui.panel.W8 var10003 = (com.finalshell.ui.panel.W8)Ref.g(162297733928999063L, var6);
      Object var8 = 445031052821050371L;
      this.setBackground((Color)Ref.g(445031052821050371L, var8));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var2 = 208309602693273010L;
      JLabel var10001 = (JLabel)Ref.g(208309602693273010L, var2);
      Object var4 = 483002961962271330L;
      this.setBackground((Color)Ref.g(483002961962271330L, var4));
      Object var6 = 162297733928999063L;
      com.finalshell.ui.panel.W8 var10003 = (com.finalshell.ui.panel.W8)Ref.g(162297733928999063L, var6);
      Object var8 = 483002961962271330L;
      this.setBackground((Color)Ref.g(483002961962271330L, var8));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 3) {
      }
   }
}





