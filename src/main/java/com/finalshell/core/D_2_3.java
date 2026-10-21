package com.finalshell.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class D_2_3 implements T_4 {
   public final File T;

   public D_2_3(File var1) {
      this.T = var1;
   }

   @Override
   public URL T() throws IOException {
      return this.T.toURI().toURL();
   }

   @Override
   public final String o$String() {
      return this.T.toString();
   }

   @Override
   public final InputStream o$InputStream() throws IOException {
      return new FileInputStream(this.T);
   }

   @Override
   public final long z() {
      return this.T.lastModified();
   }

   public final File U() {
      return this.T;
   }

   @Override
   public final String toString() {
      return this.o$String();
   }
}





