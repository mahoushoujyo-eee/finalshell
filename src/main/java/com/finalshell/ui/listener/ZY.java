package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.Connection5;
import com.finalshell.ui.panel.Tv2;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class ZY implements MouseMotionListener {
   final JButton g;
   final Tv2 G;

   ZY(Tv2 var1, JButton var2) {
      this.G = var1;
      this.g = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      Object var3 = 204373106762481439L;
      JButton var10001 = (JButton)Ref.g(204373106762481439L, var3);
      var1.getPoint();
      Object var5 = 334109740315771342L;
      Object var10004 = Ref.g(334109740315771342L, var5);
      Object var7 = 336078366828898497L;
      Point var2 = SwingUtilities.convertPoint(this, (Point)var10004, (Connection5)Ref.g(336078366828898497L, var7));
      Object var9 = 334109740315771342L;
      Ref.g(334109740315771342L, var9);
      Object var11 = 336078366828898497L;
      Connection5 var10005 = (Connection5)Ref.g(336078366828898497L, var11);
      MouseEvent var10007;
      Object var13 = 334109740315771342L;
      Object var10009 = Ref.g(334109740315771342L, var13);
      Object var15 = 336078366828898497L;
new ZY((Connection5)Ref.g(336078366828898497L, var15), var1.getID(), var1.getWhen(), var1.getModifiers(), var2.x, var2.y, var1.getClickCount(), var1.isPopupTrigger());









      var10007.dispatchEvent(this);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
   }
}





