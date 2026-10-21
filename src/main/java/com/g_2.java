package com;

import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class g_2 extends TransferHandler {
   private String e;
   private boolean Z = true;

   public g_2(JComponent var1) {
      this(var1, null);
   }

   public g_2(JComponent var1, String var2) {
      this(var1, var2, true);
   }

   public g_2(JComponent var1, String var2, boolean var3) {
      int var10000 = EY.G();
      this.V(var2);
      int var4 = var10000;
      this.b(var3);
      var1.addMouseMotionListener(new com.aE(this, var1));
      if (var4 == 0) {
         com.ky_4.K(new String[5]);
      }
   }

   public String K() {
      return this.e;
   }

   public void V(String var1) {
      this.e = var1;
   }

   public boolean I() {
      return this.Z;
   }

   public void b(boolean var1) {
      this.Z = var1;
   }

   @Override
   public int getSourceActions(JComponent var1) {
      return 1;
   }

   @Override
   protected Transferable createTransferable(JComponent var1) {
      return new StringSelection(this.K());
   }
}





