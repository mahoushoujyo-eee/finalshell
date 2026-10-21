package com.finalshell.core;

import com.finalshell.reflect.Ref;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class U22 extends Authenticator {
   final String j;
   final String z;
   final com.finalshell.ui.panel.ZU Q;

   U22(com.finalshell.ui.panel.ZU var1, String var2, String var3) {
      this.Q = var1;
      this.j = var2;
      this.z = var3;
   }

   protected PasswordAuthentication getPasswordAuthentication() {
      Object var1 = 522655102270864719L;
      String var10003 = (String)Ref.g(522655102270864719L, var1);
      Object var3 = 423186633558396677L;
new U22(this, (String)Ref.g(423186633558396677L, var3));
      return this;
   }
}





