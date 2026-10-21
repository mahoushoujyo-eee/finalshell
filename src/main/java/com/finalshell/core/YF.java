package com.finalshell.core;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class YF implements HostnameVerifier {
   YF() {
   }

   @Override
   public boolean verify(String var1, SSLSession var2) {
      return true;
   }
}





