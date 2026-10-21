package com.finalshell.io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TC extends InputStreamReader {
   public TC(InputStream var1) {
      super(var1);
   }

   public TC(InputStream var1, String var2) throws UnsupportedEncodingException {
      super(var1, var2);
   }
}





