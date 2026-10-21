package com.finalshell.core;

import java.util.Date;

public class XN3 implements Pu4 {
   public final RS3 A;

   public XN3(RS3 var1) {
      this.A = var1;
   }

   @Override
   public void i(Date var1) {
      this.A.stopCellEditing();
   }
}





