package com.finalshell.ui.listener;

import com.finalshell.task.Cv2;
import com.finalshell.ui.panel.ConnectionContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class Og2 implements ActionListener {
   public final ConnectionContextMenu R;

   public Og2(ConnectionContextMenu var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      SwingUtilities.invokeLater(new Cv2(this));
   }
}





