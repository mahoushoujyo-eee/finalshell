package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class De2 implements MouseListener {
   final JLabel E;
   final Color o;
   final com.finalshell.ui.panel.W8 n;
   final Color R;
   final SelectDownloadFolderPanel v;

   De2(SelectDownloadFolderPanel var1, JLabel var2, Color var3, com.finalshell.ui.panel.W8 var4, Color var5) {
      this.v = var1;
      this.E = var2;
      this.o = var3;
      this.n = var4;
      this.R = var5;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      Object var2 = 385868733796893978L;
      JLabel var10001 = (JLabel)Ref.g(385868733796893978L, var2);
      Object var4 = 508221385277235441L;
      this.setBackground((Color)Ref.g(508221385277235441L, var4));
      Object var6 = 624058539802525530L;
      com.finalshell.ui.panel.W8 var10003 = (com.finalshell.ui.panel.W8)Ref.g(624058539802525530L, var6);
      Object var8 = 508221385277235441L;
      this.setBackground((Color)Ref.g(508221385277235441L, var8));
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      Object var2 = 385868733796893978L;
      JLabel var10001 = (JLabel)Ref.g(385868733796893978L, var2);
      Object var4 = 324514963951660760L;
      this.setBackground((Color)Ref.g(324514963951660760L, var4));
      Object var6 = 624058539802525530L;
      com.finalshell.ui.panel.W8 var10003 = (com.finalshell.ui.panel.W8)Ref.g(624058539802525530L, var6);
      Object var8 = 324514963951660760L;
      this.setBackground((Color)Ref.g(324514963951660760L, var8));
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      if (var1.getButton() == 3) {
      }
   }
}





