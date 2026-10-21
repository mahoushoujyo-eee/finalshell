package com.finalshell.task;

import com.finalshell.core.ZModemTransfer;
import com.finalshell.core.SelectUploadFile;
import java.io.IOException;
import java.util.ArrayList;

public class Dw4 implements Runnable {
   public final ArrayList R;
   public final ZModemTransfer d;
   public final SelectUploadFile N;

   public Dw4(SelectUploadFile var1, ArrayList var2, ZModemTransfer var3) {
      this.N = var1;
      this.R = var2;
      this.d = var3;
   }

   @Override
   public void run() {
      try {
         String[] var1 = this.R.toArray(new String[this.R.size()]);
         this.d.d(var1);
      } catch (IOException var2) {
         this.N.s = false;
         var2.printStackTrace();
      }
   }
}





