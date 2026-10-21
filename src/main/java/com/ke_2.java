package com;

class Ke_2 implements Runnable {
   final String T;
   final com.Oj_2 j;

   Ke_2(com.Oj_2 var1, String var2) {
      this.j = var1;
      this.T = var2;
   }

   @Override
   public void run() {
      this.j.d.execute(new com.zA(this));
   }
}





