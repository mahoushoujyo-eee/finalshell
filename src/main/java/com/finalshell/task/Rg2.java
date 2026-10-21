package com.finalshell.task;

import com.finalshell.core.SelectUploadFile;

public class Rg2 implements Runnable {
   final SelectUploadFile v;

   Rg2(SelectUploadFile var1) {
      this.v = var1;
   }

   @Override
   public void run() {
      this.v.H();
   }
}





