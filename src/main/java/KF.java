import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

class KF implements Runnable {
   final U I;
   private static final String a;

   KF(U var1) {
      this.I = var1;
   }

   @Override
   public void run() {
      Method var10000 = (Method)com.c.c(496137818179803296L).get(this);
      Object[] var10001 = com.c.a(com.c.c(496137818179803296L).get(this));
      Method var10003 = com.c.d(123003542455500783L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      ((JPanel)com.c.c(346229218997944282L).get(com.c.c(496137818179803296L).get(this)))
         .add((aE)com.c.c(132798821314429637L).get(com.c.c(496137818179803296L).get(this)), a);
      ((JSplitPane)com.c.c(467883177032167383L).get(com.c.c(496137818179803296L).get(this)))
         .setRightComponent((JPanel)com.c.c(346229218997944282L).get(com.c.c(496137818179803296L).get(this)));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "0H%~\u0014MY}\u0001mm\u000e\u0002\u0014?\r&x\u0013\u001a\u001akV3k\f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 61;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 61;
         var10006 = var0;
      } else {
         var6 = 61;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 61;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 122;
               break;
            case 1:
               var23 = 28;
               break;
            case 2:
               var23 = 124;
               break;
            case 3:
               var23 = 55;
               break;
            case 4:
               var23 = 65;
               break;
            case 5:
               var23 = 80;
               break;
            default:
               var23 = 94;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





