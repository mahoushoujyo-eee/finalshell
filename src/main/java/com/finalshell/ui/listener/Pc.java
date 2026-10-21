package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.SelectDownloadFolderPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JLabel;

public class Pc implements ActionListener {
   final JLabel F;
   final Color U;
   final com.finalshell.ui.panel.W8 K;
   final String I;
   final SelectDownloadFolderPanel z;

   Pc(SelectDownloadFolderPanel var1, JLabel var2, Color var3, com.finalshell.ui.panel.W8 var4, String var5) {
      this.z = var1;
      this.F = var2;
      this.U = var3;
      this.K = var4;
      this.I = var5;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 266813260529737153L;
      JLabel var10001 = (JLabel)Ref.g(266813260529737153L, var2);
      Object var4 = 376475672846154025L;
      this.setBackground((Color)Ref.g(376475672846154025L, var4));
      Object var6 = 437054913838482762L;
      com.finalshell.ui.panel.W8 var10003 = (com.finalshell.ui.panel.W8)Ref.g(437054913838482762L, var6);
      Object var8 = 376475672846154025L;
      this.setBackground((Color)Ref.g(376475672846154025L, var8));
      Object var10 = 541906194858714572L;
      Registry.packArgs(Ref.g(541906194858714572L, var10));
      long var12 = 555473894912140963L;
      Ref.h2(555473894912140963L, var12);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }
}





