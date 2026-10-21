package com.finalshell.task;

import com.finalshell.core.CK;
import com.finalshell.core.SelectUploadFile;

public class XU3 implements Runnable {
   public final CK q;
   public final SelectUploadFile i;

   public XU3(SelectUploadFile var1, CK var2) {
      this.i = var1;
      this.q = var2;
   }

   @Override
   public void run() {
      this.q.K$void();
   }
}





