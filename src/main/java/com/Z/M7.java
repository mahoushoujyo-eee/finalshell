package com.Z;

import com.pb_4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class M7 extends MouseAdapter {
   final com.CI v;
   final pb_4 H;
   final i_2 T;

   M7(i_2 var1, com.CI var2, pb_4 var3) {
      this.T = var1;
      this.v = var2;
      this.H = var3;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      this.T.f.a(this.v.getSelectedIndex());
      this.H.setVisible(false);
   }
}





