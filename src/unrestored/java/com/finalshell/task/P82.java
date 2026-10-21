package com.finalshell.task;

import com.finalshell.core.ZModemTransfer;
import com.finalshell.core.SelectUploadFile;
import java.io.File;
import java.io.IOException;

public class P82 implements Runnable {
   public final ZModemTransfer J;
   public final File p;
   public final SelectUploadFile l;

   public P82(SelectUploadFile var1, ZModemTransfer var2, File var3) {
      this.l = var1;
      this.J = var2;
      this.p = var3;
   }

   @Override
   public void run() {
      try {
         this.J.I(this.p);
      } catch (IOException var2) {
         var2.printStackTrace();
         this.l.s = false;
      }
   }
}





