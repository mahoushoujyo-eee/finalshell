package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.SendSyncMailPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class U9 implements ActionListener {
   final SendSyncMailPanel h;

   U9(SendSyncMailPanel var1) {
      this.h = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 311515060620064593L;
      Ref.g(311515060620064593L, var2);
      Object var4 = 279671605990384354L;
      ((JTextArea)Ref.g(279671605990384354L, var4)).setText("");
   }
}





