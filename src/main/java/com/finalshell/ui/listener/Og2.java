package com.finalshell.ui.listener;

import com.finalshell.task.Cv2;
import com.finalshell.ui.panel.RouteTracePanel2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class Og2 implements ActionListener {
   public final RouteTracePanel2 R;

   public Og2(RouteTracePanel2 var1) {
      this.R = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      SwingUtilities.invokeLater(new Cv2(this));
   }
}





