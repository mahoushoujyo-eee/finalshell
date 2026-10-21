package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.ui.panel.LogPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class UP3 implements ActionListener {
   final LogPanel Y;

   UP3(LogPanel var1) {
      this.Y = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object var2 = 333958510450862368L;
      Ref.g(333958510450862368L, var2);
      Object var4 = 544408036581651484L;
      ((JTextArea)Ref.g(544408036581651484L, var4)).setText("");
   }
}





