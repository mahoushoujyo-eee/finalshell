package com;

class QU implements Runnable {
   final String p;
   final com.Oj_2 Q;

   QU(com.Oj_2 var1, String var2) {
      this.Q = var1;
      this.p = var2;
   }

   @Override
   public void run() {
      this.Q.d.execute(new com.FC(this));
   }
}





