import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextArea;

class oE_3 implements Runnable {
   final String Z;
   final nq_2 U;
   private static final String a;

   oE_3(nq_2 var1, String var2) {
      this.U = var1;
      this.Z = var2;
   }

   @Override
   public void run() {
      ((JTextArea)com.c.c(407397985905936675L).get(com.c.c(549465658310609690L).get(this))).append((String)com.c.c(344632110714370227L).get(this) + "\n");
      Method var10000 = (Method)com.c.c(549465658310609690L).get(this);
      Object[] var10001 = com.c.a(com.c.c(407397985905936675L).get(com.c.c(549465658310609690L).get(this)));
      Method var10003 = com.c.d(537105238359129972L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      ((JTextArea)com.c.c(407397985905936675L).get(com.c.c(549465658310609690L).get(this)))
         .setCaretPosition(((JTextArea)com.c.c(407397985905936675L).get(com.c.c(549465658310609690L).get(this))).getDocument().getLength());
      if (((String)com.c.c(344632110714370227L).get(this)).startsWith(a)) {
         var10000 = (Method)com.c.c(388376917454860932L).get(null);
         var10001 = com.c.a(new QF(this));
         var10003 = com.c.d(434592463220957006L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var1) {
            throw var1.getTargetException();
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "厭缑寜戅".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 99;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 99;
         var10006 = var0;
      } else {
         var6 = 99;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 99;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 69;
               break;
            case 1:
               var23 = 91;
               break;
            case 2:
               var23 = 51;
               break;
            case 3:
               var23 = 118;
               break;
            case 4:
               var23 = 21;
               break;
            case 5:
               var23 = 106;
               break;
            default:
               var23 = 71;
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





