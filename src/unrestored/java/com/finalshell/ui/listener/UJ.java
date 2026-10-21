package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.AcceleratePanel;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class UJ implements ActionListener {
   public final JFrame E;
   public final com.finalshell.ui.frame.MainFrame f;
   public final AcceleratePanel S;

   public UJ(AcceleratePanel var1, JFrame var2, com.finalshell.ui.frame.MainFrame var3) {
      this.S = var1;
      this.E = var2;
      this.f = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = SelectDownloadFolderPanel.O$arrint();
      Object var3 = 483503609442551270L;
      Object var10001 = (JFrame)Ref.g(483503609442551270L, var3);
      if (var2 == null) {
         if (!var10001.isVisible()) {
            Object var5 = 483503609442551270L;
            ((JFrame)Ref.g(483503609442551270L, var5)).pack();
            Object var7 = 483503609442551270L;
            JFrame var10003 = (JFrame)Ref.g(483503609442551270L, var7);
            Object var9 = 337283081855578108L;
            this.setLocationRelativeTo((com.finalshell.ui.frame.MainFrame)Ref.g(337283081855578108L, var9));
         }

         var10001 = this;
         Object var11 = 483503609442551270L;
         ((JFrame)Ref.g(483503609442551270L, var11)).setVisible(true);
         Object var13 = 483503609442551270L;
         JFrame var15 = (JFrame)Ref.g(483503609442551270L, var13);
      }

      var10001.toFront();
   }
}





