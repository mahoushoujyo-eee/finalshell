package com.finalshell.core;

import com.finalshell.ui.panel.ConnectionProperty;
import java.awt.Rectangle;

public class EO implements E_2 {
   final ConnectionProperty J;

   EO(ConnectionProperty var1) {
      this.J = var1;
   }

   public Rectangle I() {
      return new Rectangle(0, 0, ConnectionProperty.j(this.J).getWidth(), ConnectionProperty.j(this.J).getHeight());
   }

   @Override
   public Object J() {
      return this.I();
   }
}





