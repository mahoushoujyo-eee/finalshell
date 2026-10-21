package com.finalshell.core;

import java.nio.ByteBuffer;

public class Em4 {
   public byte[] g;
   public int N;
   public int R;

   public ByteBuffer m() {
      ByteBuffer var1 = ByteBuffer.wrap(this.g);
      var1.limit(this.N);
      var1.position(this.R);
      return var1;
   }
}





