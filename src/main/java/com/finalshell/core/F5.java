package com.finalshell.core;

import java.awt.event.ActionEvent;

public class F5 implements O22_2 {
   final com.finalshell.ui.dialog.S3 L;

   F5(com.finalshell.ui.dialog.S3 var1) {
      this.L = var1;
   }

   @Override
   public void H(ActionEvent var1) {
      this.L.dispose();
   }

   @Override
   public void j(ActionEvent var1) {
   }

   @Override
   public void r(ActionEvent var1) {
      this.L.dispose();
   }
}





