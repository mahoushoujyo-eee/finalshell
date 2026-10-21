package com.finalshell.task;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.DownloadProgressDialog;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JTextArea;

public class Up4 implements Runnable {
   public final String t;
   public final DownloadProgressDialog j;

   public Up4(DownloadProgressDialog var1, String var2) {
      this.j = var1;
      this.t = var2;
   }

   @Override
   public void run() {
      Object var1 = 462620683228684361L;
      Ref.g(462620683228684361L, var1);
      Object var3 = 494102270673182678L;
      JTextArea var10002 = (JTextArea)Ref.g(494102270673182678L, var3);
      StringBuilder var10003 = new StringBuilder();
      Object var5 = 132176917222937444L;
      var10003.append(this.append((String)Ref.g(132176917222937444L, var5)).append("\n").toString());
      Object var7 = 462620683228684361L;
      Ref.g(462620683228684361L, var7);
      Object var9 = 462620683228684361L;
      Ref.g(462620683228684361L, var9);
      Object var11 = 494102270673182678L;
      Object[] var10007 = Registry.packArgs(Ref.g(494102270673182678L, var11));
      long var14 = 485337826950019051L;
      Object[] var13 = var10007;
      Ref.h(485337826950019051L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object var15 = 462620683228684361L;
      Ref.g(462620683228684361L, var15);
      Object var17 = 494102270673182678L;
      JTextArea var10009 = (JTextArea)Ref.g(494102270673182678L, var17);
      Object var19 = 462620683228684361L;
      Object var10011 = Ref.g(462620683228684361L, var19);
      Object var21 = 494102270673182678L;
      var10011.setCaretPosition(((JTextArea)Ref.g(494102270673182678L, var21)).getDocument().getLength());
   }
}





